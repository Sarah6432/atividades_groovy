package org.example

class Produto {
   String nome
   BigDecimal preco
   Integer quantidade

   Integer valorTotalEmEstoque(){
       return preco.toInteger() * quantidade
   }

}
