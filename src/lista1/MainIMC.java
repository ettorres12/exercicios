package lista1;

public class MainIMC {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();

        paciente1.diagnosticar(85.0, 1.75);

        paciente1.diagnosticar(50.0, 1.55);

        paciente1.diagnosticar(200.0, 1.50);
    }
}
