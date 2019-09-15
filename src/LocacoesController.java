import java.util.ArrayList;

/**
 * Locacoes
 */
public class LocacoesController implements ILocacoes {

    private ArrayList<Locacao> listaDeLocacoes;

    public LocacoesController() {
        listaDeLocacoes = new ArrayList();
    }

    public void add(Locacao l) { //OK
        listaDeLocacoes.add(l);
    }

    public Locacao get(int codigo) {
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigoDaLocacao() == codigo) {
                return locacao;
            }

        }
        return null;
    }

    public String getInfo(int codigo) {

        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigoDaLocacao() == codigo) {
                return locacao.toString();
            }
        }
        return null;
    }

    public String getInfo() {
        String dado = "";
        for (Locacao locacao : listaDeLocacoes) {
            dado += locacao.toString();
        }
        return dado;

    }

    public boolean set(int codigo, Locacao l) { //nda ok
        Locacao locacao = get(codigo);
        return locacao.getCodigoDaLocacao() != 0;
    }

    public boolean remove(int codigo) { // OK
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigoDaLocacao() == codigo) {
                listaDeLocacoes.remove(locacao);
                return true;
            }
        }
        return false;
    }

    public boolean existe(int codigo) { // OK
        Locacao locacao = get(codigo);
        return locacao != null;

    }
}