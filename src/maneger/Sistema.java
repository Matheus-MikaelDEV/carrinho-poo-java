package maneger;

import model.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    List<Produto> produtos = new ArrayList();

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
}
