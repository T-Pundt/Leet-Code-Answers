import java.util.ArrayDeque
class Solution {
    fun isValid(s: String): Boolean {
        

        var parString = s

        if(parString.length % 2 != 0){
            return false
        }
        
        val stack = ArrayDeque<String>()

        var firstChar = parString.substring(0,1)
        stack.addLast(firstChar)
        parString = parString.drop(1)


        while(parString.isNotEmpty())
        {
            var nextChar = parString.substring(0,1)
            parString = parString.drop(1)

            if(nextChar == ")"){
                if(stack.peekLast() == "("){
                    stack.removeLast()
                }
                else if(stack.peekLast() =="{" || stack.peekLast() == "["){
                    return false
                }
                else{
                    stack.addLast(nextChar)
                }
            }

            else if(nextChar == "}"){
                if(stack.peekLast() == "{"){
                    stack.removeLast()
                }
                else if(stack.peekLast() =="(" || stack.peekLast() == "["){
                    return false
                }
                else{
                    stack.addLast(nextChar)
                }
            }


            else if(nextChar == "]"){
                if(stack.peekLast() == "["){
                    stack.removeLast()
                }
                else if(stack.peekLast() =="{" || stack.peekLast() == "("){
                    return false
                }
                else{
                    stack.addLast(nextChar)
                }
            }
            
            else{
                stack.addLast(nextChar)
            }

        }

        if(stack.isNotEmpty()){
                return false
            }

        return true


    }
}