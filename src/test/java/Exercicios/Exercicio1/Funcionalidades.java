package Exercicios.Exercicio1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Funcionalidades {
    Produto sandalia = new Produto();

 public Funcionalidades(){

     //define um valor para a variavel nomeProduto
     sandalia.setNomeProdutoLuna("Sandália Infantil 33 Rosa");

     //define um valor para a variavel nomeProdutoCarrinho
     sandalia.setNomeProdutoCarrinho("Sandália Infantil 33 Roxo");

     //cria a listagem de categorias
     List<String> produtoCategoria = new ArrayList<>();
     produtoCategoria.add("feminino");
     produtoCategoria.add("masculino");
     produtoCategoria.add("infantil");
     produtoCategoria.add("idoso");

     //define que o valor da variavel categoria será um valor da listagem de categorias
     sandalia.setCategoria(produtoCategoria);

     //define o valor do produto
     sandalia.setprecoProdutoLuna( new BigDecimal("200.00"));

     //define o valor do desconto
     sandalia.setporcentagemDesconto(10);

     //define se o produto possui promoção
     sandalia.setPromocao(true);

     //cria a listagem de cores
     List<String> cores = new ArrayList<>();
     cores.add("AZUL");
     cores.add("VERMELHO");
     cores.add("PRETO");
     cores.add("VERDE");
     cores.add("AMARELO");

     sandalia.setCores(cores);
        }
    public void testeCategoriaExiste(String produtoCategorias) {
        switch (produtoCategorias) {
            case "feminino":
                System.out.println("TEST PASSED: Seu produto é da categoria feminino");
                break;
            case "masculino":
                System.out.println("TEST PASSED: Seu produto é da categoria casculino");
                break;
            case "infantil":
                System.out.println("TEST PASSED: Seu produto é da categoria infantil");
                break;
            case "idoso":
                System.out.println("TEST PASSED: Seu produto é da categoria idoso");
                break;
            default:
                System.out.println("TEST FAILED: categoria do produto não identificada");
        }
    }
    public void testeNomeProdutoPdpXCart() {
        String produtoPdp = sandalia.getNomeProdutoLuna();
        String produtoCarrinho = sandalia.getNomeProdutoCarrinho();
        if (produtoPdp.equals(produtoCarrinho)) {
            System.out.println("TEST PASSED: o nome do produto está igual na PDP e Carrinho");
        }
        else{
            System.out.println("TEST FAILED: o nome do produto está diferente na PDP e Carrinho");
        }
    }
    public void testeValorFinalProduto(){
        Boolean ispromocao = sandalia.getPromocao();
        Integer desconto = sandalia.getporcentagemDesconto();
        Double porcentagem = 0.01;

        BigDecimal valorTotal = sandalia.getprecoProdutoLuna();
        if (ispromocao == true) {
            //Transformando Integer desconto para multiplicar com Double(variavel do tipo real)
            porcentagem = porcentagem * desconto.doubleValue();
            System.out.println("desconto em porcentagem " + desconto);
            //Transformando Integer desconto para multiplicar um BigDecimal
            valorTotal = valorTotal.subtract(valorTotal.multiply(BigDecimal.valueOf(porcentagem.doubleValue())));
            System.out.println("TEST PASSED: O valor final do produto é:"+ valorTotal);
        }
        else{
            System.out.println("TEST FAILED: o produto não tem desconto");
        }
    }
    public void testaCorDisponivel(String cor){
        boolean achei =false;
        for (String tenisCor : sandalia.getCores()) {
            if(cor.equalsIgnoreCase(tenisCor)){
                achei =true;
            }
        }

        if (achei){
            System.out.println("Test PASSED :  Cor "+cor+" verificado é exibida como Disponivel` na pagina.");

        }else{
            System.out.println("Test FAILED : Cor "+cor+" verificado `NÃO` é exibida na pagina.");
        }
    }
}