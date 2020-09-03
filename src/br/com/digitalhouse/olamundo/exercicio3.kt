package br.com.digitalhouse.olamundo

fun main(){
    println(parImpar(12))

}
fun parImpar(num: Int): Boolean{
    return if(num%2 != 0) {
        false
    } else {
        true
    }
}