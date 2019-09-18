/**
 * Veiculo
 */
abstract class Veiculo {
    protected String placa;
    protected int ano;
    protected float diaria;

    /**
     * Construtor do Veiculo
     * 
     * @param placa
     * @param ano
     * @param diaria
     */
    public Veiculo(String placa, int ano, float diaria) {
        this.placa = placa;
        this.ano = ano;
        this.diaria = diaria;
    }

    /**
     * Retorna a placa do veiculo
     * 
     * @return placa;
     */

    public String getPlaca() {
        return this.placa;
    }

    /*
     * Atribui a placa do veiculo
     * 
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Retorna o ano do veiculo
     * 
     * @return ano;
     */
    public int getAno() {
        return this.ano;
    }

    /**
     * Atribui o ano do veiculo
     * 
     * @param ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Retorna a diária do veiculo
     * 
     * @return diaria;
     */
    public float getDiaria() {
        return this.diaria;
    }

    /**
     * Atribui a diária do veiculo
     * 
     * @param diaria
     */
    public void setDiaria(float diaria) {
        this.diaria = diaria;
    }

    /**
     * Retorna a string resumida do veiculo
     * 
     * @return
     */
    public String toString() {
        return "\n- Placa: " + getPlaca() + "\n" + "- Ano: " + getAno() + "\n" + "- Diária: " + getDiaria() + "\n";
    }

    /**
     * Retorna a string completa do veiculo
     * 
     * @return
     */
    public String toString2() {
        return "\n- Placa: " + getPlaca() + "\n" + "- Ano: " + getAno() + "\n" + "- Diária: " + getDiaria() + "\n";
    }

}