public class EstoqueProduto{
    private String descricao;
    private int quantidade;
    private double valor;
    
    public void cadastrar(String descricao, int quantidade, double valor){
      this.descricao = descricao;
      this.quantidade += quantidade;
      this.valor = valor;
   }
   public void removerQuantidade(int quantidade){
      this.quantidade -= quantidade;
   }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }


    public void exibirEstoque(){
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Valor: " + this.valor);
    }

}