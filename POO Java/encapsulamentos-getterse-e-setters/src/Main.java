public class Main {
    public static void main(String[] args) {
    contaBancaria conta = new contaBancaria("Carlos Eduardo", 55555555, 1000 );

    conta.exibirInfo();
    conta.depositar(367.88);
    conta.exibirInfo();
    conta.sacar(355.67);
    conta.exibirInfo();
    }
}