package week4.PropertiesKt
/*
How many times “Calculating…”
will be printed?
2 times
 */


val String.medianChar
    get(): Char? {
        println("Calculating...")
        return getOrNull(length / 2)
    }
fun main(args: Array<String>) {
    val s = "abc"
    println(s.medianChar)
    println(s.medianChar)
}

/*
Of course, there are no optimizations. This extension property is compiled to the get medianChar static method with an extra parameter under the hood which is called Antes access.
There is no magic here. Extension properties are very similar to extension functions, but their only difference is the difference syntax.
 */