class KClass() {

    data class User(var id: Int, var name: String)

    fun kotlinMethod() {
        println("Kotlin method invoked")
        val user = User(1, "sanya")
        println(user)
        println(user.toSuperString())
    }

    fun User.toSuperString() = "Kotlin User id = $id , name = $name "

}
