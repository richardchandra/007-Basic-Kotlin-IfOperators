fun main(args: Array<String>) {
    //If expression
    //Used for conditional situation
    val score = 65
    val passingGrade = 75

    if(score > passingGrade){
        //Will run if condition is true
        println("PASS")
    }

    //If we want to add other conditions
    if(score > passingGrade){
        println("PASS")
    } else {
        println("FAIL")
    }

    //Multiple Condition
    if(score > passingGrade){
        println("PASS")
    } else if(score > 60){
        println("IN CONSIDERATION")
    } else {
        println("FAIL")
    }
}