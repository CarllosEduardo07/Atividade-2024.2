import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario func = new Funcionario();
        
        System.out.print("Nome: ");
        func.nome = scanner.nextLine();

        System.out.print("Salario Bruto: ");
        func.salarioBruto = scanner.nextDouble();

        System.out.print("Imposto: ");
        func.imposto = scanner.nextDouble();

        System.out.println("\nFuncionario: " + func);

        System.out.print("\nQual a porcentagem para aumentar o salario? ");
        double porcentagem = scanner.nextDouble();
        func.aumentarSalario(porcentagem);

        System.out.println("\nDados atualizados: " + func);

        scanner.close();
    }
}
