public class MeioPeriodo extends Funcionarios{
    private double horasTrabalhadasPorSemana;

    public MeioPeriodo(String nome, double salarioPorHora, double horasTrabalhadasPorSemana) {
        super(nome, salarioPorHora);
        this.horasTrabalhadasPorSemana = horasTrabalhadasPorSemana;
    }

    @Override
    public double calcularSalario() {
        // Considerando que o mês tem 4.33 semanas
        return salarioBase * horasTrabalhadasPorSemana * 4.33;
    }
}
