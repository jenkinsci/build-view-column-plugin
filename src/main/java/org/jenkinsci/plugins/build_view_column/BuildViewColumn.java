package org.jenkinsci.plugins.build_view_column;

import hudson.ExtensionPoint;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Job;
import hudson.model.Run;
import hudson.views.ListViewColumnDescriptor;
import org.kohsuke.stapler.export.Exported;

/**
 * Extension point for adding a column to a table rendering of {@link Run}s.
 *
 * <p>
 * This object must have the <tt>column.groovy</tt>. This view
 * is called for each cell of this column. The {@link Run} object
 * is passed in the "run" variable. The view should render
 * a &lt;td&gt; tag.
 *
 * <p>
 * The implementation should handle {@code run==null} situation gracefully
 * (for example by rendering an empty &lt;td&gt; tag.) As a special case of {@code run==null},
 * the caller of {@link BuildViewColumn} can pass in {@code job} that points
 * to a {@link Job} that represents a build that's yet to happen.
 * An implementation can choose to display something comparable in such a case.
 *
 * <p>
 * This object may have an additional <tt>columnHeader.groovy</tt>. The default column header
 * will render {@link #getColumnCaption()}.
 *
 * @author Kohsuke Kawaguchi
 * @since 1.279
 * @see ListViewColumnDescriptor
 */
public abstract class BuildViewColumn extends AbstractDescribableImpl<BuildViewColumn> implements ExtensionPoint {
    /**
     * Returns the name of the column that explains what this column means
     *
     * @return
     *      The convention is to use capitalization like "Foo Bar Zot".
     */
    @Exported
    public String getColumnCaption() {
        return getDescriptor().getDisplayName();
    }

    public BuildViewColumnDescriptor getDescriptor() {
        return (BuildViewColumnDescriptor)super.getDescriptor();
    }
}
