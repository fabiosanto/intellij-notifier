package com.github.fabiosanto.intellijnotifier.listeners

import com.github.fabiosanto.intellijnotifier.MyBundle
import com.intellij.task.ProjectTaskContext
import com.intellij.task.ProjectTaskListener
import com.intellij.task.ProjectTaskManager

class MyProjectTaskListener : ProjectTaskListener {

    override fun started(context: ProjectTaskContext) {
        super.started(context)
        println(MyBundle.message("projectService", "started"))

    }

    override fun finished(result: ProjectTaskManager.Result) {
        super.finished(result)
        println(MyBundle.message("projectService", "finished"))
    }
}