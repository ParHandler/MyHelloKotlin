fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() == true
    s2.isEmptyOrNull() == true

    val s3 = "   "
    if (s3.isEmptyOrNull() == false) println("OK")
}

fun String?.isEmptyOrNull(): Boolean {
    return this == null || this.isEmpty()
}