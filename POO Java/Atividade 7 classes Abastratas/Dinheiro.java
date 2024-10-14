public class Dinheiro extends FormaPagamento {

    @Override
    void cartaoCredito() {
        
    }

    @Override
    void cartaoDebito() {

    }

    @Override
    void dinheiro() {
        System.out.println("pagando com Dinheiro");
    }
    
}
