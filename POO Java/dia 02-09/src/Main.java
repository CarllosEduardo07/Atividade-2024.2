public class Main {
    public static void main(String[] args) {
    Carro gol = new Carro("Hatch", "Branco", "PTQ1222", "5522aa1144ssdd8877", 2019);
        gol.imprimirInformacoes();
        gol.acelerar(112.7);
        gol.imprimirInformacoes();
        gol.frear(24.8);
        gol.imprimirInformacoes();
    }
}