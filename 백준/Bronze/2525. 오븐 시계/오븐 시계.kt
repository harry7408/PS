fun main() {
    var (h,m) = readln().split(' ').map { it.toInt() }
    val time = readln().toInt()
    
    m+=time
    
    if(m>=60) {
        h+=(m/60)
        m%=60
    }
    if(h>=24) {
        h%=24
    }
    print("$h $m")
}