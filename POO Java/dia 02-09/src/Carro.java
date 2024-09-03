public class Carro {
    //Atributos
    private String modelo;
    private String cor;
    private String placa;
    private String chassi;
    private int anoFrabricacao;

    private double velocidade;

    //Construtor
    public Carro(String modelo, String cor, String placa, String chassi, int anoFrabricacao) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi  = chassi;
        this.anoFrabricacao = anoFrabricacao;

        velocidade = 0.0;
    }
    //metodos
    public void acelerar(double quantidade){
        System.out.println("acelerar");
        velocidade += quantidade;
    }
    //metodos
    public void frear(double quantidade){
        System.out.println("frear");
        velocidade -= quantidade;
    }

    public void imprimirInformacoes(){
        System.out.println("Modelo : "+ this.modelo);
        System.out.println("Cor : "+ this.cor);
        System.out.println("Placa : "+ this.placa);
        System.out.println("Chassi : "+ this.chassi);
        System.out.println("Ano de Fabricação : "+ this.anoFrabricacao);
    }





}
