package vetores.ex;

import java.util.Objects;

public class Catalogo {
    private final Produto[] produtos;

    public Catalogo(Produto[] produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = produto;
                return;
            }
        }
    }

    public Produto buscarPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }
}
