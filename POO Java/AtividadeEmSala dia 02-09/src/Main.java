public class Main {
    public static void main(String[] args) {
    Produto arroz = new Produto("Arroz jasmim", 30.0, 500);
        arroz.imprimirInformacoes();
        arroz.adicionarProduto(100);
        arroz.imprimirInformacoes();
        arroz.removerProduto(10);
        arroz.imprimirInformacoes();
        arroz.totalValorEmEstoque();

    }
}