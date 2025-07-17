package model.produto;

import entities.enums.Categorias;

import java.math.BigDecimal;

public class ProdutoFisico extends Produto{
    private BigDecimal frete;

    public ProdutoFisico(String nome, BigDecimal preco, Categorias categoria, int quantidade, BigDecimal frete) {
        super(nome, preco, categoria, quantidade);
        this.frete = frete;
    }

    @Override
    public String getInfo() {
        BigDecimal total = getPreco().multiply(new BigDecimal(getQuantidade()));
        total = total.add(frete);
        return getCategoria().toString() + " - " + getNome() + " - R$" + getPreco().toString() + " - Quantidade: " + getQuantidade() + " - Frete: R$" + frete.toString() + " - Total: R$" + total;
    }
}
