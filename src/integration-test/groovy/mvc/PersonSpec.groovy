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

    void "test Person crud"() {
        when:"go to Person list in english"
            go '/person?lang=en'

        then:"We are on the person list view"
        	title == "Person List"
    }
}
