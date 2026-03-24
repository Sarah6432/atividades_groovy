package org.exemple.Funcionario

class Funcionario {
    String nome
    String cargo
    BigDecimal salario

    @Override
    String toString() {
        return "Funcionário ${nome} trabalha com: ${cargo} e possui esse salario: ${salario}"
    }

   Double aumentarSalario(Double percentual){
     return salario * percentual/100 + salario
   }

}
