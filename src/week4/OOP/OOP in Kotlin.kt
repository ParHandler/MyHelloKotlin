package week4.OOP


/*
Initialization order. What will be printed?
1. child
2. child parent
+ 3. parent child
 */


open class Parent {
    init { print("parent ") }
}
class Child : Parent() {
    init { print("child ") }
}
fun main(args: Array<String>) {
    Child()
}

