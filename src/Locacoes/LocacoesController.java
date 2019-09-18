import java.util.ArrayList;

/**
 * Locacoes
 */
public class LocacoesController implements ILocacoes {

    private ArrayList<Locacao> listaDeLocacoes;

    /**
     * Construtor que instancia um novo ArrayList
     */
    public LocacoesController() {
        listaDeLocacoes = new ArrayList();
    }

    /**
     * Adiciona a locacao na lista de locacoes
     * 
     * @param l
     */
    public void add(Locacao l) { // OK
        listaDeLocacoes.add(l);
    }

    /**
     * Retorna uma locação
     * 
     * @param codigo
     * @return
     */
    public Locacao get(int codigo) {
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigoDaLocacao() == codigo) {
                return locacao;
            }

        }
        return null;
    }

    /**
     * Lista todas as locacoes com o codigo inserido
     * 
     * @param codigo
     * @return
     */
    public String getInfo(int codigo) {

        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigoDaLocacao() == codigo) {
                return locacao.toString();
            }
        }
        return null;
    }

    /**
     * Lista todas as locacoes
     * 
     * @return
     */
    public String getInfo() {
        String dado = "";
        for (Locacao locacao : listaDeLocacoes) {
            dado += locacao.toString();
        }
        if (dado != "") {
            return dado;
        } else {
            return null;
        }

    }

    /**
     * Atribui uma nova locacao
     * 
     * @param codigo
     * @param locacaoEditada
     * @return
     */
    public boolean set(int codigo, Locacao locacaoEditada) {
        for (int i = 0; i < listaDeLocacoes.size(); i++) {
            if (listaDeLocacoes.get(i).getCodigoDaLocacao() == codigo) {
                listaDeLocacoes.set(i, locacaoEditada);
                return true;
            }
        }
        return false;
    }

    /**
     * Remove a locacao conforme seu codigo
     * 
     * @param codigo
     * @return
     */
    public boolean remove(int codigo) {
        for (Locacao locacao : listaDeLocacoes) {
            if (locacao.getCodigoDaLocacao() == codigo) {
                listaDeLocacoes.remove(locacao);
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se a locacao existe conforme seu codigo
     * 
     * @param codigo
     * @return
     */
    public boolean existe(int codigo) {
        Locacao locacao = get(codigo);
        return locacao != null;

    }

}