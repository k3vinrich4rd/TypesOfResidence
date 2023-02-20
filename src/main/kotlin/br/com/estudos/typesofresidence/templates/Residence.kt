package br.com.estudos.typesofresidence.templates

abstract class Residence(
    val holder: People, //Propriétario
    val address: Address, //Endereço
    val color: String, //Cor
    val door: Boolean, //Porta
    val windown: Boolean //Janela
) {
    companion object CountResidences {
        var total = 0
            private set
    }

    init {
        CountResidences.total++
    }
}