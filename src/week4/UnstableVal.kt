package week4

import kotlin.random.Random

/*
The main purpose of this task is to illustrate to you that the way to think of a property as something immutable, as an immutable property, that's wrong.
I've seen sometimes such confusion that people think of it as immutable and it can be really surprising that it's actually not.
It can return you different values, and that's why it's more convenient to think of a property as of 'val' property, as of a read-only property, and that's why we use these terms to avoid confusion.
It just means that you cannot reassign it. The corresponding property doesn't have a setter, but you can do whatever you want inside the corresponding getter for 'val’.
 */

val foo: Int
    get()
    {return  Random.nextInt(0, 100)}

fun main(args: Array<String>) {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}