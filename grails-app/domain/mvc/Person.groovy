package mvc

class Person {

    String firstName
    String lastName

    String toString() {
        return getFirstName() + " " + getLastName();
    }

    static constraints = {
    }
}
