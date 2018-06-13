package mvc

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration
import grails.transaction.*
import spock.lang.Specification

@Integration
class PersonSpec extends GebSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test creating a new user"() {

        when: "we go to the landing page of the application"
        go "/?lang=en"

        then: "we should see the title"
        title == "Welcome to Grails"

        when: "we click on the person controller"
        $("a", text:"mvc.PersonController").click()
        then:
        title == "Person List"
        when: "we click on create"
        $(".nav a.create").click()
        then: "we should be on the create page"
        title == "Create Person"
        when: "fill the form"
        $("form").firstName = "Jan"
        $("form").lastName  = "Sommer"
        $("#create").click()
        then: "should have been created"
        $("div[role='status']").text().contains("created")
    }
}
