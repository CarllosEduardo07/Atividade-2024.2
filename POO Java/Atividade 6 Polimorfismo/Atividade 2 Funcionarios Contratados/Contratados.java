public class Contratados extends Funcionarios {

    public Contratados(String nome, double salarioMensal) {
        super(nome, salarioMensal);
    }

    @Override
    public double calcularSalario() {
        // Contratados têm salário fixo mensal
        return salarioBase;
    }
}
