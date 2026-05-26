import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Bebida("1", "bebida", "Suco de Laranja", 8.50, true));
        produtos.add(new Bebida("2", "bebida", "Cafe Expresso", 5.00, true, true));
        produtos.add(new ComidaPreparada("3", "prato", "Prato Feito", 28.90, true, 20));
        produtos.add(new ComidaPreparada("4", "massa", "Lasanha Bolonhesa", 32.00, true, 35));
        produtos.add(new ComidaPreparada("5", "sobremesa", "Pudim de Leite", 12.00, true, 15));
        produtos.add(new Bebida("6", "bebida", "Agua Mineral", 4.00, false));

        GeradorCardapio.gerar(produtos, "cardapio.xml");
    }
}
