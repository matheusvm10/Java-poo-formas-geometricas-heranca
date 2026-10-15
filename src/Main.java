public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[2];
        formas[0] = new Retangulo("Retângulo", 5.0, 4.0);
        formas[1] = new Circulo("Círculo", 3.0);

        for (FormaGeometrica f : formas) {
            f.exibirInfo();
            System.out.println("----------------");
        }
    }
}