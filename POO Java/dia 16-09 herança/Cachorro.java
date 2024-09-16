public class Cachorro extends Animal {
    private String raca;

    // Super: serve para manda essas informações para a classe pai (Animal)
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    // overrride: quer dizer que estar sendo subscrevendo esse metodo na class pai
    @Override
    public void emitirSom() {
        System.out.println(" O cachorro estar latindo!");

    }
    public void correr() {
        System.out.println(nome + " O cachorro estar correndo. A raça dele é: " + raca);
    }

    @Override
    public void info() {
        System.out.println("Nome: " + nome + " idade: " + idade + " raca: " + raca);
    }

}


