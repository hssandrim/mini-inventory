public class Produto {
    protected String nome;
    protected int quantidade;
    protected double precoUnitario;

    public Produto(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularValorTotal(){
            return quantidade * precoUnitario;
    }

}

