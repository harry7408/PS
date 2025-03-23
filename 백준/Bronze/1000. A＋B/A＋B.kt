import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val st  = StringTokenizer(br.readLine())

    val a = Integer.parseInt(st.nextToken())
    val b= Integer.parseInt(st.nextToken())

    println(a+b)
}