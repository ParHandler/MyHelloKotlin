package week4.OOP

open class A(val value: String) {
    init {
        value.length
    }
}

class B(value: String) : A(value)

fun main(args: Array<String>) {
    val b = B("a")
    println(b.value)
}