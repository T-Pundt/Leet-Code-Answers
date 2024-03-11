fun main(){
    var stones = "aAAbbbb"
    var jewels = "aA"

    var temp = 0
    val mapStones = mutableMapOf<Char, Int>()

    for(letters in stones){
        if(!mapStones.containsKey(letters)){
            mapStones.put(letters, 1)
        }
        else{
            mapStones[letters] = mapStones[letters]!! + 1
        }
    }

    for(letters in jewels){
        if(mapStones.containsKey(letters)){
            temp += mapStones[letters]!!
        }
    }

    println(temp)
}
