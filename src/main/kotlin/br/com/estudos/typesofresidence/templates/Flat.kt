package br.com.estudos.typesofresidence.templates

import br.com.estudos.typesofresidence.exception.FailedAuthenticatedException
import br.com.estudos.typesofresidence.exception.InsufficienteFuniresException

class Flat(
    holder: People,
    color: String,
    doors: Int,
    windowns: Int,
    funiture: Int
) : Residence(
    holder = holder,
    color = color,
    doors = doors,
    windowns = windowns,
    funiture = funiture
), DonateMobile {
    override fun donateMobilie(value: Int, destiny: Residence, key: Int) {
        if (funiture < value) {
            throw InsufficienteFuniresException(
                message = """Error, insufficiente funiture
                Value avaible: $funiture
                Value requested: $value
            """.trimMargin()
            )
        } else if (!authenticated(key)) {
            throw FailedAuthenticatedException()
            //Se a quantidade de móveis for maior ou igual que valor
        }
        funiture -= value //Subtraia o valor da quantidade de moveis
        destiny.furnitureInTheResidence(value)//Use destiny para usar o comportamento de residence

    }

    //Delegação/Agregação
    //Isso nos permite deixar a responsabilidade de implementação para uma classe que já fez isso
    //Possibilitando a reutilização de código
    override fun authenticated(key: Int): Boolean {
        return holder.authenticated(key)
    }
}




