public  class main {

  public static void main(String[] args) {
    
    Carro carro = new Carro("Carro1", "Vermelho","Fiat","PTQ5511");
    Bicicleta bike = new Bicicleta("Bike Cross", "Preta","MBX");
    Caminhao caminhao = new Caminhao("Caminhao 1011", "Cinza","Chevrolet", "PTT5588");

    carro.info();
    carro.buzina();

    bike.info();
    bike.pedalando();


      caminhao.info();
      caminhao.buzina();
      caminhao.bauCarga();

  }
}