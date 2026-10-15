public class FormaGeometrica {
    protected String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double calcularArea() {
        return 0.0;
    }

    public void exibirInfo() {
        System.out.println("Forma: " + this.nome);
        System.out.println("Área: " + calcularArea());
    }
}