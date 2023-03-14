import java.util.*

fun main() {
    val (n, m, v) = readLine()!!.split(" ").map { it.toInt() }
    val graph = Array(n + 1) { mutableListOf<Int>() }
    repeat(m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        graph[a].add(b)
        graph[b].add(a)
    }
    graph.forEach { it.sort() }
    val visited = BooleanArray(n + 1)
    dfs(graph, visited, v)
    println()
    bfs(graph, visited, v)
}

fun dfs(graph: Array<out List<Int>>, visited: BooleanArray, v: Int) {
    visited[v] = true
    print("$v ")
    for (i in graph[v]) {
        if (!visited[i]) {
            dfs(graph, visited, i)
        }
    }
}

fun bfs(graph: Array<out List<Int>>, visited: BooleanArray, start: Int) {
    val queue: Queue<Int> = LinkedList<Int>()
    queue.offer(start)
    visited[start] = true
    while (queue.isNotEmpty()) {
        val v = queue.poll()
        print("$v ")
        for (i in graph[v]) {
            if (!visited[i]) {
                visited[i] = true
                queue.offer(i)
            }
        }
    }
}
