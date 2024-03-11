fun main(){

    val names = arrayOf("Mary","John","Emma")
    val heights = arrayOf(180,165,170)

    val mapPeople = mutableMapOf<Int, String>()
    var out = mutableListOf<String>()

    var count = 0
    while(count < names.size){
        mapPeople[heights[count]] = names[count]
        ++count
    }

    var heightsCopy = heights

    heightsCopy.sort()
    heightsCopy.reverse()

    for(height in heightsCopy){
        out.add(mapPeople[height]!!)
    }

    val ret = out.toTypedArray()
    return ret

}