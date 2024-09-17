public class Veiculo {
  String nome;
  String cor;

  public Veiculo(String nome, String cor) {
    this.nome = nome;
    this.cor = cor;
  }

  public void info(){
    System.out.println("Nome: "+ nome );
    System.out.println("Cor: "+ cor );
  }
}
