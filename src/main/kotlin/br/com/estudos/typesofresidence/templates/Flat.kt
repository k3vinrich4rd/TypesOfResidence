package br.com.estudos.typesofresidence.templates

import java.awt.Color

class Flat(
    holder: People,
    address: Address,
    color: String,
    door: Boolean,
    windown: Boolean
) : Residence(
    holder = holder,
    address = address,
    color = color,
    door = door,
    windown = windown
) {
}