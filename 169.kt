fun main(): Int {

    var nums = intArrayOf(2,2,1,1,1,2,2)

    val mapOfValues = mutableMapOf<Int, Int>()

    for(value in nums){
        if(!mapOfValues.containsKey(value)){
            mapOfValues[value] = 1
        }
        else{
            mapOfValues[value] = mapOfValues[value]!! + 1
        }
    }

    val maxKey = mapOfValues.maxByOrNull { it.value }

    return (maxKey!!.key)

 }