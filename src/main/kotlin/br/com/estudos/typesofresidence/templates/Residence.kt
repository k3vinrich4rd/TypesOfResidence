package br.com.estudos.typesofresidence.templates

abstract class Residence(
    val holder: People, //Propriétario
    val color: String, //Cor
    val doors: Int, //Porta
    val windowns: Int, //Janela
    var funiture: Int //Moveis

) {
    companion object CountResidences {
        var total = 0
            private set
    }

    init {
        CountResidences.total++
    }

    fun furnitureInTheResidence(value: Int) {
        if (value > 0) {
            this.funiture += value
        }
    }


}