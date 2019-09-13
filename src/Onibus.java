/**
 * Onibus
 */
public class Onibus extends Veiculo {

    private int numerodepassageiros;
    private String categoria;
    private boolean wifi;
    private boolean arcondicionado;

    public Onibus(String placa, int ano, float diaria) {
        super(placa, ano, diaria);
    }

    public void setNumeroDePassageiros(int numerodepassageiros) {
        this.numerodepassageiros = numerodepassageiros;
    }

    public int getNumeroDePassageiros() {
        return this.numerodepassageiros;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean verificaWifi() {
        return this.wifi;
    }

    public void setArCondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public boolean verificaArCondicionado() {
        return this.arcondicionado;
    }

}