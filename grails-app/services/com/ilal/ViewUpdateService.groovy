package com.ilal

import grails.gorm.transactions.Transactional

@Transactional
class ViewUpdateService {

    def updateViewData(){
        def viewData = ViewData.get(1) ?: new ViewData(id: 1)
        viewData.message = "Updated at: ${new Date()}"
        viewData.lastUpdated = new Date()
        viewData.save(flush: true)
        println("ViewData updated: ${viewData.message}")
    }
}
