package com.github.philippgatzkaswt.startwithgit.services

import com.intellij.openapi.project.Project
import com.github.philippgatzkaswt.startwithgit.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
