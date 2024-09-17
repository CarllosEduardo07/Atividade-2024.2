public class Carro extends  Veiculo{

  String marca;
  String placa;

  public Carro (String nome, String cor, String marca, String placa){
    super(nome, cor);
    this.marca = marca;
    this.placa = placa;
  }

  public void buzina(){
    System.out.println("O Carro estar Buzinando!");
  }
  @Override
  public void info() {
    System.out.println("Nome: " + nome + " cor: " + cor + " marca: " + marca + " placa: " + placa);
}



}
