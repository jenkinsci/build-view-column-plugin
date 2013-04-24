package org.jenkinsci.plugins.build_view_column.impl.ConsoleColumn

import hudson.model.Run

td(style:"text-align:center") {
    if (run instanceof Run) {
        a(href:"$rootURL/${run.url}/console") {
            img(src:"$imagesURL/24x24/terminal.png")
        }
    }
}