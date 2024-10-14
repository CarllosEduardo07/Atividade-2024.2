public class Main {
    public static void main(String[] args) {
        // class abstrata
        // Gato gato = new Gato();
        // gato.comer();
        // gato.fazerSom();
        // gato.dormi();

        // INTERFACE
        // interface é utilizado quando voce quer obrigar o usuario a escrever um metodo
        Carro carro = new Carro();

        carro.buzinar();
        carro.frear();
        carro.acelerar();
    }
}