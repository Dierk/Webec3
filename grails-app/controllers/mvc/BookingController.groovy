package mvc

class BookingController {

    static scaffold = Booking

    def foo() {

        def msg = ""
        for ( name in request.getHeaderNames()) {
            msg += name + " "
        }
        msg += request.getHeader("user-agent")
        println msg

        render text: msg
    }
}
