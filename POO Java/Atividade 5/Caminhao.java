public class Caminhao extends  Veiculo{

  String marca;
  String placa;

  public Caminhao (String nome, String cor, String marca, String placa){
    super(nome, cor);
    this.marca = marca;
    this.placa = placa;
  }

  public void buzina(){
    System.out.println("Caminhao estar Buzinando!");
  }
  public void bauCarga(){
    System.out.println("Meu Caminhao estar com muita Carga!");
  }

  @Override
  public void info() {
    System.out.println("Nome: " + nome + " cor: " + cor + " marca: " + marca + " placa: " + placa);
}



}
