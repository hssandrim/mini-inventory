import java.util.ArrayList;
import java.util.Locale;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        ArrayList<Produto> produtos = new ArrayList<>();

        // LISTA DE PRODUTOS
        produtos.add(new ProdutoEletronico
                ("Cardiotoco", 32, 1472.64, 34));

        produtos.add(new ProdutoPerecivel
                ("Copo Extrator", 19, 1245.59, "2028-03-07"));

        produtos.add(new ProdutoEletronico
                ("P-220-SMH", 281, 5238.75, 15));

        produtos.add(new ProdutoPerecivel
                ("Lâminas", 195, 1836.57, "2029-11-02"));


        System.out.println("=== RELATÓRIO DE ESTOQUE ===");
        double totalGeral = 0;


        // RELATÓRIO
        for(Produto p : produtos) {
            if (p instanceof ProdutoEletronico){
                ProdutoEletronico pe = (ProdutoEletronico) p;
                System.out.println("----------------------------------------");
                System.out.println
                        ("[Eletrônico] " +pe.nome+ " - Qtd.: " +pe.quantidade+ " - Total: " +nf.format(pe.calcularValorTotal())+ " - Garantia:" +pe.garantiaMeses+ " Meses");

            } else if (p instanceof ProdutoPerecivel){
                ProdutoPerecivel pp = (ProdutoPerecivel) p;
                System.out.println("----------------------------------------");
                System.out.println
                        ("[Perecível] " +pp.nome+ " - Qtd.: " +pp.quantidade+ " - Total: " +nf.format(pp.calcularValorTotal())+ " - Validade: " +pp.dataValidade);

            }
            totalGeral += p.calcularValorTotal();
        }
        System.out.println("----------------------------------------");
        System.out.println("Valor total do Estoque: " +nf.format(totalGeral));
    }
}
