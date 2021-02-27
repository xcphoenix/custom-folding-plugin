package com.github.phoenixxc.customfolding.services

import com.github.phoenixxc.customfolding.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
