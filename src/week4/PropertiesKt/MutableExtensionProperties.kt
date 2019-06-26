package week4.PropertiesKt

/*
Mutable extension properties
 */
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

/*
The one without parenthesis when you call it a property. You can define mutable extension properties. Here, we define the mutable extension property lastChar on StringBuilder. It allow us to get or update the last character. You then can use it as a regular property with the concise syntax to access setChar that just assigns a value to a property.
 */
fun main(args: Array<String>) {
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb) // Kotlin!
}