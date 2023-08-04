

fun main(args: Array<String>) {
    val N = readLine()!!.trim().toInt()

    //odd
    if ( N % 2 == 1 ) {
        println("Weird")
    }
    //even < 5
    if ( N % 2 == 0 && N <= 5 && N >= 2) {
        println("Not Weird")
    }
    //even < 20
    if ( N % 2 == 0 && N >= 6 && N <= 20 ) {
        println("Weird")
    }
    //even > 20
    else if (N % 2==0 && N > 20){
        println("Not Weird")
    }
}
