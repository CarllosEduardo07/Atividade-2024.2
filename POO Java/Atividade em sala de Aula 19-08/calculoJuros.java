
import java.util.Scanner;

public class calculoJuros {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Qual o valor do Emprestimo?");
      int valorEmprestimo = scanner.nextInt();
      
      System.out.println("Qual a taxa de juros?");
      int valorJuros = scanner.nextInt();


      System.out.println("Quer parcelar em quantos meses?");
      int quantosMeses = scanner.nextInt();

      scanner.close();

      double valorTotal = (valorEmprestimo * valorJuros * quantosMeses) / 100;

      System.out.println("O valor total da quantidade de juros é " + valorTotal);




      
  }
}
