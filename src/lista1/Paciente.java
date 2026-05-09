/* Classe CalculadoraIMC
Crie uma classe Paciente que armazene peso e altura. O método diagnosticar deve retornar a
classificação: Abaixo do peso (< 18.5), Peso normal (18.5-24.9), Sobrepeso (25-29.9) ou Obesidade
(≥ 30).
 Conceito: if-else if com intervalos numéricos*/

package lista1;

public class Paciente {

    public void diagnosticar(double peso, double altura){
        if(peso/ (altura*altura) < 18.5){
            System.out.println("Abaixo do peso");
        }else if (peso/ (altura*altura) >= 18.5 && peso/(altura*altura) <= 24.9){
            System.out.println("Peso normal");
        } else if (peso/ (altura*altura) >= 25 && peso/(altura*altura) <= 29.9) {
            System.out.println("Sobrepeso");
        }else {
            System.out.println("Obesidade");
        }
    }


}
