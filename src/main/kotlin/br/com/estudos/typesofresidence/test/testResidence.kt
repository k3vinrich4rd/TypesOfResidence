package br.com.estudos.typesofresidence.test

import br.com.estudos.typesofresidence.templates.Address
import br.com.estudos.typesofresidence.templates.Kitnet
import br.com.estudos.typesofresidence.templates.People

fun main() {

    val address = Address(
        "Rua eu não aguento mais",
        313,
        "Disney",
        "Osasco",
        "66666-666",
        "Do lado da casa do pateta",
    )

    val kevinRichard = People(
        "Kevin Richard",
        "111.111.111-11",
        address = address, 10
    )

    val kitnet = Kitnet(
        kevinRichard,
        color = "Black",
        doors = 1,
        windowns = 2,
        funiture = 10
    )





    println("\nInformações do proprietário da Kitnet: ")
    println("Nome do proprietário: ${kevinRichard.name}")
    println("Cpf do proprietário: ${kevinRichard.cpf}")
    println("Endereço do proprietário: ${address.publicPlace}")
    println("Chave do proprietário: ${kevinRichard.key}\n")

    println("Informações sobre a Kitnet: ")
    println("Nome do proprietário: ${kevinRichard.name}")
    println("Cor da residencia: ${kitnet.color}")
    println("Quantidade de janelas: ${kitnet.windowns}")
    println("Quantidade de portas: ${kitnet.funiture}")


}