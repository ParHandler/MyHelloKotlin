package week3

fun String.lastChar()= this.get(this.length-1)
fun main(args: Array<String>) {
    "abc".lastChar().also {
        println(it)
    }
}
