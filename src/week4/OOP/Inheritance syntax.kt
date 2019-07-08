package week4.OOP

/*
What will be printed?
1
2
0 - this one
 */
open class Parent1 {
    open val foo = 1
    init {
        println(foo)
    }
}

class Child1: Parent1(){
    override val foo = 2
}

fun main(args: Array<String>) {
    Child1()
}