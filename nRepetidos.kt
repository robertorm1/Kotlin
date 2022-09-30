/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {

        val arr = intArrayOf(8, 1, 3, 2, 4, 5, 6, 3, 2)
        val size = arr.size
        numRepetidos(arr,size)
}

private fun numRepetidos(arr:IntArray,size:Int) {
        var i: Int
        var j: Int
        var bandera = 0

        i = 0 //Valor inicial primer ciclo
        while (i < size - 1) {
            j = i + 1 //Valor inicial segundo ciclo
            while (j < size) {
                if (arr[i] == arr[j]) //println(arr[i] + " "); //Numeros repetidos
                    bandera++
                j++ //Incremento segundo ciclo
            }
            i++ //Incremento primer ciclo
        }
        println("Total de numeros que se repiten:$bandera")
}