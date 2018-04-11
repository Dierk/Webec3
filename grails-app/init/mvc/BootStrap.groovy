package mvc

class BootStrap {

    def init = { servletContext ->

        Person dierk = new Person(firstName: "Dierk", lastName: "König")
            .save(failOnError:true)
        Person dieter = new Person(firstName: "Dieter", lastName: "Holz")
            .save(failOnError:true)
        Room bright = new Room(description: "1.331", capacity: 40,)
            .save(failOnError:true)
        new Booking(room: bright, booker: dieter,
                    day: new Date() + 1, timeslot: "Vormittag"
        ).save(failOnError:true)


    }
    def destroy = {
    }
}
