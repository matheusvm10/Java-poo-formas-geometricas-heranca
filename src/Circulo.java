public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raio: " + this.raio);
    }
}
