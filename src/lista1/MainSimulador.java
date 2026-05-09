package lista1;

public class MainSimulador {
    public static void main(String[] args) {
        SimuladorFinanceiro simuladorFinanceiro = new SimuladorFinanceiro();

        simuladorFinanceiro.analisarEmprestimo(100, 30);

        simuladorFinanceiro.analisarEmprestimo(100, 31);
    }
}
