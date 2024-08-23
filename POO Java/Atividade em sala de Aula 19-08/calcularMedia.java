
import java.util.Scanner;

public class calcularMedia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Calculadora de media aritimetica");
        System.out.println("Digite o primeiro valor");
        int primeiroValor = scanner.nextInt();
        System.out.println("Digite o Segundo valor");
        int segundoValor = scanner.nextInt();
        System.out.println("Digite o Terceiro  valor");
        int terceiroValor = scanner.nextInt();

      double valorTotal = (primeiroValor + segundoValor + terceiroValor)  / 3;
      System.out.println("A soma dos Valores Aritimeticos é; " + valorTotal);

  }
}
