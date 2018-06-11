package mvc

class Person {

    String firstName
    String lastName

    String toString() {
        return getFirstName() + " " + getLastName();
    }

    static constraints = {
        firstName inList:["Dierk","Dieter","Jan"]
    }
}
