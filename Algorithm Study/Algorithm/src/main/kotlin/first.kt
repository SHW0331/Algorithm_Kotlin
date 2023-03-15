import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    // 입력 함수 설정
    val br = BufferedReader(InputStreamReader(System.`in`))

    // 정점:N , 간선:M, 정점의 번호:V
    var (n, m, v) = br.readLine().split(' ').map { it.toInt() }

    // 간선이 연결하는 두 정점의 번호
    val linkArr = Array(m) { IntArray(2) }
    for (i in 0 until m) {
        val input = br.readLine().split(' ').map { it.toInt() }
        for (j in 0 until 2) {
            linkArr[i][j] = input.sorted()[j]
            /*
            ----- 1 ------
            4, 5, 1
            00  01 = 1 2   sorted
            10  11 = 1 3
            20  21 = 1 4
            30  31 = 2 4
            40  41 = 3 4

            arr[1][0] = 2
            arr[2][0] = 1


            ------ 2 ------
            00  01 = 5 4 --> 4 5
            10  11 = 5 2 --> 2 5
            20  21 = 1 2 --> 1 2
            30  31 = 3 4 --> 3 4
            40  41 = 3 1 --> 1 3
            */
        }
    }

    // 큐 생성
    var arr = mutableListOf<Int>(v)
    /*
    index 0번째 꺼내서 간선 추가하기
    1. 시작 정점에 해당하는 배열 index를 찾고 오름차순으로 정렬
    2. 큐, 순서 결과에 추가
    3. 두 번째 정점에서 이미 존재하는 정점 제외한 나머지 간선 찾고, 오름차순으로 정렬
    4. 큐, 순서 결과에 추가
    5. ... 반복
    */

    // 간선이 1개일 경우
    if (m == 1) {

        if (linkArr[0][0] == v) {
            println("${v} ${linkArr[0][1]}")
        } else {
            println("${v} ${linkArr[0][0]}")
        }


    }
    // 간선이 여러개 이상
    else {
        for (i in 0 until n) {
            if (i == 0) {
                var find = mutableListOf<Int>()
                for (j in 0 until m) {
                    if (arr[i] == linkArr[j][0]) {
                        find.add(linkArr[j][1])
                    } else if (arr[i] == linkArr[j][1]) {
                        find.add(linkArr[j][0])
                    }
                }
                arr += find.sorted().toMutableList()

            } else {
                var find = mutableListOf<Int>()
                for (j in 0 until m) {
                    if (arr[i] == linkArr[j][0]) {
                        if (arr.contains(linkArr[j][1])) {

                        } else {
                            find.add(linkArr[j][1])
                        }
                    } else if (arr[i] == linkArr[j][1]) {
                        if (arr.contains(linkArr[j][0])) {

                        } else {
                            find.add(linkArr[j][0])
                        }
                    }
                }
                arr += find.sorted().toMutableList()
            }
        }
        println(arr)

    }
}
