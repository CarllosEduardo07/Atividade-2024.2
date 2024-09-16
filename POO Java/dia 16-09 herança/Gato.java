public class Gato extends Animal {

    // Super: serve para manda essas informações para a classe pai (Animal)
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    // overrride: quer dizer que estar sendo subscrevendo esse metodo na class pai
    @Override
    public void emitirSom() {
        System.out.println(" O gato estar Miando!");
    }

    public void pular() {
        System.out.println(nome + " O gato estar Pulando!");
    }

    @Override
    public void info() {
        System.out.println("Nome: " + nome + " idade: " + idade);
    }
}
