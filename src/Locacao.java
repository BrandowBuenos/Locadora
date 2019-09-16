import Cliente.java;
import Veiculo.java;

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

    public Locacao(Cliente clientelocador, Veiculo veiculolocado) {
        this.clientelocador = clientelocador;
        this.veiculolocado = veiculolocado;
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

    public void setClienteLocador(Cliente clientelocador) {
        this.clientelocador = clientelocador;
    }

    public Cliente getClienteLocador() {
        return this.clientelocador;
    }

    public void setVeiculoLocado(Veiculo veiculolocado) {
        this.veiculolocado = veiculolocado;
    }

    public Veiculo getVeiculoLocado() {
        return this.veiculolocado;
    }

    public String toString() {
        return "\n==== Código " + this.getCodigoDaLocacao() + " ====\n" + "+ Cliente: " + getClienteLocador() + "\n"
                + "- Veículo locado: " + getVeiculoLocado() + "\n" + "+ Data inicio: " + getDataInicio() + "\n"
                + "+ Data final: " + getDataFinal() + "\n" + "+ Possuí seguro: " + getSeguro() + "\n";
    }

}