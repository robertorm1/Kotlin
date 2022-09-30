fun main() {
    romanos()
}

 private fun romanos() {

        val unidades: String
        val decenas: String
        val centenas: String
        val millar: String

        println("Ingrese valor:")
        val numero = 1024
                
        //val numero1 = readLine()!!.toInt()

        //unidades
        val res: Int = numero % 10
        //decenas
        val ndecena: Int = numero / 10
        val res2 = ndecena % 10
        //centenas
        val ncentena: Int = numero / 100
        val res3 = ncentena % 10
        //millar
        val res4: Int = numero / 1000

      unidades =  when (res) {
             1-> "I"
             2-> "II"
             3-> "III"
             4-> "IV"
             5-> "V"
             6-> "VI"
             7-> "VII"
             8-> "VIII"
             9-> "IX"
             else -> ""
        }

        decenas= when (res2) {
            1 ->  "X"
            2 -> "XX"
            3 -> "XXX"
            4 ->  "XL"
            5 ->  "L"
            6 -> "LX"
            7 ->  "LXX"
            8 -> "LXXX"
            9 -> "XC"
            else -> ""
        }

        centenas=  when(res3) {
            1 -> "C"
            2 -> "CC"
            3 -> "CCC"
            4 -> "CD"
            5 -> "D"
            6 -> "DC"
            7 -> "DCC"
            8 -> "DCCC"
            9 -> "CM"
           else -> ""
    }

        millar = when (res4) {
            1 -> "M"
            2 -> "MM"
            3 -> "MMM"
            else -> ""
        }

        println("El equivalente en numero romano es:$millar$centenas$decenas$unidades");

}