package mvc

import grails.testing.mixin.integration.Integration
import grails.transaction.*

import geb.spock.*

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
class PersonSpec extends GebSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test Person list"() {
        when:"go to Person list in english"
            go '/person?lang=en'

        then:"We are on the person list view"
        	title == "Person List"
    }

    void "test Person create with drop-down"() {
        when:"go to Person list in english"
            go '/person/create?lang=de'

        then:"We are on the person list view"
        	title == "Person anlegen"

        when: "create from selection"
            $("option[value='Jan']").click()

            $("form").lastName = "Sommer"
            $("#create").click()

        then: "we should see Jan Sommer"
            title == "Person anzeigen"
            $("div.message").text().contains("wurde angelegt")
    }
}
