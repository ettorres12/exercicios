/*5. Classe ControleEstoque Crie uma classe Produto com atributos nome e quantidadeAtual.
O método verificarReposicao deve
exibir: "Estoque Crítico" (menos de 5 itens), "Estoque Baixo" (5 a 15 itens) ou "Estoque Ok" (mais de
15).*/
package lista1;

public class Produto {
    String nome;
    int quantidadeAtual;

    public void verificarReposicao(){
        if(quantidadeAtual < 5){
            System.out.println("Estoque critico");
        } else if (quantidadeAtual >= 5  && quantidadeAtual <= 15) {
            System.out.println("Estoque baixo");
        }else {
            System.out.println("Estoque OK");
        }
    }

}
