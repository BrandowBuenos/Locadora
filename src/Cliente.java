/**
 * Cliente
 */
public class Cliente {

    String nome;
    long cpf;
    double numerodacarteirademotorista;
    String endereco;
    double telefone;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, long cpf, double numerodacarteirademotorista, String endereco, double telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.numerodacarteirademotorista = numerodacarteirademotorista;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setNumeroDaCarteiraDeMotorista(double numerodacarteirademotorista) {
        this.numerodacarteirademotorista = numerodacarteirademotorista;
    }

    public double getNumeroDaCarteiraDeMotorista() {
        return this.numerodacarteirademotorista;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public double getTelefone() {
        return this.telefone;
    }

    public String toString() {

        return "\n- Nome: " + this.getNome() + "\n" + "- CPF: " + this.getCpf() + "\n";
    }

    public String toString2() {

        return "\n- Nome: " + this.getNome() + "\n" + "- CPF: " + this.getCpf() + "\n" + "- Carteira de motorista: "
                + this.getNumeroDaCarteiraDeMotorista() + "\n" + "- Endereço: " + this.getEndereco() + "\n"
                + "- Telfone: " + this.getTelefone() + "\n";
    }
}