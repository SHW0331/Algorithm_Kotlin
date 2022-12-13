
fun main() {
    var array = arrayOf<Int>(3, 5, 1, 2, 4)

    for(i in array) {
        for(j in array) {
            var temp:Int = i * j
            print(temp)
        }
    }
}