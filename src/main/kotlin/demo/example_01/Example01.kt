package demo.example_01

fun main() {
    val users = mutableListOf<User>()
    users.add(User("sabbath"))
    users.addAll(Utils.listOfNullUser())
    users.filterNotNull()
    println(users[1].username)
}

data class User(val username: String)

