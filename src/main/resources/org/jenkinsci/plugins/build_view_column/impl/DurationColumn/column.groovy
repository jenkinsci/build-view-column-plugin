package org.jenkinsci.plugins.build_view_column.impl.DurationColumn

import hudson.Util
import hudson.model.Job
import hudson.model.Run

if (run instanceof Run) {
    td(data:run.duration) {
        text(run.durationString)
    }
} else
if (job instanceof Job) {
    td(data:job.estimatedDuration) {
        text(Util.getTimeSpanString(job.estimatedDuration))
    }
} else {
    td()
}
