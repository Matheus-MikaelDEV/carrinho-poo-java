package model.produto;

import entities.enums.Categorias;

import java.math.BigDecimal;

public class ProdutoDigital extends Produto{
    private String url;

    public ProdutoDigital(String nome, BigDecimal preco, Categorias categoria, int quantidade, String url) {
        super(nome, preco, categoria, quantidade);
        this.url = url;
    }

    @Override
    public String getInfo() {
        BigDecimal total = getPreco().multiply(new BigDecimal(getQuantidade()));
        return getCategoria().toString() + " - " + getNome() + " - R$" + getPreco().toString() + " - Quantidade: " + getQuantidade() + " - URL: " + url + " - Total: " + total;
    }
}
