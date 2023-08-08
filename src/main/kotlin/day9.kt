/*
 * Complete the 'factorial' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun factorial(n: Int): Int {
    if (n <= 0) {
        return 1
    } else {
        return n * factorial(n.dec())
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = factorial(n)

    println(result)
}
