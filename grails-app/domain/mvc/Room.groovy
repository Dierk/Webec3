package mvc

class Room {
    String  description
    Integer capacity

    @Override
    String toString() {
        return description + " (" + capacity + ")"
    }
    static constraints = {
        description nullable:false
        capacity    nullable:true
    }
}
