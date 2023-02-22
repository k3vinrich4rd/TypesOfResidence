package br.com.estudos.typesofresidence.templates

class SystemIntern {
    fun toEnter(people: Authenticated, key: Int) {
        if (people.authenticated(key)) {
            println("Seja bem vindo a sua residência")
        } else {
            println("Falha na autenticação")
        }
    }
}