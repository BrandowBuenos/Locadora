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

    /**
     * Construtor da locacao resumido
     * 
     * @param clientelocador
     * @param veiculolocado
     */
    public Locacao(Cliente clientelocador, Veiculo veiculolocado) {
        this.clientelocador = clientelocador;
        this.veiculolocado = veiculolocado;
        nLocacao++;
        this.codigoLocacao = nLocacao;
    }

    /**
     * Construtor da Locacao completo
     * 
     * @param clientelocador
     * @param veiculolocado
     * @param datainicio
     * @param datafinal
     */
    public Locacao(Cliente clientelocador, Veiculo veiculolocado, String datainicio, String datafinal) {
        this.clientelocador = clientelocador;
        this.veiculolocado = veiculolocado;
        this.datainicio = datainicio;
        this.datafinal = datafinal;
        this.codigoLocacao = nLocacao;

    }

    /**
     * Retorna o codigo da locacao
     * 
     * @return
     */
    public int getCodigoDaLocacao() {
        return codigoLocacao;
    }

    /**
     * Atribui a data inicial da locacao
     * 
     * @param datainicio
     */
    public void setDataInicio(String datainicio) {
        this.datainicio = datainicio;
    }

    /**
     * Retorna a data de inicio da locacao
     * 
     * @return
     */
    public String getDataInicio() {
        return this.datainicio;
    }

    /**
     * Atribuiu a data final da locacao.
     * 
     * @param datafinal
     */
    public void setDataFinal(String datafinal) {
        this.datafinal = datafinal;
    }

    /**
     * Retorna a data final da locacao.
     * 
     * @return
     */

    public String getDataFinal() {
        return this.datafinal;
    }

    /**
     * Atribuiu um seguro a locacao (true or false).
     * 
     * @param seguro
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    /**
     * Retorna o seguro da locacao (true or false).
     * 
     * @return
     */

    public boolean getSeguro() {
        return this.seguro;
    }

    /**
     * Atribuiu o cliente que alocou.
     * 
     * @param clientelocador
     */
    public void setClienteLocador(Cliente clientelocador) {
        this.clientelocador = clientelocador;
    }

    /**
     * Retorna o cliente que alocou.
     * 
     * @return
     */
    public Cliente getClienteLocador() {
        return this.clientelocador;
    }

    /**
     * Atribui o veiculo locado.
     * 
     * @param veiculolocado
     */
    public void setVeiculoLocado(Veiculo veiculolocado) {
        this.veiculolocado = veiculolocado;
    }

    /**
     * Retorna o veiculo locado.
     * 
     * @return
     */
    public Veiculo getVeiculoLocado() {
        return this.veiculolocado;
    }

    /**
     * Retorna a String completa
     * 
     * @return
     */
    public String toString() {
        return "\n==== Código " + this.getCodigoDaLocacao() + " ====\n" + "+ Cliente: " + getClienteLocador() + "\n"
                + "+ Veículo locado: " + getVeiculoLocado() + "\n" + "+ Data inicio: " + getDataInicio() + "\n"
                + "+ Data final: " + getDataFinal() + "\n" + "+ Possuí seguro: " + getSeguro() + "\n";
    }

}