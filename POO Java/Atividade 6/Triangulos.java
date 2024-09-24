public class Triangulos extends FormaGeometrica {
    private double base;
    private double altura;


    public Triangulos(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        return (base * altura) / 2;

    }
}