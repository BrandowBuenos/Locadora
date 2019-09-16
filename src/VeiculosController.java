import java.util.ArrayList;

/**
 * Veiculos
 */
public class VeiculosController implements IVeiculos {

    private ArrayList<Veiculo> listaDeVeiculos;

    public VeiculosController() {
        listaDeVeiculos = new ArrayList();
    }

    public void add(Veiculo v) { // OK
        listaDeVeiculos.add(v);
    }

    public Veiculo get(String placa) {
        for (Veiculo veiculo : listaDeVeiculos){
            if (veiculo.getPlaca().equals(placa)) { // Nao funciona ==
                return veiculo;
            }
        }
        return null;

    }

    public String getInfo(String placa) {
        Veiculo veiculo = get(placa);
        if (veiculo != null) {

            return veiculo.toString2();
        }
        return null;

    }

    public String getInfo() {
        String dado = "";
        for (Veiculo veiculo : listaDeVeiculos) {
            dado += veiculo.toString2();
        }

        return dado;
    }

    public String getResumoInfo() {
        String dado = "";
        for (Veiculo veiculo : listaDeVeiculos) {
            dado += veiculo.toString();
        }

        return dado;
    }

    public boolean set(String placa, Veiculo v) {
        Veiculo veiculoAntigo = get(placa);
        if (get(placa) != null) {
            
            veiculoAntigo = v;
            return true;
        }
        return false;
    }

    public boolean remove(String placa) {
        for (Veiculo veiculo : listaDeVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                listaDeVeiculos.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    public boolean existe(String placa) {
        Veiculo veiculo = get(placa);
        return veiculo != null;
    }

}