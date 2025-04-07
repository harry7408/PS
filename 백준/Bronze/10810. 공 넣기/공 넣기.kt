fun main() {
    val (n,m) = readln().split(' ').map {it.toInt()}
    val arr = mutableListOf<Int>()
    
    for(a in 0 until n) {
        arr.add(a,0)
    }
    
    for(i in 1..m) {
        val (a,b,c) = readln().split(' ').map {it.toInt()}
        for(j in a-1 until b) {
            arr[j]=c
        }
    }
    
    arr.forEach {
        print("$it ")
    }
}