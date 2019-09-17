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

    public boolean getWifi() {
        return this.wifi;
    }

    public void setArCondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public boolean getArCondicionado() {
        return this.arcondicionado;
    }

    public String toString() {
        return "\n+ Ônibus" + super.toString();
    }

    public String toString2() {
        return "\n+ Ônibus" + super.toString() + "- Numero de passageiros: " + this.getNumeroDePassageiros() + "\n"
                + "- Categoria: " + this.getCategoria() + "\n" + "- Possuí ar-condicionado ? "
                + this.getArCondicionado() + "\n" + "- Wi-fi: " + this.getWifi() + "\n";

    }

}