package br.com.estudos.typesofresidence.test

import br.com.estudos.typesofresidence.templates.*

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

    val flat = Flat(
        kevinRichard,
        "Red",
        1,
        1,
        5
    )

    println("\nInformações do proprietário da Kitnet: ")
    println("Nome do proprietário: ${kevinRichard.name}")
    println("Cpf do proprietário: ${kevinRichard.cpf}")
    println("Endereço do proprietário: ${address.publicPlace}")


    println("Informações sobre a Kitnet: ")
    println("Nome do proprietário: ${kevinRichard.name}")
    println("Cor da residencia: ${kitnet.color}")
    println("Quantidade de janelas: ${kitnet.windowns}")
    println("Quantidade de portas: ${kitnet.funiture}\n")

    println("Informações sobre a Kitnet: ")
    println("Nome do proprietário: ${kevinRichard.name}")
    println("Cor da residencia: ${flat.color}")
    println("Quantidade de janelas: ${flat.windowns}")
    println("Quantidade de portas: ${flat.funiture}\n")

    println("Acrescentando móveis a kitnet")
    kitnet.furnitureInTheResidence(10)
    println("Resultado: ${kitnet.funiture}\n")

    println("Doando móveis da kitnet para o flat")
    kitnet.donateMobilie(5, flat, 5)
    println("Resultado: ${kitnet.funiture}\n")

    println("Quantidade de móveis do flat depois da doação recebida")
    println("Resultado ${flat.funiture}\n")

    println("--------------------------------------\n")


    println("Acrescentando móveis ao flat")
    flat.furnitureInTheResidence(5)
    println("Resultado: ${flat.funiture}\n")

    println("Doando móveis do flat para o kitnet")
    flat.donateMobilie(1, kitnet, 5)
    println("Resultado: ${flat.funiture}\n")

    println("Quantidade de móveis da kitnet depois da doação recebida")
    println("Resultado ${kitnet.funiture}\n")

    println("Total de residências criadas ${Residence.total}")

}