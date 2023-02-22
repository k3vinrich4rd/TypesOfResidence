package br.com.estudos.typesofresidence.templates

data class People(
    val name: String = "",
    val cpf: String = "",
    val address: Address = Address(),
    val key: Int = 0

) {
    companion object CountPeople {
        var total = 0
            private set
    }
    init {
        CountPeople.total++
    }
}

