package br.com.estudos.typesofresidence.test

import br.com.estudos.typesofresidence.templates.Address
import br.com.estudos.typesofresidence.templates.People

fun main() {

    val addressKetelyn = Address(
        "Rua José Camargo",
        131,
        "Jd Santo Amaro",
        "Osasco",
        "00000-000",
        "Museu"
    )

    val addressKevin = Address(publicPlace = "Rua São João")

    val kevinRichard = People(
        "Kevin Richard",
        "000.000.000-00",
        addressKevin,
        51
    )

    val ketelynMayara = People(
        "Ketelyn Mayara",
        "111.111.111-11",
        addressKetelyn,
        10
    )

    println("\nInformações da holder: ")
    println("Nome do proprietário: ${ketelynMayara.name}")
    println("Cpf do proprietário: ${ketelynMayara.cpf}")
    println("Endereço do proprietário: ${ketelynMayara.address.publicPlace}")
    println("Chave do proprietário: ${ketelynMayara.key}\n")

    println("Informações do holder: ")
    println("Nome do proprietário: ${kevinRichard.name}")
    println("Cpf do proprietário: ${kevinRichard.cpf}")
    println("Endereço do proprietário: ${kevinRichard.address.publicPlace}")
    println("Chave do proprietário: ${kevinRichard.key}\n")

    println("Total de pessoas criadas ${People.total}")

}