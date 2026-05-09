/*9. Classe SistemaNotasUniversitarias
Crie uma classe Disciplina. O método resultadoFinal recebe duas notas e calcula a média. Se a
média for $\ge$ 7, "Aprovado". Se estiver entre 4 e 6.9, "Exame Final". Se for < 4, "Reprovado".
*/

package lista1;


public class Disciplina {

    public void resultadoFinal(double nota1, double nota2){
      double media = (nota1 + nota2)/2;
       if(media >= 7){
           System.out.println("Aprovado");
       } else if (media >= 4 && media <= 6.9) {
           System.out.println("Exame final");
       }else {
           System.out.println("Reprovado");
       }
    }

}
