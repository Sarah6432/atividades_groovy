package org.example.GameTimer

class Partida {
    int horaInicial, minutoInicial
    int horaFinal, minutoFinal

    void calcularDuracao(){
        if(horaInicial<horaFinal && minutoInicial<minutoFinal){
            int horas = horaFinal - horaInicial
            int minutos = minutoFinal - minutoInicial
            println "O JOGO DUROU ${horas} HORAS E ${minutos} MINUTOS"
        }else if(horaInicial == horaFinal){
            int diferencaHoras = (horaInicial - horaFinal) + 1 * 24
            int diferencaMinutos = minutoInicial - minutoFinal
            println "O JOGO DUROU ${diferencaHoras} HORA(S) E ${diferencaMinutos} MINUTO(S)"
        }else if(minutoInicial>minutoFinal){
            int diferencaHoras = horaFinal - horaInicial
            int Minutos = (60 * diferencaHoras ) - 1
            println "O JOGO DUROU 0 HORA(S) E ${Minutos} MINUTOS"
        }
    }
}
