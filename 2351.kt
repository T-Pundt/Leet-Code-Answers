fun main(){
   val s = "abccbaacz"

    val mapS = mutableMapOf<Char, Int>()

    for(letters in s){
        if(mapS.containsKey(letters)){
            println(letters)
            return
        }
        else{
            mapS[letters] = 0
        }
    }
}
