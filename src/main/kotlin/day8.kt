import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var entries = sc.nextInt()
    val phoneBook = mutableMapOf<String, String>()

    for (i in 1..entries) {
        val name = sc.next()
        val number = sc.next()
        phoneBook[name] = number
    }

    while (sc.hasNext()){
        val nameKey = sc.next()
        if (phoneBook.containsKey(nameKey)) {
            println("$nameKey=${phoneBook[nameKey]}")
        } else println("Not found")
    }
}
