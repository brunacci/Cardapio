import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class Produto {

    protected String id;
    protected String categoria;
    protected Boolean promocao;
    protected String nome;
    protected double preco;
    protected boolean disponivel;

    public Produto(String id, String categoria, String nome, double preco, boolean disponivel) {
        this.id = id;
        this.categoria = categoria;
        this.nome = nome;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public Produto(String id, String categoria, String nome, double preco, boolean disponivel, Boolean promocao) {
        this(id, categoria, nome, preco, disponivel);
        this.promocao = promocao;
    }

    public abstract Element criarElemento(Document documento);

    protected Element criarElementoBase(Document documento, String nomeTag) {
        Element produto = documento.createElement(nomeTag);
        produto.setAttribute("id", id);
        produto.setAttribute("categoria", categoria);
        if (promocao != null) {
            produto.setAttribute("promocao", promocao.toString());
        }
        Element elementoNome = documento.createElement("nome");
        elementoNome.setTextContent(nome);
        produto.appendChild(elementoNome);
        Element elementoPreco = documento.createElement("preco");
        elementoPreco.setTextContent(String.valueOf(preco));
        produto.appendChild(elementoPreco);
        Element elementoDisponivel = documento.createElement("disponivel");
        elementoDisponivel.setTextContent(String.valueOf(disponivel));
        produto.appendChild(elementoDisponivel);
        return produto;
    }
}
