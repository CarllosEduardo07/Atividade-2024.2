public class Funcionario {
    private String nome;
    private double salario;
    private double desconto;

    private double total;

    public Funcionario(String nome, double salario, double desconto) {
        this.nome = nome;
        this.salario = salario;
        this.desconto = desconto;
    }

    //metodos
    // metodos que retorna alguma coisa, sempre tem que ter o return
    public double calcularSalario(double porcentagem) {
        double salarioTotal = (this.salario - this.desconto);
        double acrescimo = ((salario * porcentagem) / 100);
        total = (salario + acrescimo);
        return total;
    }

    public void imprimirInformacao() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario Atualizado: " + (total > 0 ? total : (this.salario - this.desconto)));
    }
}
