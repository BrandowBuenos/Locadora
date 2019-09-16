/**
 * Veiculo
 */
abstract class Veiculo {
    protected String placa;
    protected int ano;
    protected float diaria;

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
        return "\n- Placa: " + getPlaca() + "\n" + "- Ano: " + getAno() + "\n" + "- Diária: " + getDiaria() + "\n";
    }

    public String toString2() {
        return "\n- Placa: " + getPlaca() + "\n" + "- Ano: " + getAno() + "\n" + "- Diária: " + getDiaria() + "\n";
    }

}