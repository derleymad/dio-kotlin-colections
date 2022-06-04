package com.dio.colections

fun main(){
    val values = IntArray(5)
    values[0] = 5
    values[1] = 4
    values[2] = 3
    values[3] = 2
    values[4] = 1

//    values.forEach{ //Pode ser usado sem descrever a variável, a padrão é it
//        println(it)
//    }
//    values.forEach{ individual -> // Descrevendo a variável
//        println(individual)
//    }
//    for (i in values.indices){ // Para cada indice
//        println(i) // 0,1,2,3,4
//    }
//    values.sort()
//    for (i in values){
//        println(i)
//    }
//    var array = intArrayOf(1,2,3,4,5)
//    array.forEach { println(it) }

//    val array =  Array(2) {""} // Posso declaras já com as chaves o "tipo" string
//    array[0] = "asd"
//    var array = arrayOf(1,2)
//    array.forEachIndexed{ indice, valor -> //For eacho index, da o valor e o index
//        array[indice] += 10
//        println(valor)
//    }
//    array.forEachIndexed{indice, valor -> //
//        println(valor)
//    }
    var array = doubleArrayOf(500.0, 1000.0, 2500.0)
    val salarioPAP= array.filter { it <= 500.0 }
    val salarioEstagio = array.filter { it == 1000.0 }
    val salarioJr = array.filter { it == 2500.0 }
    println("O salário PAP = $salarioPAP, o salário do Estágio é: $salarioEstagio, e o salario Jr é : $salarioJr")

    println(array.count { it in 500.0 .. 1000.0 })
    //Tb tem o find e o Any
}