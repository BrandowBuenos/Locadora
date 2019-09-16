import java.util.ArrayList;

/**
 * Clientes
 */
public class ClientesController implements IClientes {

    public ArrayList<Cliente> listaDeClientes;

    public ClientesController() {
        listaDeClientes = new ArrayList();
    }

    public void add(Cliente c) {
        listaDeClientes.add(c);
    }

    public Cliente get(long CPF) {
        for (Cliente cliente : listaDeClientes) {
            if (cliente.getCpf() == CPF) {
                return cliente;
            }
        }
        return null;
    }

    public String getInfo(long CPF) { // OK
        Cliente cliente = get(CPF);
        if (cliente != null) {

            return cliente.toString();
        }
        return null;
    }

    public String getInfo() {
        String dado = "";
        for (Cliente cliente : listaDeClientes) {
            dado += cliente.toString();
        }
        return dado;
    }

    public String getResumoInfo() {
        String dado = "";
        for (Cliente cliente : listaDeClientes) {
            dado += cliente.toString2();
        }
        return dado;

    }

    public boolean set(long CPF, Cliente clienteEditado) {
        for (int i = 0; i < listaDeClientes.size(); i++) {
            if (listaDeClientes.get(i).getCpf() == CPF) {
                listaDeClientes.set(i, clienteEditado);
                return true;
            }
        }
        return false;
    }

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