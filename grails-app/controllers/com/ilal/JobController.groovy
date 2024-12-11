package com.ilal

import com.example.HelloJob

class JobController {
    HelloJob helloJob

    def triggerJob(){
        helloJob.execute()
        render("Job triggered manually!")
    }
}