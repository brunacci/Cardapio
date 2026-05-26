import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ComidaPreparada extends Produto {

    private int tempoPreparo;

    public ComidaPreparada(String id, String categoria, String nome, double preco, boolean disponivel, int tempoPreparo) {
        super(id, categoria, nome, preco, disponivel);
        this.tempoPreparo = tempoPreparo;
    }

    public ComidaPreparada(String id, String categoria, String nome, double preco, boolean disponivel, int tempoPreparo, Boolean promocao) {
        super(id, categoria, nome, preco, disponivel, promocao);
        this.tempoPreparo = tempoPreparo;
    }

    @Override
    public Element criarElemento(Document documento) {
        Element produto = criarElementoBase(documento, "produto");
        produto.setAttribute("tempoPreparo", String.valueOf(tempoPreparo));
        return produto;
    }
}
