package br.com.digitalhouse.olamundo

fun main(){
    println(analise(10,2,30,4))
}
fun analise(numA : Int, numB : Int, numC : Int, numD : Int ) : Boolean{
    return if ((numA > numC && numA > numD) || (numB > numC && numB > numD)) {
        true
    } else {
        false
    }
}
