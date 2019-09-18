import java.util.ArrayList;

/**
 * Clientes
 */
public class ClientesController implements IClientes {

    public ArrayList<Cliente> listaDeClientes;

    /**
     * Construtor da classe que instancia um novo ArrayList
     */
    public ClientesController() {
        listaDeClientes = new ArrayList();
    }

    /**
     * Adiciona o cliente na lista de clientes
     * 
     * @param c
     */
    public void add(Cliente c) {
        listaDeClientes.add(c);
    }

    /**
     * Adiciona o cliente na lista de clientes
     * 
     * @param CPF
     * @return
     */
    public Cliente get(long CPF) {
        for (Cliente cliente : listaDeClientes) {
            if (cliente.getCpf() == CPF) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Retorna as informaçoes completas do cliente
     * 
     * @param CPF
     * @return
     */
    public String getInfo(long CPF) { // OK
        Cliente cliente = get(CPF);
        if (cliente != null) {

            return cliente.toString();
        }
        return null;
    }

    /**
     * Retorna as informaçoes completas de todos os cliente
     * 
     * @param CPF
     * @return
     */
    public String getInfo() {
        String dado = "";
        for (Cliente cliente : listaDeClientes) {
            dado += cliente.toString();
        }
        if (dado != "") {
            return dado;
        } else {
            return null;
        }
    }

    /**
     * Retorna um resumo das informacoes dos cliente
     * 
     * @return
     */
    public String getResumoInfo() {
        String dado = "";
        for (Cliente cliente : listaDeClientes) {
            dado += cliente.toString2();
        }
        if (dado != "") {
            return dado;
        } else {
            return null;
        }
    }

    /**
     * Altera o cliente com o cpf informado
     * 
     * @param CPF
     * @param clienteEditado
     * @return
     */
    public boolean set(long CPF, Cliente clienteEditado) {
        for (int i = 0; i < listaDeClientes.size(); i++) {
            if (listaDeClientes.get(i).getCpf() == CPF) {
                listaDeClientes.set(i, clienteEditado);
                return true;
            }
        }
        return false;
    }

    /**
     * Remove o cliente conforme o cpf informado
     * 
     * @param CPF
     * @return
     */
    public boolean remove(long CPF) {
        for (Cliente cliente : listaDeClientes) {
            if (cliente.getCpf() == CPF) {
                listaDeClientes.remove(cliente);
                return true;
            }
        }
        return false;

    }

    public boolean existe(long CPF) {
        Cliente cliente = get(CPF);
        return cliente != null;

    }

}