public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos Eduardo", 6000, 1000);
        funcionario.imprimirInformacao();
        funcionario.calcularSalario(10);
        funcionario.imprimirInformacao();
    }
}