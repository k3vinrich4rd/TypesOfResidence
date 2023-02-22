package br.com.estudos.typesofresidence.templates

class Cobertura(
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
    override fun donateMobilie(value: Int, destiny: Residence): Boolean {
        if (funiture >= value) { //Se a quantidade de móveis for maior ou igual que valor
            funiture -= value //Subtraia o valor da quantidade de moveis
            destiny.furnitureInTheResidence(value)//Use destiny para usar o comportamento de residence
            return true//E retorne true
        }
        return false//Caso contrário retorne false
    }
}