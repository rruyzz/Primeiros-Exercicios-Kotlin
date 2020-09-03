package br.com.digitalhouse.olamundo

fun main(){
    println(numerosPositivos())
     for(n: Int in numerosPositivos() ){
         println(n)
     }

}

fun numerosPositivos() : ArrayList<Int>{
    val numeros: ArrayList<Int> = arrayListOf()
    for(i in 0..100){
        numeros.add(i)
    }
    return numeros
}