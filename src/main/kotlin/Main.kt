fun main( ){

    oddnumbers()
    println(names(arrayOf("Stephanie","Brenda","Loise","Gau","Ian","Victoria","Janet","Rose")))
    party(4)
    party(12)
    party(20)

    (newline())
    println(sumDecimalElements(arrayOf(1, 2.0, "3", 4.5f, "5.5", 60.0,60.00,78.6)))
}
//Create a function that prints out all the odd numbers between 1 and 100
fun oddnumbers(){
    for(num in 1..100)
        if(num % 2!=0)
            println(num)
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun names(name:Array<String>):Int{
    var nameslonger= 0
    for (x in name) {
        if (x.length > 5) {
         nameslonger++
        }
    }
    return nameslonger

}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun party(age:Int){
    when(age){
        in 0..5->println("glass of milk")
        in 7..14->println("fanta orange")
        else->println("cocacola")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun newline(){
    for (number in 1..100)
        when {
            number% 3==0 &&number%5==0->println("FizzBuzz")
            number %3==0->println("Fizz")
            number%5==0->println("Buzz")
            else ->println(number)

        }
}//write a function that take in a mixed type of an array of
//// mixed types and returns the sum of all the decimals elements.
fun sumDecimalElements(input: Array<Any>): Double {
    var sum = 0.0
    for (item in input) {
        if (item is Double) {
            sum += item
        } else if (item is Float) {
            sum += item.toDouble()
        }
    }
    return sum
}
