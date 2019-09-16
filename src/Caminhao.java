/**
 * Caminhao
 */
public class Caminhao extends Veiculo {

    private int numerodeeixos;
    private float cargamaxima;

    public Caminhao(String placa, int ano, float diaria) {
        super(placa, ano, diaria);
    }

    public void setNumeroDeEixos(int numerodeeixos) {
        this.numerodeeixos = numerodeeixos;
    }

    public int getNumeroDeEixos() {
        return this.numerodeeixos;
    }

    public void setCargaMaxima(float cargamaxima) {
        this.cargamaxima = cargamaxima;
    }

    public float getCargaMaxima() {
        return this.cargamaxima;
    }

    public String toString() {

        return "\n+ Caminhão" + super.toString();

    }

    public String toString2() {
        return "\n+ Caminhão" + super.toString() + "- Número de eixos: " + this.getNumeroDeEixos() + "\n"
                + "- Carga Máxima: " + this.getCargaMaxima() + "\n";

    }

}