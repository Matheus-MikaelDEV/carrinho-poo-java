package maneger;

import model.produto.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    List<Produto> produtos = new ArrayList();

    private BigDecimal totalPrice = BigDecimal.valueOf(0.00);

    public void adicionarProduto(Produto produto) {
        for (Produto produto1 : produtos) {
            if (produto1.getNome().equalsIgnoreCase(produto.getNome())) {
                produto1.addQuantidade(1);
                return;
            }
        }
        produtos.add(produto);
    }

    public boolean listarProdutos() {
        if (produtos.isEmpty()) {
            return false;
        }
        for (Produto produto : produtos) {
            System.out.println(produto.getInfo());
        }
        return true;
    }

    public boolean removerProduto(String nome){
        if (produtos.isEmpty()) {
            return false;
        }
        return produtos.removeIf(produto1 -> produto1.getNome().equalsIgnoreCase(nome));
    }

    public boolean verTotalNoCarrinho() {
        if (produtos.isEmpty()) {
            return false;
        } else {
            for (Produto produto : produtos) {
                totalPrice = totalPrice.add(produto.getPreco().multiply(new BigDecimal(produto.getQuantidade())));
            }
            return true;
        }
    }

    public boolean notaFiscal() {
        if (produtos.isEmpty()) {
            return false;
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto.getInfo());
            }
            System.out.println(getTotalPrice());
            return true;
        }
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
}
