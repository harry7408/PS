fun main() {
    val (n,m) = readln().split(' ').map { it.toInt() }
    val arr = IntArray(n)
    
    for(k in 0 until n) arr[k]=k+1
    
    repeat(m) {
        val (i,j) = readln().split(' ').map {it.toInt()}
        arr.reverse(i-1,j)
    }
    
    arr.forEach{ print("$it ") }  
}