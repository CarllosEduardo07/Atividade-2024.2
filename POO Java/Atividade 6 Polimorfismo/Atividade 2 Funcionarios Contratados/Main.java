public class Main {

    public static void main(String[] args) {
    TempoIntegral f = new TempoIntegral("Carlos", 20, 40);
    MeioPeriodo Meio = new MeioPeriodo("Joao", 20, 40);
    Contratados contratdos = new Contratados("Pedro", 3000);

        System.out.println("Nome: " + f.getNome() + ", Salário: R$ " + f.calcularSalario());
        System.out.println("Nome: " + Meio.getNome() + ", Salário: R$ " + Meio.calcularSalario());
        System.out.println("Nome: " + contratdos.getNome() + ", Salário: R$ " + contratdos.calcularSalario());
    }
}
