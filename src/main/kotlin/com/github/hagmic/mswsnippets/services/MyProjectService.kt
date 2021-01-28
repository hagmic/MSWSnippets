package com.github.hagmic.mswsnippets.services

import com.github.hagmic.mswsnippets.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
