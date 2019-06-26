package week4.PropertiesKt
//Which property is calculated on each access?
interface User {
    val nickname: String
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)

    private fun getFacebookName(accountId: Int): String {
        return "accountId"
    }
}
// The nickname property with a custom getter in subscribingUser calculates the value each time you access it. The property in FacebookUser stores the value in a file. The property with a custom getter doesn't have the corresponding field.
class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}
interface Session {
    val user: User
}
/*
fun analyzeUserSession(session: Session) {
    if (session.user is FacebookUser) {
        /*
        The compiler shows you an arrow. It's impossible because this property has an open or custom getter. If a property has a custom getter, it's not safe to use it in a smart cast because the custom getter can return your new value on each access.
         */
        println(session.user.accountId)
    }
}
*/
fun analyzeUserSession(session: Session) {
    val user = session.user
    if (user is FacebookUser) {
        println(user.accountId)
    }
}

val String.lastIndex: Int
    get() = this.length - 1
val String.indices: IntRange
    get() = 0..lastIndex

fun main(args: Array<String>) {
    val s = "abc"
    println(s.lastIndex)
    println(s.indices)
    /*
    "abc".lastIndex // 2
    "abc".indices // 0..2
     */
}