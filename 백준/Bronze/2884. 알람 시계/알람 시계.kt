import java.util.*

fun main() {
    val st = StringTokenizer(readln())

    var h = st.nextToken().toInt()
    var m = st.nextToken().toInt()

    if (m >= 45) {
        m -= 45
    } else if (m < 45 && h == 0) {
        m = 60 + (m - 45)
        h = h-1+24;
    } else {
        m = 60 + (m - 45)
        h -= 1;
    }
    println("$h $m")
}