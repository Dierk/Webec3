package mvc

class Booking {

    Room   room
    Person booker
    Date   day
    String timeslot

    static constraints = {
        room   nullable: false
        booker nullable: false
        day    nullable: false, min: new Date()
        timeslot inList: [
            "Vormittag",
            "Nachmittag 1",
            "Nachmittag 2",
        ]
    }
}
