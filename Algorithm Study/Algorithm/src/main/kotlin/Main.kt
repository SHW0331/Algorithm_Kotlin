import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    // 입력 함수 설정
    val br = BufferedReader(InputStreamReader(System.`in`))

    // 정점:N , 간선:M, 정점의 번호:V
    var (n, m, v) = br.readLine().split(' ').map { it.toInt() }

    // 간선이 연결하는 두 정점의 번호
    val linkArr = Array(m){ IntArray(2)}
    for(i in 0 until m) {
        val input = br.readLine().split(' ').map { it.toInt() }
        for(j in 0 until 2) {
            linkArr[i][j] = input[j]
        }
    }

    // 큐 생성
    var arr = mutableListOf<Int>(v)

    // 순서 결과
    var order = mutableListOf<Int>()

    // index 0번째 꺼내서 간선 추가하기
    for(i in 0 until n) {
        when {
            linkArr[v][0] > linkArr[v][1] -> {
                arr[0] = linkArr[v][0]
                order.add(v)
            }
        }
    }
    
}