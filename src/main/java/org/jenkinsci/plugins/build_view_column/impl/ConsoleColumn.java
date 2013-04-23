package org.jenkinsci.plugins.build_view_column.impl;

import hudson.Extension;
import org.jenkinsci.plugins.build_view_column.BuildViewColumn;
import org.jenkinsci.plugins.build_view_column.BuildViewColumnDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author Kohsuke Kawaguchi
 */
public class ConsoleColumn extends BuildViewColumn {
    @Override
    public String getColumnCaption() {
        return "Console Output";
    }

    @DataBoundConstructor
    public ConsoleColumn() {
    }

    @Extension
    public static class DescriptorImpl extends BuildViewColumnDescriptor {
        @Override
        public String getDisplayName() {
            return "Link to console output";
        }
    }
}
