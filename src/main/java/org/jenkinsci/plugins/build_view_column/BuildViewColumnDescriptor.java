package org.jenkinsci.plugins.build_view_column;

import hudson.DescriptorExtensionList;
import hudson.model.Descriptor;
import jenkins.model.Jenkins;

/**
 * @author Kohsuke Kawaguchi
 */
public abstract class BuildViewColumnDescriptor extends Descriptor<BuildViewColumn> {
    protected BuildViewColumnDescriptor(Class<? extends BuildViewColumn> clazz) {
        super(clazz);
    }

    protected BuildViewColumnDescriptor() {
    }

    public static DescriptorExtensionList<BuildViewColumn,BuildViewColumnDescriptor> all() {
        try{
            return Jenkins.getInstance().getDescriptorList(BuildViewColumn.class);
        } catch(NullPointerException ex){
            return DescriptorExtensionList.createDescriptorList(Jenkins.getInstance(), BuildViewColumn.class);
        }
    }
}
