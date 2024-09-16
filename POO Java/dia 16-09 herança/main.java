public class main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Titan", 5, "Pastor Alemão");
        Gato gato = new Gato("Tião", 3);

        cachorro.info();
        cachorro.emitirSom();
        cachorro.correr();

        gato.info();
        gato.emitirSom();
        gato.pular();
    }
}
