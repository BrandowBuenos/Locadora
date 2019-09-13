import java.util.ArrayList;

/**
 * Locacoes
 */
public class LocacoesController implements ILocacoes {

    
    private ArrayList<Locacao> novasLocacoes;

    public Locacoes() {
        novasLocacoes = new ArrayList();
    }
 
    public void add(Locacao l) {
        novasLocacoes.add(l);
    }

    public Locacao get(int codigo) {

    }

    public String getInfo(int codigo) {

    }

    public String getInfo() {

    }

    public boolean set(int codigo, Locacao l) {

    }

    public boolean remove(int codigo) {
        novasLocacoes.remove(l);
    }

    public boolean existe(int codigo) {

    }
}