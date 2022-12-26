import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    // n, m, k 각 공백으로 구분하여 입력받기
    var (n, m, k) = br.readLine().split(' ').map { it.toInt() }
    var list = br.readLine().split(' ') // n개 만큼 자연수 입력, 각 자연수는 공백으로 구분
    var sortList = list.sorted() // 입력받은 자연수 정렬

    var first: Int = sortList.last().toInt()
    var second: Int = sortList[sortList.size - 2].toInt()

    var count: Int = m / (k + 1) * k // 가장 큰 수가 등장하는 횟수
    count += m % (k + 1)

    var result: Int = 0
    result += count * first // 가장 큰 수 더하기
    result += (m - count) * second // 두 번째로 큰 수 더하기
    print(result)
}