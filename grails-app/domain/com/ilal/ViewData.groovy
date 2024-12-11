package com.ilal

class ViewData {
    String message
    Date lastUpdated

    static constraints = {
        message maxSize: 255
    }
}