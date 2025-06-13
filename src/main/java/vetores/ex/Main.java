package vetores.ex;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao Catálogo de Produtos!");
        System.out.println("Digite a quantidade de produtos a serem inseridas: ");
        int quantidadeDeProdutos = sc.nextInt();
        sc.nextLine();
        Produto[] produtos = new Produto[quantidadeDeProdutos];
        Catalogo catalogo = new Catalogo(produtos);

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite as informações do Produto " + (i + 1) + "#: " );
            System.out.println("Digite o nome do Produto: ");
            String nome = sc.nextLine();
            System.out.println("Digite o preço do Produto: ");
            double preco = sc.nextDouble();
            System.out.println("Digite a quantidade do Produto: ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            Produto newProduto = new Produto(nome, preco, quantidade);
            catalogo.adicionarProduto(newProduto);
        }

        System.out.println("Deseja buscar um Produto ou Imprimir: 1 - Buscar, 2 - Imprimir");
        int opcaoMenu = sc.nextInt();
        sc.nextLine();
        if (opcaoMenu == 1) {
            System.out.println("Digite o nome do Produto: ");
            String nome = sc.nextLine();
            Produto produto = catalogo.buscarPorNome(nome);
            if (produto == null) {
                System.out.println("Produto informado não existe!");
            } else {
                System.out.println(produto);
            }
        } else {
            catalogo.listarProdutos();
        }
        System.out.println("Até mais!");
    }
}
