package lista1;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Leite";
        produto.quantidadeAtual = 16;

        produto.verificarReposicao();
    }
}
