import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Bebida extends Produto {

    public Bebida(String id, String categoria, String nome, double preco, boolean disponivel) {
        super(id, categoria, nome, preco, disponivel);
    }

    public Bebida(String id, String categoria, String nome, double preco, boolean disponivel, Boolean promocao) {
        super(id, categoria, nome, preco, disponivel, promocao);
    }

    @Override
    public Element criarElemento(Document documento) {
        return criarElementoBase(documento, "produto");
    }
}
