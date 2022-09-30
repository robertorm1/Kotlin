/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
       fibu(15)
}
private fun fibu(num:Int){

        for (i in 1..num) {
            if (i % 15 == 0) println("FizzBuzz") //Multiplo de 3 y 5
            else if (i % 5 == 0) println("Buzz") //Multiplo de 5
            else if (i % 3 == 0) println("Fizz") //Multiplo de 3
            else println(i)
        }
}
