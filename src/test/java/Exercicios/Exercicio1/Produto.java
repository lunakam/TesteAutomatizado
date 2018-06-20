package Exercicios.Exercicio1;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class Produto {
    private String nomeProduto;
    private String nomeProdutoCarrinho;
    private List<String> categoria = new ArrayList<>();
    private boolean promocao;
    private int porcentagemDesconto ;
    private BigDecimal precoProdutoLuna;
    private List<String> cores = new ArrayList<>();
    private List<Integer> tamanhos = new ArrayList<>();


    //declara o nome do produto
    public String getNomeProdutoLuna() {
        return nomeProduto;
    }

    public void setNomeProdutoLuna(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    //declara o nome do produto no carrinho
    public  String getNomeProdutoCarrinho(){
        return  nomeProdutoCarrinho;
    }

    public void setNomeProdutoCarrinho(String nomeProdutoCarrinho) {
        this.nomeProdutoCarrinho = nomeProdutoCarrinho;
    }

    //declara a categoria
    public List<String> getCategoria() { return categoria; }

    public void setCategoria(List<String> categoria) { this.categoria = categoria; }

    //declara se o produto Luna possui promoção
    public boolean getPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    //declarar o valor do produto
    public BigDecimal getprecoProdutoLuna() {
        return precoProdutoLuna;
    }

    public void setprecoProdutoLuna(BigDecimal precoProdutoLuna) {
        this.precoProdutoLuna = precoProdutoLuna;
    }

    //declarar a porcentagem do desconto
    public int getporcentagemDesconto() {
        return porcentagemDesconto;
    }

    public void setporcentagemDesconto(int porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }

    //declara a cor
    public List<String> getCores() { return cores; }

    public void setCores(List<String> cores) { this.cores = cores; }

}
