package br.com.estudos.typesofresidence.test

import br.com.estudos.typesofresidence.templates.Address
import br.com.estudos.typesofresidence.templates.People
import br.com.estudos.typesofresidence.templates.SystemIntern

fun main() {

    val addressLeticia = Address(
        "Rua Nilton Crispim",
        777,
        "Jd Elvira",
        "Osasco",
        "00000-000",
        "Casa do norte"
    )

    val leticia = People(
        "Leticia Aperecida",
        "000.000.000",
        addressLeticia,
        10
    )

    val systemIntern = SystemIntern()
    systemIntern.toEnter(leticia, 10)



}