import java.util.Scanner;

public class solicitacaoDeNota {
  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    int primeiraNota = scanner.nextInt();

    System.out.print("Digite a segunda nota: ");
    int segundaNota = scanner.nextInt();

    System.out.print("Digite a terceira nota: ");
    int terceiraNota = scanner.nextInt();

    System.out.print("Digite a quarta nota: ");
    int quartaNota = scanner.nextInt();


    int resultado = (primeiraNota + segundaNota + terceiraNota + quartaNota)  / 4;

    System.out.println(resultado);

    if(resultado >=6){
      
      System.out.println("A média das notas é: " + resultado + " e você está aprovado!");
    }else if (resultado<= 6) {
      System.out.println("A média das notas é: " + resultado + " e você está REPROVADO!"); 
    }
  }
}
