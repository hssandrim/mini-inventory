public class ProdutoEletronico extends Produto {
    int garantiaMeses;

    public ProdutoEletronico(String nome, int quantidade, double precoUnitario, int  garantiaMeses) {
        super(nome, quantidade, precoUnitario);
        this.garantiaMeses = garantiaMeses;
    }

}
