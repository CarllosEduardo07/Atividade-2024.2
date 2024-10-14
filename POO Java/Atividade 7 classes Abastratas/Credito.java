public class Credito extends FormaPagamento {
    @Override
    void cartaoCredito() {
        System.out.println("Pagando com Cartao de Credito");

    }

    @Override
    void cartaoDebito() {
    }
    @Override
    void dinheiro(){}
}
