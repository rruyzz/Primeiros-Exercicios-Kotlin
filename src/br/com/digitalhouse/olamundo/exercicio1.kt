package br.com.digitalhouse.olamundo

fun main(){
    println(maiorNumero(1, 2, 3))
}

fun maiorNumero(n1 : Int, n2: Int, n3: Int) : Int{


    return if (n1>n2 && n1>n3){
        n1
    } else if (n2 > n3){
        n2
    }else {
        n3
    }

}