public class contaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public contaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    //buscando dados
    public String getValor() {
        return this.titular;
    }

    //salvando dados
    public void setTitular(String titular) {
        this.titular = titular;
    }


    //buscando dados
    public double getNumeroConta() {
        return this.numeroConta;
    }

    //salvando dados
    public void getNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    //consultar o saldo da conta
    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("deposito de R$ " + valor);
        } else {
            System.out.println("valor de deposito invalido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -=valor;
            System.out.println("saque de R$ " + valor);
        } else {
            System.out.println("saldo insuficiente!");
        }
    }

    public void exibirInfo() {
        System.out.println("titular: " + this.titular);
        System.out.println("Numero da Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }


}
