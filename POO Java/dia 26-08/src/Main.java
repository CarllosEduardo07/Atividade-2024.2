import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

                System.out.println("informe Seu peso?");
                float peso = scanner.nextFloat();

                System.out.println("informe Seu altura?");
                float altura = scanner.nextFloat();

                scanner.close();

        float imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Abaixo do peso " + imc);
        } else if ((imc >=18.5) && (imc <= 24.9)) {
            System.out.println("Peso normal " + imc);
        } else if((imc >=25) && (imc <= 29.9)){
            System.out.println("SobrePeso " + imc);
        } else if ((imc >=30) && (imc <= 34.99)) {
            System.out.println("Obesidade Grau I " + imc);
        }else if ((imc >=35) && (imc <= 39.99)){
            System.out.println("Obesidade grau II " + imc);
        }else {
            System.out.println("Obesidade grau III " + imc);
        }

    }
}