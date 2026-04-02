package org.example.GameTimer

class Main {
    static void main(String[] args) {
      Partida partida = new Partida(horaInicial: 7, horaFinal: 7, minutoInicial: 7, minutoFinal: 7)
      partida.calcularDuracao()
      Partida partida2 = new Partida(horaInicial: 7, horaFinal: 9, minutoInicial: 8, minutoFinal: 10)
      partida2.calcularDuracao()
      Partida partida3 = new Partida(horaInicial: 7, horaFinal: 8, minutoInicial: 10, minutoFinal: 9)
      partida3.calcularDuracao()
    }
}
