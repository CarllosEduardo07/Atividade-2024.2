public class Debito extends FormaPagamento{

    @Override
    void cartaoCredito() {
        System.out.println("Voce estar pagando com Credito");
    }

    @Override
    void cartaoDebito(){
        System.out.println("Voce estar pagando com Debito");
    }
}
