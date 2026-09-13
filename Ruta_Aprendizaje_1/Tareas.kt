//Tarea 1
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int,
)

//Tarea 2
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)


//Tarea 3

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String = "",
    val daypart: Daypart,
    val durationInMinutes: Int
)

fun main() {

    
    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )

    
    events.add(Event(title = "Go for a run", daypart = Daypart.EVENING, durationInMinutes = 20))

    
    println("Total events: ${events.size}")

    events.forEach {
        println(it)
    }
}



//Tarea 4

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String = "",
    val daypart: Daypart,
    val durationInMinutes: Int
)

fun main() {

    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )

    
    
    val shortEvents = events.filter {
        it.durationInMinutes < 60
    }

    
    println("Tienes ${shortEvents.size} eventos cortos.")
}

//Tarea 5

val groupedEvents = events.groupBy { it.daypart }
groupedEvents.forEach { (daypart, events) ->
    println("$daypart: ${events.size} events")
}


//Tarea 6

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String = "",
    val daypart: Daypart,
    val durationInMinutes: Int
)

fun main() {

    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )

    println("Last event of the day: ${events.last().title}")
}






//Tarea 7
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String = "",
    val daypart: Daypart,
    val durationInMinutes: Int
)


val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main() {

    val events = mutableListOf(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )

    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}

