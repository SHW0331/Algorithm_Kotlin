import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var (n, m) = br.readLine().split(' ').map { it.toInt() }
    var result: Int = 0

    // n(행) 만큼 반복
    for (i in 1..n) {
        var list = br.readLine().split(' ')

        // 카드에 적힌 숫자 정렬
        var sortList = list.sorted()

        // result 보다 첫 번째 값이 크다면 result에 저장
        if (result <= sortList[0].toInt()) {
            result = sortList[0].toInt()
        }
    }
    println(result)
}