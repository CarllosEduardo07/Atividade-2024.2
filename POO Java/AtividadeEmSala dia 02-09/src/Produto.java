public class Produto {
    private String nome;
    private double valor;

    private int quantidade;

    private double totalValorEmEstoque;

    //Construtor
    public Produto(String nome, double valor, int quantidade){
    this.nome = nome;
    this.valor = valor;
    this.quantidade = quantidade;

    totalValorEmEstoque = 0;
    }

public void adicionarProduto(int quantidade){
    System.out.println("Adicionando Produto");
    totalValorEmEstoque += quantidade;
}

public void removerProduto(int quantidade){
    System.out.println("Removendo Produto");
    totalValorEmEstoque -= quantidade;
}

public void totalValorEmEstoque(){
    System.out.println("Quantidade em Estoque");

    }

public void imprimirInformacoes(){
    System.out.println("Nome do Produto " + this.nome);
    System.out.println("Valor " + this.valor);
    System.out.println("quantidade " + this.quantidade);
}



}
