fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    var consecutives = 0
    val binaryString = Integer.toBinaryString(n)
    val seqOnes = binaryString.split("0")

    for (i in seqOnes) {
        if (i.length > consecutives) {
            consecutives = i.length
        }
    }
    println(consecutives)
}
