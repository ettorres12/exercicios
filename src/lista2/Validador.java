/*5. Classe ValidadorEntrada
Desenvolva uma classe “Validador”. O método “pedirSenha” deve solicitar que o usuário
digite uma senha. Enquanto a senha for diferente de "1234", o sistema deve imprimir "Senha
incorreta, tente novamente" e ler a entrada novamente. */

package lista2;

import java.util.Scanner;

public class Validador {
    Scanner leitura = new Scanner(System.in);

    public void pedirSenha(){
        boolean acertou = false;

        while(!acertou){
            System.out.println("Digite sua senha");
            String senha = leitura.nextLine();

            if(!senha.equals("1234")){
                System.out.println("Senha incorreta, tente novamente");
            }else {
                acertou = true;
                System.out.println("Senha correta");
            }

        }

    }
}
