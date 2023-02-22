package br.com.estudos.typesofresidence.templates

interface Authenticated {
    fun authenticated(key: Int): Boolean
}