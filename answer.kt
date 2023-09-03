fun main() {
    var n = readLine()!!.toInt()      //receive input Int
    var space = n-1                   //space num in for seg
    for(i in 1 until n+1){
        repeat(i,space)               //1 line represent
        space--                       //to next space num
        print("\n")                   //new line
    }
}

fun repeat(n:Int,space_num:Int){
    var count=1                             //print num
    var flag=0                              //flag of judge space display or num
    for(i in 0 until space_num+2*n-1){
        if(i<space_num){print(" ")}         //print space of front part
        else {
            print((count%10).toString())
            if(count==n){flag=1}
            if(flag==0){count++}
            else {count--}
        }
    }
}