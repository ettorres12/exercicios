package lista1;

public class MainClassificador {
    public static void main(String[] args) {
        ClassificadorTriangulo classificadorTriangulo = new ClassificadorTriangulo();

        classificadorTriangulo.lado1 = 2;
        classificadorTriangulo.lado2 = 5;
        classificadorTriangulo.lado3 = 5;

        classificadorTriangulo.tipoTriangulo();

        classificadorTriangulo.lado1 = 2;
        classificadorTriangulo.lado2 = 2;
        classificadorTriangulo.lado3 = 2;

        classificadorTriangulo.tipoTriangulo();

        classificadorTriangulo.lado1 = 2;
        classificadorTriangulo.lado2 = 3;
        classificadorTriangulo.lado3 = 5;

        classificadorTriangulo.tipoTriangulo();
    }
}
