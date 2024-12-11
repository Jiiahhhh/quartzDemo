package com.example

import com.ilal.ViewUpdateService

class ViewUpdateJob {
    ViewUpdateService viewUpdateService

    static triggers = {
        simple(name: 'viewUpdateTrigger', startDelay: 1000, repeatInterval: 5000)
    }

    def execute(){
        println("Executing ViewUpdateJob at: ${new Date()}")
        viewUpdateService.updateViewData()
    }
}
