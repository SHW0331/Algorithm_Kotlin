fun main() {
    var array = arrayOf<Int>(3, 5, 1, 2, 4)
    var summary:Int = 0

    for(i in array ) {
        summary += i
    }

    print(summary)
}