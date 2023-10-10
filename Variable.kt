fun main() {
    // We can reassign var type
    var score = 5
    score = 10 // here you see that we can reassign score

    // We cannot reassign val type
    val message = "Hello World"
    message = "Ashik Iqbal" // here you see that we cannot reassign message

    println(message)
    println(score)

    //If you run this code (Kotlin: Val cannot be reassigned) this message will show in the output
}
