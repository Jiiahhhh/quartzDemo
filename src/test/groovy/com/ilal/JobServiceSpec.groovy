package com.ilal

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class JobServiceSpec extends Specification implements ServiceUnitTest<JobService> {

     void "test something"() {
        expect:
        service.doSomething()
     }
}
