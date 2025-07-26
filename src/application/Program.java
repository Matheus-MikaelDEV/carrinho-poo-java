package application;

import entities.enums.Categorias;
import maneger.Sistema;
import model.produto.Produto;
import model.produto.ProdutoDigital;
import model.produto.ProdutoFisico;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de adicionar produtos ao seu carrinho!");

        int opcao = 0;

        Sistema sistema = new Sistema();

        do {
            System.out.println("\nMenu:\n1 - Adicionar Produto\n2 - Remover Produto\n3 - Listar Produtos\n4 - Valor Total\n5 - Nota Fiscal\n6 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço do produto: ");
                    BigDecimal preco = sc.nextBigDecimal();
                    sc.nextLine();
                    System.out.print("Categoria do produto: ");
                    Categorias categorias = Categorias.valueOf(sc.nextLine().toUpperCase());
                    System.out.print("Quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Físico ou digital (f/d): ");
                    char tipo = sc.next().charAt(0);
                    sc.nextLine();

                    if (tipo == 'd') {
                        System.out.print("URL: ");
                        String url = sc.nextLine();

                        Produto produto = new ProdutoDigital(nome, preco, categorias, quantidade, url);
                        sistema.adicionarProduto(produto);
                    } else if (tipo == 'f') {
                        System.out.print("Frete: ");
                        BigDecimal frete = sc.nextBigDecimal();
                        sc.nextLine();

                        Produto produto = new ProdutoFisico(nome, preco, categorias, quantidade, frete);

                        sistema.adicionarProduto(produto);
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    System.out.print("Nome do produto a ser removido: ");
                    String nomeProduto = sc.nextLine();

                    if (sistema.removerProduto(nomeProduto)) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case 3:
                    if (sistema.listarProdutos()) {
                        System.out.print("Produtos do carrinho listados com sucesso!");
                    } else {
                        System.out.print("Falha ao listar os produtos do seu carrinho!");
                    }
                    break;
                case 4:
                    if (sistema.verTotalNoCarrinho()){
                        System.out.print("Valor total do carrinho: R$" + sistema.getTotalPrice());
                    } else {
                        System.out.print("Falha ao listar o valor total do seu carrinho!");
                    }
                    break;
                case 5:
                    if (sistema.notaFiscal()){
                        System.out.print("Nota fiscal gerada com sucesso!");
                    } else {
                        System.out.print("Falha ao gerar a nota fiscal!");
                    }
                    break;
                case 6:
                    System.out.print("Saindo...");
                    break;
                default:
                    System.out.println("Tente novamente...");
            }
        } while (opcao != 6);
    }
}
