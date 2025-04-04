fun main() {
    val N = readln().toInt()

    for (i in 1..N) {
        for (j in 1..N - i) {
            print(" ")
        }

        for (k in 1..i) {
            print("*")
        }

        println()
    }
}