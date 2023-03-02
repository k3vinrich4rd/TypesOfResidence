package br.com.estudos.typesofresidence.test

import br.com.estudos.typesofresidence.exception.FailedAuthenticatedException
import br.com.estudos.typesofresidence.exception.InsufficienteFuniresException
import br.com.estudos.typesofresidence.templates.Address
import br.com.estudos.typesofresidence.templates.Cobertura
import br.com.estudos.typesofresidence.templates.Flat
import br.com.estudos.typesofresidence.templates.People

fun main() {
    val cobertura = Cobertura(
        People(
            "Kevin Richard",
            "333.333.333-33",
            Address(
                "Rua Cassio Lucas",
                333,
                "Jd Vigor",
                "Osasco",
                "00000-000",
                "Casa"
            ),
            10
        ),
        "Blue",
        2,
        5,
        10
    )

    val addressEduardo = Address(
        "Rua teste",
        111,
        "Jd lucas",
        "Osasco",
        "00000-000",
        "Casa"
    )

    val eduardo = People(
        "Eduardo Candido",
        "111.111.111-11",
        addressEduardo,
        10
    )
    val flat = Flat(
        eduardo,
        "Black",
        2,
        5,
        0
    )

    cobertura.furnitureInTheResidence(10)
    println(cobertura.funiture)
    try {
        cobertura.donateMobilie(15, flat, 1)
        println("Doação bem sucedida")
    } catch (e: InsufficienteFuniresException) {
        println("Falha ao efetuar a doação")
        e.message
        e.printStackTrace()
    } catch (e: FailedAuthenticatedException) {
        println("Falha na autenticação")
        e.message
        e.printStackTrace()
    } catch (e: Exception) {
        println("Exception desconhecida")
        e.printStackTrace()
    }
}