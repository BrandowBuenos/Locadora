/**
 * Cliente
 */
public class Cliente {

    private String nome;
    private long cpf;
    private double numerodacarteirademotorista;
    private String endereco;
    private double telefone;

    /**
     * Construtor Cliente simples.
     * 
     * @param nome
     * @param cpf
     */
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Construtor Cliente completo
     * 
     * @param nome
     * @param cpf
     * @param numerodacarteirademotorista
     * @param endereco
     * @param telefone
     */

    public Cliente(String nome, long cpf, double numerodacarteirademotorista, String endereco, double telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.numerodacarteirademotorista = numerodacarteirademotorista;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    /**
     * Atribui o nome do cliente
     * 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o nome informado
     * 
     * @return nome;
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Atribui o cpf do cliente
     * 
     * @param cpf
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    /**
     * Retorna o cpf informado
     * 
     * @return cpf;
     */
    public long getCpf() {
        return this.cpf;
    }

    /**
     * Atribui o número da carteira
     * 
     * @param numerodacarteirademotorista
     */
    public void setNumeroDaCarteiraDeMotorista(double numerodacarteirademotorista) {
        this.numerodacarteirademotorista = numerodacarteirademotorista;
    }

    /**
     * Retorna o número da carteira informado
     * 
     * @return numerodacarteirademotorista;
     */
    public double getNumeroDaCarteiraDeMotorista() {
        return this.numerodacarteirademotorista;
    }

    /**
     * Atribui o endereço
     * 
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Retorna o endereço informado
     * 
     * @return endereco;
     */
    public String getEndereco() {
        return this.endereco;
    }

    /**
     * Atribui o telefone
     * 
     * @param telefone
     */
    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    /**
     * Retorna o telefone informado
     * 
     * @return telefone;
     */
    public double getTelefone() {
        return this.telefone;
    }

    /**
     * Retorna a String completa do cliente
     * 
     * @return
     */
    public String toString() {

        return "\n- Nome: " + this.getNome() + "\n" + "- CPF: " + this.getCpf() + "\n" + "- Carteira de motorista: "
                + this.getNumeroDaCarteiraDeMotorista() + "\n" + "- Endereço: " + this.getEndereco() + "\n"
                + "- Telefone: " + this.getTelefone() + "\n";

    }

    /**
     * Retorna a String resumida do cliente
     * 
     * @return
     */
    public String toString2() {

        return "\n- Nome: " + this.getNome() + "\n" + "- CPF: " + this.getCpf() + "\n";
    }
}