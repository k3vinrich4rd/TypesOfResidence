package br.com.estudos.typesofresidence.templates

class Kitnet(
    holder: People,
    address: Address,
    color: String,
    door: Boolean,
    windown: Boolean
//Herança
) : Residence(
    holder = holder,
    address = address,
    color = color,
    door = door,
    windown = windown
) {
}