fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    var t = readLine()!!.trim().toInt()

    do {
        val test = readLine().toString()
        var even = ""
        var odd = ""
        test.forEachIndexed { index, c ->
            if (index % 2 == 0) {
                even += c
            }
        }
        test.forEachIndexed { index, c ->
            if (index % 2 == 1) {
                odd += c
            }
        }
        println("$even $odd")
        t--
    } while (t > 0)
}

