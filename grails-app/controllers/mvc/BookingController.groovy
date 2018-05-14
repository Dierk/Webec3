package mvc

class BookingController {

    static scaffold = Booking

    def foo() {
//        Person dierk = Person.findByFirstName("Dierk")
//        List<Booking> dierksBookings = Booking.findAllByBooker(dierk)
//        List<Room> rooms = []
//        for(Booking booking : dierksBookings) {
//            rooms.add(booking.getRoom())
//        }
//        def rooms = Booking.findAllByBooker(dierk)*.room

        Room one    = Room.findByDescription("6.2H03");
        def bookers = Booking.findAllByRoom(one)*.booker.unique()

        respond bookers
    }
}
