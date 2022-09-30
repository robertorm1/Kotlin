fun main() {
     val num1=100;
     val num2=2;
     division(num1,num2,0,num2);
}

private fun division(num1:Int, num2:Int, bandera:Int,suma:Int) {
        if (num2 == num1 && bandera == 0) {
            println(1)
        } else if (suma <= num1) {
            division(num1, num2, bandera + 1, suma + num2)
        } else{
            println("Division " + bandera)
        }
}