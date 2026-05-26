import java.io.File;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class GeradorCardapio {

    public static void gerar(List<Produto> produtos, String caminhoArquivo) throws Exception {
        Document documento = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element cardapio = documento.createElement("cardapio");
        documento.appendChild(cardapio);
        for (Produto produto : produtos) {
            cardapio.appendChild(produto.criarElemento(documento));
        }
        Transformer transformador = TransformerFactory.newInstance().newTransformer();
        transformador.setOutputProperty(OutputKeys.INDENT, "yes");
        transformador.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformador.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformador.transform(new DOMSource(documento), new StreamResult(new File(caminhoArquivo)));
    }
}
