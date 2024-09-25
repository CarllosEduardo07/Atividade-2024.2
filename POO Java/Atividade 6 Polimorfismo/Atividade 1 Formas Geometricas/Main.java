public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Quadrado quadrado = new Quadrado(4.0);
        Triangulos triangulo = new Triangulos(6.0, 8.0);

        System.out.println("Area do Circulo: " + circulo.calcularArea());
        System.out.println("Area do Quadrado: " + quadrado.calcularArea());
        System.out.println("Area do Triangulo: " + triangulo.calcularArea());


    }
}