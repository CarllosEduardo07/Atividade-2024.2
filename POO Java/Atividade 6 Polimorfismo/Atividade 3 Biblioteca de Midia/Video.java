public class Video extends BibliotecaDeMidia {
    private String frase;


    public Video(String frase) {
        this.frase = frase;
    }


    @Override
    public String reproduzir() {
        return frase;
    }
}
