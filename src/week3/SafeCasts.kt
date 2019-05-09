package week3
// This example can be further improved. You can replace type cast with a safe cast. Type cast as, throws an exception if the expression can't be cast, while safe cast as question mark returns null in this case.


fun <T> foo(any: T) {
    if (any is String) {
        any.toUpperCase()
    }
}

//The safe cast returns either the smart cast value or null as the result. If the value can be cast to the required type, then it is returned. Another way to express the same logic is to use if expression explicitly returning either the same expression or null.
fun <T> bar(any: T) {
    (any as? String)?.toUpperCase()
}

// Another way to express the same logic is to use if expression explicitly returning either the same expression or null.
fun <T> barTwo(any: T) {
    val s1  = if (any is String) any else null
    val s2: String? = any as? String
}

//Safe casts
//Type cast as throws ClassCastException, if the cast is unsuccessful.
//Safe cast as? returns null, if the cast is unsuccessful.
// Declare the s variable to make the first line print null and the second one throw an exception.
fun main(args: Array<String>) {
    val s = "abc"
    println(s as? Int)    // null
    println(s as Int?)    // exception
}
