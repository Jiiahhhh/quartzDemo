package com.ilal

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ViewDataSpec extends Specification implements DomainUnitTest<ViewData> {

     void "test domain constraints"() {
        when:
        ViewData domain = new ViewData()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
