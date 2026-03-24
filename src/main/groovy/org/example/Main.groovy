package org.example

static void main(String[] args) {
    Produto produto = new Produto(nome: 'Notebook', preco: 2000.00, quantidade: 3)
    Produto produto2 = new Produto(nome: 'Computador', preco: 3000.00, quantidade: 2)

    println produto.valorTotalEmEstoque()
    println produto2.valorTotalEmEstoque()
}