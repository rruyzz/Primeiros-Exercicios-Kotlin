package br.com.digitalhouse.olamundo

fun main(){
    println("Ola mundo!")
    println(mostrarMeuNome(sobrenome = "Ruiz", idade = 22))
    println("")
    println("")
    println("")
    println(alunosDeAndroid())

//    for (nome in 0 .. alunosDeAndroid().size){
//        println("Nome do aluno: ${alunosDeAndroid()[nome]}")
//    }

    for(nome in alunosDeAndroid()){
        println(nome)
    }

}

fun mostrarMeuNome(sobrenome : String, idade : Int) : String{

    val idadeRecebida = when(idade){
        18 -> "tem 18 anos"
        20 -> "tem 20 anos"
        30 -> "tem 30 anos"
        else -> "nao se sabe a idade"
    }

    return "Rodolfo $sobrenome e idade $idadeRecebida"
}
fun alunosDeAndroid(): ArrayList<String>{

    val listaAlunos = arrayListOf<String>()
    listaAlunos.add("Wagner")
    listaAlunos.add("Vitoria")
    listaAlunos.add("Joao")
    listaAlunos.add("Andre")


    return listaAlunos

}