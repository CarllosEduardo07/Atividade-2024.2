public class Funcionarios {
    protected String nome;
    protected double salarioBase; // Salário base, pode ser por hora ou mensal

    public Funcionarios(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return 0.0;
    }

    public String getNome() {
        return nome;
    }


}
