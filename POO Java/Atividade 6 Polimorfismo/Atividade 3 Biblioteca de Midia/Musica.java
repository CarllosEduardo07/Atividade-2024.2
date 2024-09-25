public class Musica extends BibliotecaDeMidia {
    private String frase;


    public Musica(String frase) {
        this.frase = frase;
    }


    @Override
    public String reproduzir() {
        return frase;
    }
}
