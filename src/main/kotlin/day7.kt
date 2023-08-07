fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    arr.reverse()
    arr.forEach {
        print(it)
        if (n > arr.indexOf(it)) {
            print(" ")
        }
    }
}
