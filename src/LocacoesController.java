import java.util.ArrayList;

/**
 * Locacoes
 */
public class LocacoesController implements ILocacoes {

    private ArrayList<Locacao> listaDeLocacoes;

    public LocacoesController() {
        listaDeLocacoes = new ArrayList();
    }

    public void add(Locacao l) {
        listaDeLocacoes.add(l);
    }

    public Locacao get(int codigo) {
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigoDaLocacao() == codigo) {
                return cliente;
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

    public boolean set(int codigo, Locacao l) {
        Locacao locacao = get(codigo);
        return locacao.codigodalocacao() != null;
    }

    public boolean remove(int codigo) {
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigoDaLocacao() == codigo) {
                listaDeLocacoes.remove(locacao);
                return true;
            }
        }
        return false;
    }

    public boolean existe(int codigo) {
        Locacao locacao = get(codigo);
        return locacao != null;

    }
}