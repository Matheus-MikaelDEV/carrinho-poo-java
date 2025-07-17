package model.produto;

import entities.enums.Categorias;

import java.math.BigDecimal;

public abstract class Produto {
    private String nome;
    private BigDecimal preco;
    private Categorias categoria;
    private int quantidade;

    public Produto(String nome, BigDecimal preco, Categorias categoria, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int addQuantidade(int adicao) {
        return this.quantidade = getQuantidade() + adicao;
    }

    public abstract String getInfo();
}
