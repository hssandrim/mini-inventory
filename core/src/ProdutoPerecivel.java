public class ProdutoPerecivel extends Produto {
    String dataValidade;

    public ProdutoPerecivel(String nome, int quantidade, double precoUnitario, String dataValidade) {
        super(nome, quantidade, precoUnitario);
        this.dataValidade = dataValidade;
    }

    public double calcularValorTotal() {
        return (quantidade * precoUnitario) * 0.90;
    }

}


