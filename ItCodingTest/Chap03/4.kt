// N이 1260일때
/*
fun main() {
    var coin:Int = 1260
    var result:Int = 0

    result = 1260 / 500 + 1260 % 500 / 100 + (1260 % 100) / 50 + (1260 % 50) / 10
    println("${coin}원일 때 거슬러 줘야 할 동전의 개수는 ${result}개 이다.")
}

 */

fun main() {
    var n:Int = 1260
    var count:Int = 0

    // 큰 단위의 화페부터 차례대로 확인
    val coinType:Array<Int> = arrayOf(500, 100, 50, 10)
    for(coin in coinType) {
        count += n / coin   // 해당 화폐로 거슬러 줄 수 있는 동전의 개수 세기
        n %= coin
    }

    println(count)
}