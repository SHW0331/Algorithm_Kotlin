import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

fun main() {
    // 입력 함수 설정
    var br = BufferedReader(InputStreamReader(System.`in`))

    // 정점: n, 간선: m, 시작 정점: v
    var (n, m, v) = br.readLine()!!.split(' ').map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }

    // 간선이 연결하는 두 정점 저장 ( m 크기 만큼 반복 )
    repeat(m) {
        val (a, b) = br.readLine()!!.split(' ').map { it.toInt() }

        // 정점에 연결되어 있는 간선 추가 -- index 0은 Null 값
        graph[a].add(b)
        graph[b].add(a)
    }
    // 정점에 연결되어 있는 간선 정렬
    graph.forEach { it.sort() }

    /*
    정점을 지나쳤는지 Boolean 값 반환
    index = 정점, index 0은 null 값이기 때문에 n + 1
     */
    val visited = BooleanArray(n + 1)

    // bfs 함수
    bfs(graph, visited, v)
}

fun dfs() {

}

fun bfs(graph: Array<List<Int>>, visited: BooleanArray, v: Int) {
    // bfs는 Queue를 사용, 따라서 Queue 선언
    val queue: Queue<MutableList<Int>> = LinkedList()

    /*
    Queue에서는 add 대신 offer 을 사용 ( offer은 null 반환)
    queue의 제네릭 타입을 Queue<MutableList<Int>>로 지정
     */
    queue.offer(mutableListOf(v))
    visited[v] = true

    while (queue.isNotEmpty()) {
        // poll은 queue의 첫 번째 값을 삭제하고 반환
        val start = queue.poll()
        print("$start ")

        //
        val find = mutableListOf<Int>()
        for (i in 1 until graph[v].size + 1) {
            var index: Int = graph[v][i]

            if (!visited[index]) {
                find.add(index)
                visited[index] = true
            }
        }
        queue.offer(find.sorted().toMutableList())
    }

}