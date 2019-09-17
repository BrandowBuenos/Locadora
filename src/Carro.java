/**
 * Carro
 */
public class Carro extends Veiculo {

    private int numerodepassageiros;
    private int numerodeportas;
    private float mediadekml;
    private boolean arcondicionado;

    public Carro(String placa, int ano, float diaria) {
        super(placa, ano, diaria);
    }

    public void setNumeroDePassageiros(int numerodepassageiros) {
        this.numerodepassageiros = numerodepassageiros;
    }

    public int getNumeroDePassageiros() {
        return this.numerodepassageiros;
    }

    public void setNumeroDePortas(int numerodeportas) {
        this.numerodeportas = numerodeportas;
    }

    public int getNumeroDePortas() {
        return this.numerodeportas;
    }

    public void setMediaDeKml(float mediadekml) {
        this.mediadekml = mediadekml;
    }

    public float getMediaDeKml() {
        return this.mediadekml;
    }

    public void setArCondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public boolean getArCondicionado() {
        return this.arcondicionado;
    }

    public String toString() {

        return "\n+ Carro" + super.toString();

    }

    public String toString2() {

        return "\n+ Carro" + super.toString() + "- Numero de passageiros: " + this.getNumeroDePassageiros() + "\n"
                + "- Número de portas: " + this.getNumeroDePortas() + "\n" + "- Média de KM/L: " + this.getMediaDeKml()
                + "\n" + "- Possuí ar-condicionado ? " + this.getArCondicionado() + "\n";
    }

}