import java.util.*

fun main() {
    val st=StringTokenizer(readln())

    val a=st.nextToken().toInt()
    val b=st.nextToken().toInt()

    if (a>b) println(">") else if (a<b) println("<") else println("==")
}