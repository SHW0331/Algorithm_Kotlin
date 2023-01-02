import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var (n, k) = br.readLine().split(' ').map { it.toInt() }
    var result: Int = 0
    var target: Int = 0

    while (true) {
        // N == K 로 나누어떨어지는 수가 될 때까지 1씩 빼기
        target = (n / k) * k
        result += (n - target)
        n = target

        // N이 K보다 작을 때(더 이상 나눌 수 없을 때) 반복문 탈출
        if (n < k) {
            break
        }
        // K로 나누기
        result += 1
        n /= k
    }
    // 마지막으로 남은 수에 대하여 1씩 빼기
    result += (n - 1)
    print(result)
}


/**
fun main() {
val br = BufferedReader(InputStreamReader(System.`in`))
var (n, k) = br.readLine().split(' ').map { it.toInt() }
var count: Int = 0

while (true) {

// n이 k로 나누어떨어질 때만 선택
if (n % k == 0) {
n /= k
count++ // count 추가
} else {
// n이 1이면 break후 출력
if (n == 1) {
break
}
n -= 1
count++
}
}

print(count)
}

 */