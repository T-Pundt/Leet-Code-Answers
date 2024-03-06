fun main(){

    val s = "luffy is still joyboy"

    var temp = ""
    val mapOfString = mutableMapOf<Int, String>()

    s.trim()
    for(letter in s){
        if(letter.toString() == " "){
            if(temp.isNotEmpty()){
                mapOfString.put(mapOfString.size, temp)
            }
            temp = ""
        }
        else{
            temp += letter
        }

    }

    if(temp.isNotEmpty()){
        mapOfString.put(mapOfString.size, temp)
    }

    var last = mapOfString[mapOfString.size - 1]
    println(last)

}