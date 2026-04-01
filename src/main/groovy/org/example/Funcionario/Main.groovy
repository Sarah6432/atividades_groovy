package org.example.Funcionario

class Main {
    static void main(String[] args) {
      Funcionario funcionario = new Funcionario(nome: 'Julia', cargo: 'Atendente', salario: 2000)

        println funcionario.toString()
        println funcionario.aumentarSalario(10)
    }
}
