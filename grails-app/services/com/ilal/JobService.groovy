package com.ilal

import groovy.transform.CompileStatic

@CompileStatic
class JobService {

    def performTask() {
        println("Task performed by Service at: ${new Date()}")
    }
}