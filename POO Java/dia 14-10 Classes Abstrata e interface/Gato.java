public class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("gato fazendo Som");
    }

    @Override
    void comer() {
        System.out.println("gato se alimentando");
    }

    @Override
    void dormi() {
        System.out.println("gato estar dormindo");
    }
}
