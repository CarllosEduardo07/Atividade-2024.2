public class Carro implements Veiculos {

    @Override
    public void acelerar() {
        System.out.println("o carro estar acelerado");
    }

    @Override
    public void frear() {
        System.out.println("o carro estar freiando");
    }

    @Override
    public void buzinar() {
        System.out.println("o carro estar buzinando");
    }
}
