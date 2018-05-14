package mvc

import grails.rest.Resource

@Resource(uri="/bookings")
class Booking {

    public static final String AM  = "Vormittag"
    public static final String PM1 = "Nachmittag 1"
    public static final String PM2 = "Nachmittag 2"

    Person booker
    Room   room
    Date   day
    String timeslot

    static constraints = {
        booker nullable: false
        room   nullable: false
        day    nullable: false, min: new Date().clearTime()
        timeslot inList: [AM, PM1, PM2]
    }
}
