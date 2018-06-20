package Exercicios.Exercicio1;

public class TesteDoProduto {
    public static void main(String[] args){

        Funcionalidades testeautomatizado = new Funcionalidades();

        testeautomatizado.testeCategoriaExiste("infantil");
        testeautomatizado.testeNomeProdutoPdpXCart();
        testeautomatizado.testeValorFinalProduto();
        testeautomatizado.testaCorDisponivel("ROSA");
    }
}
