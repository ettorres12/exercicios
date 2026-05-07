/*1. Classe SimuladorFinanciamento Crie uma classe que represente um simulador de crédito. O método analisarEmprestimo deve receber o valor do salário e o valor da parcela. Se a parcela for maior que 30% do salário
, o status deve ser "Negado"; caso contrário, "Aprovado".  Conceito: if-else e operadores aritméticos. */
package lista1;

public class SimuladorFinanceiro {
    public void analisarEmprestimo(double salario, double parcela){
        if(parcela > salario * 0.3){
            System.out.println("Negado");
        }else{
            System.out.println("Aprovado");
        }
    }

}
