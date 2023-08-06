fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    var i = 1
    var result = 0
   do {
       result = n * i
       println("$n x $i = $result")
       i++
   }while (i<=10)
}
