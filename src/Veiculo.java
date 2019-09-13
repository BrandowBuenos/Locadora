/**
 * Veiculo
 */
abstract class Veiculo {

    String placa;
    int ano;
    float diaria;

    public Veiculo(String placa, int ano, float diaria) {
        this.placa = placa;
        this.ano = ano;
        this.diaria = diaria;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getDiaria() {
        return this.diaria;
    }

    public void setDiaria(float diaria) {
        this.diaria = diaria;
    }


    public String toString() {

        return "\n- Placa: " + getPlaca() + "\n" + "- Ano: " + getAno() + "\n";
    }

    public String toString2() {

        return "\n- Placa: " + getPlaca() + "\n" + "- Ano: " + getAno() + "\n" + "- Valor da diária: "
                + getDiaria() + "\n" + "- Numero de passageiros: " + this.getNumeroDePassageiros() + "\n"
                + "- Número de portas: " + this.getNumeroDePortas() + "\n" + "- Média de KM/L: " + this.getMediaDeKml() + "\n" + "- Possuí ar-condicionado ? " + this.getArCondicionado();
    }
}