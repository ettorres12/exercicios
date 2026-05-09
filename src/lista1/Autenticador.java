/* Classe ValidadorSenha
Desenvolva uma classe Autenticador. O método validar deve receber uma senha e verificar: se tem
menos de 8 caracteres (Senha Curta) ou se é igual a uma constante "12345" (Senha Insegura).
Caso contrário, "Senha Aceita". */

package lista1;

import java.util.Scanner;

public class Autenticador {
    Scanner leitura = new Scanner(System.in);

    public void validar(){

        System.out.println("Digite a senha");
        String senha = leitura.nextLine();

        if (senha.length() < 8) {
            System.out.println("Senha curta");
        } else if (senha.equals("12345")) {
            System.out.println("Senha insegura");
        } else {
            System.out.println("Senha aceita");
        }
    }

}
