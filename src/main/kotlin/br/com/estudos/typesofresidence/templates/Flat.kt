package br.com.estudos.typesofresidence.templates

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
    override fun donateMobilie(value: Int, destiny: Residence): Boolean{
        if (funiture >= value){
            funiture -= value
            destiny.furnitureInTheResidence(value)
            return true
        }
        return false
    }
}




