package org.example.PrevisaoTempo

class Main {
    static void main(String[] args) {
        PrevisaoTempo previsao = new PrevisaoTempo(temperaturasDaSemana: [25.5, 30.0, 18.2, 32.5, 27.0, 22.1, 24.8] as BigDecimal[])
        println previsao.temperaturaMaxima()
        println previsao.temperaturaMinima()
        println previsao.MediaTemperaturas()
    }
}
