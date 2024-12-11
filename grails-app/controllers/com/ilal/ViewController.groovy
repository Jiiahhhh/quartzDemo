package com.ilal

class ViewController {

    def index() {
        def viewData = ViewData.get(1)
        [viewData: viewData]
    }

    def fetchData() {
        def viewData = ViewData.get(1)
        if (!viewData) {
            render(contentType: 'application/json') {
                error = "No data available"
            }
        } else {
            render(contentType: 'application/json') {
                message viewData.message // Properti 'message' dari domain class
                lastUpdated viewData.lastUpdated?.toString() // Properti 'lastUpdated' dari domain class
            }
        }
    }
}