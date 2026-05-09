/*7. Classe DesenhoQuadrado
Implemente uma classe “Desenhista”. O método “desenharQuadrado” recebe um tamanho
“T”. O método deve imprimir uma matriz de asteriscos (“*”) de tamanho “T” x “T”. */

package lista2;

public class Desenhista {

    public void desenharQuadrado(int T){
        for(int i = 0; i < T; i++){
            for (int j = 0; j < T; j++){
                // uso somente do print para n quebrar linha
                System.out.print("* ");
            }
            //quebrar linha
            System.out.println();
        }

    }
}
