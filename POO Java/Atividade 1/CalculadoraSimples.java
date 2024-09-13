
import java.util.Scanner;


public class CalculadoraSimples {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Selecione alguma Operação");
    System.out.println("1 Soma \n2 Subtração \n3 Multiplicação \n4 Divisão");	
    int numeroFuncao = scanner.nextInt();

    System.out.println("Digite o Primeiro numero");
    int primeiroNumero = scanner.nextInt();
    System.out.println("Digite o Segundo numero");
    int segundoNumero = scanner.nextInt();

      scanner.close();

      if(numeroFuncao == 1){
        int total = primeiroNumero + segundoNumero;

        System.out.println("O total da soma é: " + total);

      }else if(numeroFuncao ==2){
        int total = primeiroNumero - segundoNumero;

        System.out.println("O total da Subtração é: " + total);
      } else if(numeroFuncao == 3){
        int total = primeiroNumero * segundoNumero;

        System.out.println("O total da Multiplicação é: " + total);
      } else if(numeroFuncao == 4){
        int total = primeiroNumero / segundoNumero;

        System.out.println("O total da Divisão é: " + total);

  }
}
}