fun main() {

    // use of operator
    val i = 13
    val j = 2

    println("Sum is: "+(i+j))
    println("Subtraction is: "+(i-j))
    println("Multiplication is: "+(i*j))
    println("Division is: "+(i/j))

    /*
       output:
        Sum is: 15
        Subtraction is: 11
        Multiplication is: 26
        Division is: 6

     */

    // 13/2 is basically 6.5 but our output shows 6 because it is Integer data type to see 6.5 we have to typecast is to float or double data type
    // Typecast

    println("Division is: "+(i.toFloat()/j))
            //Division is: 6.5

    // To get remainder
    println("Remainder is: "+(i%j))
        //Remainder is: 1


    // Relational operators

    println(i>j)  // 13 > 2 true
    println(i<j)  // 13 < 2 false
    println(i<=j) // 13 <= 2 false
    println(i>=j) // 13 >= 2 true
    println(i==j) // 13 == 2 false
    println(i!=j) // 13 != 2 true


    // Increment and Decrement operator

    var x = 10

    // Post and Pre increment

    println("Post increment: "+x++) // 10
    println("After increment value of x: "+x) //11
    println("Pre increment: "+(++x)) //12

    // Post and Pre decrement

    println("Post decrement"+(x--)) //12
    println("After decrement value of x: "+x) //11
    println("Pre decrement: "+(--x)) //10

    // Logical operators

    val above70 = false
    val knownProgramming = true

    // && And
    var calledForInterview = above70 && knownProgramming
    println(calledForInterview) // False // if one of above70 and knownProgramming is false then output will be false


    // || OR

    calledForInterview = above70 || knownProgramming
    println(calledForInterview) // true // if one of above70 and knownProgramming is true then output will be true


    val answer = false
    val result = !answer

    println(result) // true

}