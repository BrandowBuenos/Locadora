import java.util.ArrayList;

/**
 * Veiculos
 */
public class VeiculosController implements IVeiculos {

    private ArrayList<Veiculo> listaDeVeiculos;

    /**
     * Construtor instancia uma nova ArrayList
     */
    public VeiculosController() {
        listaDeVeiculos = new ArrayList();
    }

    /**
     * Adiciona o veiculo a lista de veiculos
     */
    public void add(Veiculo v) { // OK
        listaDeVeiculos.add(v);
    }

    /**
     * Retorna veículo
     * 
     * @param placa
     * @return
     */
    public Veiculo get(String placa) {
        for (Veiculo veiculo : listaDeVeiculos) {
            if (veiculo.getPlaca().equals(placa)) { // Nao funciona ==
                return veiculo;
            }
        }
        return null;

    }

    /**
     * Mostra as informações do veiculo conforme sua placa
     * 
     * @param placa
     * @return
     */
    public String getInfo(String placa) {
        Veiculo veiculo = get(placa);
        if (veiculo != null) {

            return veiculo.toString2();
        }
        return null;

    }

    /**
     * Mostra as informações completas de todos os veiculos
     * 
     * @return
     */
    public String getInfo() {
        String dado = "";
        for (Veiculo veiculo : listaDeVeiculos) {
            dado += veiculo.toString2();
        }
        if (dado != "") {
            return dado;
        } else {
            return null;
        }
    }

    /**
     * Da um resumo de todos os veiculos
     * 
     * @return
     */
    public String getResumoInfo() {
        String dado = "";
        for (Veiculo veiculo : listaDeVeiculos) {
            dado += veiculo.toString();
        }
        if (dado != "") {
            return dado;
        } else {
            return null;
        }
    }

    /**
     * Edita o veiculo com a placa indicada
     * 
     * @param placa
     * @param veiculoEditado
     * @return
     */
    public boolean set(String placa, Veiculo veiculoEditado) {
        for (int i = 0; i < listaDeVeiculos.size(); i++) {
            if (listaDeVeiculos.get(i).getPlaca().equals(placa)) {
                listaDeVeiculos.set(i, veiculoEditado);
                return true;
            }
        }
        return false;
    }

    /**
     * Remove um veiculo da lista de veiculos indicando sua placa
     * 
     * @param placa
     * @return
     */
    public boolean remove(String placa) {
        for (Veiculo veiculo : listaDeVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                listaDeVeiculos.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    /**
     * Recebe a placa e checa se a placa do veiculo existe
     * 
     * @param placa
     * @return
     * 
     */

    public boolean existe(String placa) {
        Veiculo veiculo = get(placa);
        return veiculo != null;
    }

}