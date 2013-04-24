package org.jenkinsci.plugins.build_view_column.impl;

import hudson.Extension;
import org.jenkinsci.plugins.build_view_column.BuildViewColumn;
import org.jenkinsci.plugins.build_view_column.BuildViewColumnDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Show the cause of the build.
 *
 * @author Kohsuke Kawaguchi
 */
public class CauseColumn extends BuildViewColumn {
    @Override
    public String getColumnCaption() {
        return "Cause";
    }

    @DataBoundConstructor
    public CauseColumn() {
    }

    @Extension
    public static class DescriptorImpl extends BuildViewColumnDescriptor {
        @Override
        public String getDisplayName() {
            return "Cause of the build";
        }
    }
}
