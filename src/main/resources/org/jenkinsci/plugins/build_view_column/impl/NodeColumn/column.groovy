package org.jenkinsci.plugins.build_view_column.impl.NodeColumn

import hudson.model.AbstractBuild

td {
    if (run instanceof AbstractBuild) {
        def n = run.builtOn?.toComputer();
        if (n!=null) {
            a(href:"$rootURL/${n.url}",class:"model-link inside") {
                img(src:"$imagesURL/16x16/${n.icon}", width:16, height:16, alt:n.iconAltText)
                text(n.displayName)
            }
        } else {
            // node no longer available
            text(run.builtOnStr)
        }
    }
}