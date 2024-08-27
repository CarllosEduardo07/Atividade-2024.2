import java.util.Scanner;

public class solicitacaoDeSenha {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int senha = 120598;
    
    System.out.print("Digite a senha: ");
    int senhaDigitada = scanner.nextInt();

      while(senhaDigitada != senha){
        System.out.println("senha Incorreta, digite novamente");
        senhaDigitada = scanner.nextInt();
        if(senhaDigitada ==senha){
          System.out.println("Senha correta!");
          break;
        }
      }
  }
}