import kotlin.math.max

fun main(args: Array<String>) {
    val arr = Array(6) { Array(6) { 0 } }

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ")
            .map { it.toInt() }.toTypedArray()
    }

    var maxHourGlass = Int.MIN_VALUE
    for (i in 0..3) {
        for (j in 0..3) {
            maxHourGlass =
                max( 
                    arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                            + arr[i + 1][j + 1]
                            + arr[i + 2][j] + arr[i + 2][j + 1]
                            + arr[i + 2][j + 2],
                    maxHourGlass
                )
        }
    }

    println(maxHourGlass)
}