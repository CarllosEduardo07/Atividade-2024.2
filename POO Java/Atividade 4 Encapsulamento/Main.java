public class Main {
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
        estoqueProduto.cadastrar("arroz", 2, 5.20);
        estoqueProduto.exibirEstoque();
        estoqueProduto.cadastrar("feijao", 5, 7);
        estoqueProduto.exibirEstoque();
        
    }
}
