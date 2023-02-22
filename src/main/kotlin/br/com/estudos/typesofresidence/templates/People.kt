package br.com.estudos.typesofresidence.templates

class People(
    val name: String = "",
    val cpf: String = "",
    val address: Address = Address(),
    val key: Int = 0

) : Authenticated {
    companion object CountPeople {
        var total = 0
            private set
    }

    init {
        CountPeople.total++
    }

    override fun authenticated(key: Int): Boolean {
        if (this.key == key) {
            return true
        }
        return false
    }
}

