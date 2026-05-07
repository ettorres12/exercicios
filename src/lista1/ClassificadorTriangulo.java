/*Classe ClassificadorTriangulo
Desenvolva uma classe Triangulo com atributos para os três lados. O método tipoTriangulo deve
verificar se os lados formam um triângulo válido e classificá-lo em: Equilátero, Isósceles ou
Escaleno.
 Conceito: if-else aninhado e condições lógicas.
*/

package lista1;

public class ClassificadorTriangulo {
    public double lado1;
    public double lado2;
    public double lado3;

    public void tipoTriangulo(){
        if(lado1 > 0 && lado2 > 0 && lado3 > 0){
            if(lado1 + lado2 > lado3 & lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
                if(lado1 == lado2 && lado2 == lado3){
                    System.out.println("Equilatero");
                } else if ((lado1 == lado2 && lado2 != lado3)  || (lado1 == lado3 && lado3 != lado2) 
                        || (lado2 == lado3 && lado2 != lado1 ) ) {
                    System.out.println("Isóceles");
                } else {
                    System.out.println("Escaleno");
                }
            }else{
                System.out.println("Não é possivel formar triangulo com esses valores");
            }
        } else {
            System.out.println("Não é um triangulo");
        }
    }
}
