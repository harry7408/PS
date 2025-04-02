import java.util.*

fun main() {
    val st = StringTokenizer(readln())

    val a = st.nextToken().toInt()

    when (a) {
        in 90..100 -> println("A")
        in 80..<90 -> println("B")
        in 70..<80 -> println("C")
        in 60..<70 -> println("D")
        else -> println("F")
    }
}