fun main() {
    val n = 1578943652
    var total = 0
    var number = n.toString()
    var stringOfNums = ""


    while(true) {
        for (nums in number) {

            var digitSquared = nums.toString().toInt()
            digitSquared *= digitSquared
            total += digitSquared
            number = total.toString()

        }

        if(total == 1)
        {
            println("Happy")
            return
        }


        val splitStringOfNumbers = stringOfNums.split(" ").map { it }

        for(testNum in splitStringOfNumbers)
        {
            if(total.toString() == testNum) {
                println("Not Happy")
                return
            }
        }
        stringOfNums += "$number "

        println(stringOfNums)
        total = 0
    }
}
