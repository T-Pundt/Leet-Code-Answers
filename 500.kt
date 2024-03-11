fun main(){

    val words = arrayOf("Hello","Alaska","Dad","Peace")

    var out = mutableListOf<String>()
    val firstRow = "qwertyuiop"
    val secondRow = "asdfghjkl"
    val thirdRow = "zxcvbnm"

    val mapKeyboard = mutableMapOf<Char, Int>()

    for(letter in firstRow){
        mapKeyboard[letter] = 1
        mapKeyboard[letter.toUpperCase()] = 1
    }
    for(letter in secondRow){
        mapKeyboard[letter] = 2
        mapKeyboard[letter.toUpperCase()] = 2
    }
    for(letter in thirdRow){
        mapKeyboard[letter] = 3
        mapKeyboard[letter.toUpperCase()] = 3
    }

    for(word in words){
        var row = mapKeyboard[word[0]]
        var bool = 1
        for(letter in word){
            if(mapKeyboard[letter] != row){
                bool = 0
                break
            }
        }
        if(bool == 1)
        {
            out.add(word)
        }
        else{
            bool = 0
        }
    }

    val ret = out.toTypedArray()
    return ret

}