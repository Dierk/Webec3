package mvc

class Person {

    String firstName
    String lastName

    String toString() {
        return firstName + " " + lastName
    }

    static constraints = {
        firstName nullable: false
        lastName  nullable: false
    }
}
