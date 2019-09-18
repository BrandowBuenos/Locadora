/**
 * Caminhao
 */
public class Caminhao extends Veiculo {

    private int numerodeeixos;
    private float cargamaxima;

    /**
     * Contrutor do Caminhao
     * 
     * @param placa
     * @param ano
     * @param diaria
     */
    public Caminhao(String placa, int ano, float diaria) {
        super(placa, ano, diaria);
    }

    /**
     * Seta o numero de eixos do caminhao.
     * 
     * @param numerodeeixos
     */
    public void setNumeroDeEixos(int numerodeeixos) {
        this.numerodeeixos = numerodeeixos;
    }

    /**
     * Pega o numero de eixos do caminhao.
     * 
     * @return numerodeeixos;
     */
    public int getNumeroDeEixos() {
        return this.numerodeeixos;
    }

    /**
     * Seta a carga maxima que o caminhao aguenta.
     * 
     * @param cargamaxima
     */
    public void setCargaMaxima(float cargamaxima) {
        this.cargamaxima = cargamaxima;
    }

    /**
     * Pega a carga maxima que o caminhao aguenta.
     * 
     * @return cargamaxima;
     */
    public float getCargaMaxima() {
        return this.cargamaxima;
    }

    /**
     * Retorna a string resumida de caminhao.
     * 
     * @return
     */
    public String toString() {

        return "\n+ Caminhão" + super.toString();

    }

    /**
     * Retorna a string completa de caminhao.
     * 
     * @return
     */
    public String toString2() {
        return "\n+ Caminhão" + super.toString() + "- Número de eixos: " + this.getNumeroDeEixos() + "\n"
                + "- Carga Máxima: " + this.getCargaMaxima() + "\n";

    }

}