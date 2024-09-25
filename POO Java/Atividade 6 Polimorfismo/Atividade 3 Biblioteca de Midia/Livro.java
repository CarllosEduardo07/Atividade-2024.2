public class Livro extends BibliotecaDeMidia {
    private String frase;


    public Livro(String frase) {
        this.frase = frase;
    }


    @Override
    public String reproduzir() {
        return frase;
    }
}
