package br.com.estudos.typesofresidence.exception

class FailedAuthenticatedException(
    message: String = "Authentication failed"
) : Exception(message) {
}