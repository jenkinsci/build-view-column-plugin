package org.jenkinsci.plugins.build_view_column.impl.ConsoleColumn

import hudson.model.Run

td {
    if (run instanceof Run) {
        a(href:"$rootURL/${run.url}/console") {
            img(src:"$imagesURL/24x24/terminal.png")
        }
    }
}