package com.example

import com.ilal.JobService

class HelloJob {
    JobService jobService

    static triggers = {
        simple name: 'simpleTrigger', startDelay: 1000, repeatInterval: 5000
    }

    def execute() {
        println "Hello Job executed at: ${new Date()}"
        jobService.performTask() // Panggil service
    }
}
