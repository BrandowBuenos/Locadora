/**
 * Onibus
 */
public class Onibus extends Veiculo {
    private int numerodepassageiros;
    private String categoria;
    private boolean wifi;
    private boolean arcondicionado;

    /**
     * Construtor do Onibus
     * 
     * @param placa
     * @param ano
     * @param diaria
     */
    public Onibus(String placa, int ano, float diaria) {
        super(placa, ano, diaria);
    }

    /**
     * Atribui o numero maximo de ocupantes
     * 
     * @param numerodepassageiros
     */
    public void setNumeroDePassageiros(int numerodepassageiros) {
        this.numerodepassageiros = numerodepassageiros;
    }

    /**
     * Retorna os número maximo de ocupantes no onibus
     * 
     * @return numerodepassageiros;
     */
    public int getNumeroDePassageiros() {
        return this.numerodepassageiros;
    }

    /**
     * Atribui a categoria (leito, executivo, convencional)
     * 
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Retorna a categoria do onibus
     * 
     * @return categoria;
     */
    public String getCategoria() {
        return this.categoria;
    }

    /**
     * Atribui o Wifi (true or false)
     * 
     * @param wifi
     */
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    /**
     * Retorna o Wifi
     * 
     * @return wifi;
     */
    public boolean getWifi() {
        return this.wifi;
    }

    /**
     * Atribui o Ar-Condicionado (true or false)
     * 
     * @param arcondicionado
     */
    public void setArCondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    /**
     * Retorna o Ar-Condicionado
     * 
     * @return arcondicionado;
     */
    public boolean getArCondicionado() {
        return this.arcondicionado;
    }

    /**
     * Retorna a string resumida do onibus
     * 
     * @return
     */
    public String toString() {
        return "\n+ Ônibus" + super.toString();
    }

    /**
     * Retorna a string completa do onibus
     * 
     * @return
     */
    public String toString2() {
        return "\n+ Ônibus" + super.toString() + "- Numero de passageiros: " + this.getNumeroDePassageiros() + "\n"
                + "- Categoria: " + this.getCategoria() + "\n" + "- Ar-condicionado: " + this.getArCondicionado() + "\n"
                + "- Wi-fi: " + this.getWifi() + "\n";

    }

}