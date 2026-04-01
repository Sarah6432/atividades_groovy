package org.example.PrevisaoTempo

class PrevisaoTempo {

    BigDecimal[] temperaturasDaSemana

    BigDecimal temperaturaMaxima(){
       return temperaturasDaSemana.max()
    }

    BigDecimal temperaturaMinima(){
        return temperaturasDaSemana.min()
    }

    BigDecimal MediaTemperaturas(){
        return temperaturasDaSemana.sum() / temperaturasDaSemana.size()
    }
}
