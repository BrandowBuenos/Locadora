import Cliente.java;
import Veiculos.java;

/**
 * Locacao
 */
public class Locacao {

    private static int nLocacao = 0;
    private final int codigoLocacao;

    private Cliente clientelocador;
    private Veiculo veiculolocado;
    private String datainicio;
    private String datafinal;
    private boolean seguro;

    public Locacao(String clientelocador, String veiculolocado) { // tipos errados
        nLocacao++;
        this.codigoLocacao = nLocacao;

    }

    public int getCodigoDaLocacao() {
        return codigoLocacao;
    }

    public void setValorDaDiaria(float valordadiaria) {
        this.valordadiaria = valordadiaria;
    }

    public float getValorDaDiaria() {
        return this.valordadiaria;
    }

    public void setDataInicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDataInicio() {
        return this.datainicio;
    }

    public void setDataFinal(String datafinal) {
        this.datafinal = datafinal;
    }

    public String getDataFinal() {
        return this.datafinal;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public boolean getSeguro() {
        return this.seguro;
    }

    public Cliente getClienteLocador() {
        return this.clientelocador;
    }

    public Veiculo getVeiculoLocado() {
        return this.veiculolocado;
    }

    public String toString() {
        return "\n+ Código: " + this.getCodigoDaLocacao() + "\n" + "- Cliente: " + getClienteLocador() + "\n"
                + "- Veículo locado: " + getVeiculoLocado() + "\n" + "- Data inicio: " + getDataInicio() + "\n"
                + "- Data final: " + getDataFinal() + "\n" + "- Seguro: " + getSeguro() + "\n";
    }

}