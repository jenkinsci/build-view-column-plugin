package org.jenkinsci.plugins.build_view_column.impl.CauseColumn

import hudson.model.Run

td {
    if (run instanceof Run) {
        run.causes.each { cause ->
            div(cause.shortDescription)
        }
    }
}