public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica("Escutando musica!");
        Video video = new Video("Assitindo Video!");
        Livro livro = new Livro("Lendo um Livro!");

        System.out.println("Musica: "+ musica.reproduzir());
        System.out.println("Video: "+ video.reproduzir());
        System.out.println("Livro: "+ livro.reproduzir());
    }



}


