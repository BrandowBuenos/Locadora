/**
 * Carro
 */
public class Carro extends Veiculo {

    private int numerodepassageiros;
    private int numerodeportas;
    private float mediadekml;
    private boolean arcondicionado;

    /**
     * Construtor do Carro.
     * 
     * @param placa
     * @param ano
     * @param diaria
     */
    public Carro(String placa, int ano, float diaria) {
        super(placa, ano, diaria);
    }

    /**
     * Atribui o numero de passageiros
     * 
     * @param numerodepassageiros
     */
    public void setNumeroDePassageiros(int numerodepassageiros) {
        this.numerodepassageiros = numerodepassageiros;
    }

    /**
     * Retorna o numero de passageiros
     * 
     * @return numerodepassageiros
     */
    public int getNumeroDePassageiros() {
        return this.numerodepassageiros;
    }

    /**
     * Atribui o numero de portas do carro
     * 
     * @param numerodeportas;
     */
    public void setNumeroDePortas(int numerodeportas) {
        this.numerodeportas = numerodeportas;
    }

    /**
     * Retorna o numero de portas informado
     * 
     * @return numerodeportas;
     */
    public int getNumeroDePortas() {
        return this.numerodeportas;
    }

    /**
     * Atribui a media de km por litros
     * 
     * @param mediadekml
     */
    public void setMediaDeKml(float mediadekml) {
        this.mediadekml = mediadekml;
    }

    /**
     * Retorna a media de km por litros informados
     * 
     * @return mediadekml;
     */
    public float getMediaDeKml() {
        return this.mediadekml;
    }

    /**
     * Atribui o ar-condicionda(true or false)
     * 
     * @param arcondicionado
     */

    public void setArCondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    /**
     * Retorna o ar-condicionado informado
     * 
     * @return arcondicionado;
     */
    public boolean getArCondicionado() {
        return this.arcondicionado;
    }

    /**
     * Retorna a String resumida do carro
     * 
     * @return
     */
    public String toString() {

        return "\n+ Carro" + super.toString();

    }

    /**
     * Retorna a String completa de carro
     * 
     * @return
     */
    public String toString2() {

        return "\n+ Carro" + super.toString() + "- Numero de passageiros: " + this.getNumeroDePassageiros() + "\n"
                + "- Número de portas: " + this.getNumeroDePortas() + "\n" + "- Média de KM/L: " + this.getMediaDeKml()
                + "\n" + "- Ar-condicionado: " + this.getArCondicionado() + "\n";
    }

}