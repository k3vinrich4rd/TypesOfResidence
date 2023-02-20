package br.com.estudos.typesofresidence.templates

data class Address(
    var publicPlace: String = "",
    var number: Int = 0,
    var neighborhood: String = "",
    var city: String = "",
    var cep: String = "",
    var complement: String = ""
) {
}