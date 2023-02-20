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
        address = address,
        10
    )

    val kitnet = Kitnet(
        kevinRichard,
        address,
        "Black",
        door = true,
        windown = true
    )

    println("Informações da Kitnet")
    println("Nome do proprietário: ${kitnet.holder.name}")
    println("Cpf do proprietário: ${kitnet.holder.cpf}")
    println("Endereço do proprietário: ${kitnet.address}")
}