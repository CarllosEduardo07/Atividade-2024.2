public class Debito extends FormaPagamento{

    @Override
    void cartaoCredito() {
    }

    @Override
    void cartaoDebito(){
        System.out.println("Voce estar pagando com Debito");
    }
    @Override
    void dinheiro(){}
}
