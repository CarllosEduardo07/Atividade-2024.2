public class Bicicleta extends Veiculo{

  String marca;

  public Bicicleta (String nome, String cor, String marca){
    super(nome, cor);
    this.marca = marca;
  }

  public void pedalando(){
    System.out.println("Estou Pedando minha Bike");
  }
  @Override
  public void info() {
    System.out.println("Nome: " + nome + " cor: " + cor + " marca: " + marca );
}



}
