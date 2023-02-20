package br.com.estudos.typesofresidence.templates

data class People(
    val name: String = "",
    val cpf: String = "",
    val address: Address = Address(),
    val key: Int = 0
) {
}