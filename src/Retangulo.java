public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Largura: " + this.largura);
        System.out.println("Altura: " + this.altura);
    }
}
