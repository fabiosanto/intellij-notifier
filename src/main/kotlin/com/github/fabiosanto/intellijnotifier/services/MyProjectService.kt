package com.github.fabiosanto.intellijnotifier.services

import com.intellij.openapi.project.Project
import com.github.fabiosanto.intellijnotifier.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
