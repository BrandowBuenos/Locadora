import Cliente.java;
import Veiculo.java;
import Locacao.java;
import ClientesController.java;
import VeiculosController.java;
import LocacoesController.java;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

/**
 * App
 */
public class App {

    private static Scanner input = new Scanner(System.in);
    private static ClientesController listaDeClientes = new ClientesController();
    private static VeiculosController listaDeVeiculos = new VeiculosController();
    private static LocacoesController listaDeLocacoes = new LocacoesController();

    public static void menu() {
        int option;

        do {
            System.out.println("\nLocadora de veículos");

            System.out.println("\n► Gerenciamento de clientes");
            System.out.println("   1. Cadastrar cliente");
            System.out.println("   2. Remover cliente cadastrado");
            System.out.println("   3. Modificar cliente cadastrado");
            System.out.println("   4. Consultar cliente por CPF");
            System.out.println("   5. Exibir resumo de todos os clientes");
            System.out.println("   6. Exibir todos os clientes");

            System.out.println("\n► Gerenciamento de veículos");
            System.out.println("   7. Cadastrar novo veículo");
            System.out.println("   8. Remover veículo cadastrado");
            System.out.println("   9. Modificar veículo cadastrado");
            System.out.println("   10. Consultar veículo por placa");
            System.out.println("   11. Exibir resumo de todos os veículos");
            System.out.println("   12. Exibir todos os veículos");

            System.out.println("\n► Gerenciamento de locações");
            System.out.println("   13. Adicionar nova locação");
            System.out.println("   14. Remover locação");
            System.out.println("   15. Modificar locação");
            System.out.println("   16. Consultar locação pelo código");
            System.out.print("   17. Exibir todas as locações");

            System.out.println("\n");

            do {
                System.out.print("➜ Informe a opção desejada: ");
                option = input.nextInt();
                input.nextLine();
            } while (option < 1 || option > 17);

            switch (option) {
            case 1:
                cadastrarCliente();
                break;

            case 2:
                removerCliente();
                break;

            case 3:
                modificarCliente();
                break;

            case 4:
                consultarDadosPorCPF();
                break;

            case 5:
                exibirResumoDeTodosClientes();
                break;

            case 6:
                exibirTodosClientes();
                break;

            case 7:
                cadastrarVeiculo();
                break;

            case 8:
                removerVeiculo();
                break;

            case 9:
                modificarVeiculo();
                break;

            case 10:
                consultarDadosPorPlaca();
                break;

            case 11:
                exibirResumoDeTodosVeiculos();
                break;

            case 12:
                exibirTodosVeiculos();
                break;

            case 13:
                adicionarNovaLocacao();
                break;

            case 14:
                removerLocacao();

            case 15:
                modificarLocacao();
                break;

            case 16:
                consultarLocacaoPorCodigo();
                break;

            case 17:
                exibirTodasLocacao();
                break;

            default:
                System.out.println("Opção Inválida");

            }

        } while (option != 0);

    }

    public static void cadastrarCliente() { // OK
        Cliente novoCliente;

        int option;

        do {
            System.out.print("\n- Cadastro de cliente - ");
            System.out.print("\n  ● Nome: ");
            String nome = input.nextLine();

            long cpf;

            do {
                System.out.print("  ● CPF: ");
                cpf = input.nextLong();
                input.nextLine();

                if (listaDeClientes.existe(cpf)) {
                    System.out.println("\n   ➜ Cpf já existente ! Por favor, informe um novo Cpf\n");
                }

            } while (listaDeClientes.existe(cpf) == true);

            novoCliente = new Cliente(nome, cpf);

            System.out.println("\n   ➜  Deseja fazer o cadastro completo ?");
            System.out.println("      - Digite 1 para continuar adicionando");
            System.out.println("      - Digite 0 para finalizar o cadastro\n");
            System.out.print("   ➜ Opção: ");
            option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                System.out.print("\n  ● Número da CNH: ");
                novoCliente.setNumeroDaCarteiraDeMotorista(input.nextDouble());
                input.nextLine();

                System.out.print("  ● Endereço: ");
                novoCliente.setEndereco(input.nextLine());

                System.out.print("  ● Telefone: ");
                novoCliente.setTelefone(input.nextDouble());
                input.nextLine();

            }
            listaDeClientes.add(novoCliente);
            System.out.println("\n   ➜ O cliente " + novoCliente.getNome() + " foi cadastrado com sucesso !");

            System.out.println("\n  ⟲  Deseja continuar adicionando mais clientes  ?");
            System.out.println("      - Digite 1 para continuar adicionando");
            System.out.println("      - Digite 0 para sair do cadastro\n");
            System.out.print("   ➜ Opção: ");
            option = input.nextInt();
            input.nextLine();

        } while (option != 0);
    }

    public static void removerCliente() { // OK
        System.out.println("\n- Remover Cliente- ");
        System.out.print("  ● Informe o CPF: ");
        long cpf = input.nextLong();

        if (listaDeClientes.remove(cpf) == true) {
            System.out.println("O cliente foi removido com sucesso !");
        } else if (listaDeClientes.remove(cpf) == false) {
            System.out.println("A exclusão falhou !");
        }
    }

    public static void modificarCliente() { // OK
        Cliente clienteEditado;

        System.out.println("\n- Modificar dados de cliente- ");

        System.out.print("  ● CPF do cliente: ");
        long cpf = input.nextLong();
        input.nextLine();

        Cliente clienteAntigo = listaDeClientes.get(cpf);

        if (listaDeClientes.get(cpf) == null) {
            System.out.println("\n   ➜ Não existe nenhum cliente cadastrado com este CPF!\n");

        } else {

            System.out.println("\n  ➜ Cliente a ser editado: ");
            System.out.println(clienteAntigo);

            System.out.print("  ● Novo nome: ");
            String nome = input.nextLine();

            System.out.print("  ● Número da CNH: ");
            double numerodacarteirademotorista = input.nextDouble();
            input.nextLine();

            System.out.print("  ● Novo endereço: ");
            String endereco = input.nextLine();

            System.out.print("  ● Novo número de telefone: ");
            double telefone = input.nextDouble();
            input.nextLine();

            clienteEditado = new Cliente(nome, cpf, numerodacarteirademotorista, endereco, telefone);

            if (listaDeClientes.set(cpf, clienteEditado) == true) {
                System.out.println("\n   ➜ O cliente " + clienteEditado.getNome() + " foi editado com sucesso !");
            } else if (listaDeClientes.set(cpf, clienteEditado) == false) {
                System.out.println("\n   ➜ Não foi possível editar este cliente !");
            }
        }
    }

    public static void consultarDadosPorCPF() { // OK

        System.out.println("\n- Dados do Cliente por CPF - ");
        System.out.print("  ● Informe o CPF: ");

        long cpf = input.nextLong();
        input.nextLine();

        if (listaDeClientes.getInfo(cpf) == null) {
            System.out.println("\n  ➜ Não existe cliente cadastrado com este Cpf!");
        } else {
            System.out.println("\n  ➜ Cliente encontrado: \n" + listaDeClientes.getInfo(cpf));
        }

    }

    public static void exibirResumoDeTodosClientes() { // OK
        if (listaDeClientes.getResumoInfo() == null) {
            System.out.println("\n   ➜ Não existem clientes cadastrados!");
        } else {
            System.out.println("\n  ➜ Clientes encontrados: \n" + listaDeClientes.getResumoInfo());
        }
    }

    public static void exibirTodosClientes() { // OK
        if (listaDeClientes.getInfo() == null) {
            System.out.println("\n   ➜ Não existem clientes cadastrados!");
        } else {
            System.out.println("\n  ➜ Clientes encontrados: \n" + listaDeClientes.getInfo());
        }
    }

    /*
     * ----------------------------------------------------------------------------
     */

    public static void cadastrarVeiculo() {

        int option;
        do {
            System.out.print("\n- Cadastro de Veículo -");
            System.out.print("\n   ➜   Informe qual o tipo de veículo que deseja cadastrar: ");

            System.out.println("\n    1. Carro ");
            System.out.println("    2. Caminhão ");
            System.out.println("    3. Ônibus ");

            do {
                System.out.print("\n   ➜   Opção: ");
                option = input.nextInt();
                input.nextLine();
            } while (option < 1 || option > 3);

            switch (option) {
            case 1:
                Carro novoCarro;
                System.out.println("\n+ Cadastro de novo carro ");

                String placaCarro;
                do {
                    System.out.print("  ● Placa: ");
                    placaCarro = input.nextLine();

                    if (listaDeVeiculos.existe(placaCarro)) {
                        System.out.println("\n   ➜ Placa já existente ! Por favor, informe uma nova Placa\n");
                    }
                } while (listaDeVeiculos.existe(placaCarro) == true);

                System.out.print("  ● Ano: ");
                int anoCarro = input.nextInt();
                input.nextLine();

                float diariaCarro;
                do {
                    System.out.print("  ● Valor da diária: ");
                    diariaCarro = input.nextFloat();
                    input.nextLine();

                } while (diariaCarro < 0);

                novoCarro = new Carro(placaCarro, anoCarro, diariaCarro);

                System.out.println("\n   ➜  Deseja fazer o cadastro completo ?");
                System.out.println("      - Digite 1 para continuar adicionando");
                System.out.println("      - Digite 0 para finalizar o cadastro\n");
                System.out.print("   ➜ Opção: ");
                option = input.nextInt();
                input.nextLine();

                if (option == 1) {

                    System.out.print("\n  ● Número de passageiros: ");
                    novoCarro.setNumeroDePassageiros(input.nextInt());
                    input.nextLine();

                    System.out.print("  ● Número de portas: ");
                    novoCarro.setNumeroDePortas(input.nextInt());
                    input.nextLine();

                    System.out.print("  ● Média de Km/L: ");
                    novoCarro.setMediaDeKml(input.nextFloat());
                    input.nextLine();

                    System.out.print("  ● Possuí ar-condicionado? (S ou N) ");
                    char resposta = Character.toUpperCase(input.next().charAt(0));

                    if (resposta == 'S') {
                        novoCarro.setArCondicionado(true);
                    } else if (resposta == 'N') {
                        novoCarro.setArCondicionado(false);
                    }
                }

                listaDeVeiculos.add(novoCarro);
                System.out.println("\nCarro cadastrado com sucesso !");
                break;

            case 2:

                Caminhao novoCaminhao;
                System.out.println("\n+ Cadastro de novo caminhão ");
                System.out.print("  ● Placa: ");
                String placaCaminhao = input.nextLine();

                System.out.print("  ● Ano: ");
                int anoCaminhao = input.nextInt();
                input.nextLine();

                float diariaCaminhao;
                do {
                    System.out.print("  ● Valor da diária: ");
                    diariaCaminhao = input.nextFloat();
                    input.nextLine();
                } while (diariaCaminhao < 0);

                novoCaminhao = new Caminhao(placaCaminhao, anoCaminhao, diariaCaminhao);

                System.out.println("\n   ➜  Deseja fazer o cadastro completo ?");
                System.out.println("      - Digite 1 para continuar adicionando");
                System.out.println("      - Digite 0 para finalizar o cadastro\n");
                System.out.print("   ➜ Opção: ");
                option = input.nextInt();
                input.nextLine();

                if (option == 1) {
                    System.out.print("\n  ● Número de eixos: ");
                    novoCaminhao.setNumeroDeEixos(input.nextInt());
                    input.nextLine();

                    System.out.print("  ● Carga máxima: ");
                    novoCaminhao.setCargaMaxima(input.nextFloat());
                    input.nextLine();
                }

                listaDeVeiculos.add(novoCaminhao);
                System.out.println("\nCaminhão cadastrado com sucesso !");
                break;

            case 3:

                Onibus novoOnibus;
                System.out.println("\n+ Cadastro de novo Ônibus ");
                System.out.print("  ● Placa: ");
                String placaOnibus = input.next();

                System.out.print("  ● Ano: ");
                int anoOnibus = input.nextInt();
                input.nextLine();

                float diariaOnibus;
                do {
                    System.out.print("  ● Valor da diária: ");
                    diariaOnibus = input.nextFloat();
                    input.nextLine();
                } while (diariaOnibus < 0);

                novoOnibus = new Onibus(placaOnibus, anoOnibus, diariaOnibus);

                System.out.println("\n   ➜  Deseja fazer o cadastro completo ?");
                System.out.println("      - Digite 1 para continuar adicionando");
                System.out.println("      - Digite 0 para finalizar o cadastro\n");
                System.out.print("   ➜ Opção: ");
                option = input.nextInt();
                input.nextLine();

                if (option == 1) {
                    System.out.print("\n  ● Número de passageiros: ");
                    novoOnibus.setNumeroDePassageiros(input.nextInt());
                    input.nextLine();

                    System.out.print("  ● Categoria: ");
                    novoOnibus.setCategoria(input.next());
                    input.nextLine();

                    System.out.print("  ● Possuí ar-condicionado? (S ou N) ");
                    char resposta = Character.toUpperCase(input.next().charAt(0));

                    if (resposta == 'S') {
                        novoOnibus.setArCondicionado(true);
                    } else if (resposta == 'N') {
                        novoOnibus.setArCondicionado(false);
                    }

                    System.out.print("  ● Possuí Internet sem fio? (S ou N) ");
                    char resposta1 = Character.toUpperCase(input.next().charAt(0));

                    if (resposta1 == 'S') {
                        novoOnibus.setWifi(true);
                    } else if (resposta1 == 'N') {
                        novoOnibus.setWifi(false);
                    }
                }

                listaDeVeiculos.add(novoOnibus);
                System.out.println("\nÔnibus cadastrado com sucesso !");
                break;

            default:
                ;

            }
            System.out.println("\n  ⟲  Deseja continuar adicionando mais veículos  ?");
            System.out.println("      - Digite 1 para continuar adicionando");
            System.out.println("      - Digite 0 para sair do cadastro\n");
            System.out.print("   ➜ Opção: ");
            option = input.nextInt();
            input.nextLine();

        } while (option != 0);

    }

    public static void removerVeiculo() { // OK
        System.out.println("\n- Remover Veículo- ");
        System.out.print("  ● Placa: ");
        String placa = input.nextLine();

        if (listaDeVeiculos.remove(placa) == true) {
            System.out.println("O veículo foi removido com sucesso !");
        } else if (listaDeVeiculos.remove(placa) == false) {
            System.out.println("A exclusão falhou !");
        }
    }

    public static void modificarVeiculo() {

        System.out.print("\n   ➜   Informe qual o tipo de veículo que deseja cadastrar: ");

        System.out.println("\n    1. Carro ");
        System.out.println("    2. Caminhão ");
        System.out.println("    3. Ônibus ");

        do {
            System.out.print("\n   ➜   Opção: ");
            option = input.nextInt();
            input.nextLine();
        } while (option < 1 || option > 3);

        switch (option) {
        case 1:
            System.out.print("\nInforme a placa do carro: ");
            String placaCarro = input.nextLine();

            if (listaDeVeiculos.get(placaCarro) instanceof Carro) {
                Carro carroEditado = (Carro) listaDeVeiculos.get(placaCarro);

                System.out.print("\n- Carro a ser editado: " + carroEditado);
                System.out.print("\n+ Digite a nova placa: ");
                String placaEditada = input.nextLine();

                System.out.print("+ Digite a nova diária: ");
                float diariaEditada = input.nextFloat();
                input.nextLine();

                int ano = carroEditado.getAno();
                int numerodepassageiros = carroEditado.getNumeroDePassageiros();
                int numerodeportas = carroEditado.getNumeroDePortas();
                float mediadekml = carroEditado.getMediaDeKml();
                boolean arcondicionado = carroEditado.getArCondicionado();

                carroEditado = new Carro(placaEditada, ano, diariaEditada);

                carroEditado.setNumeroDePassageiros(numerodepassageiros);
                carroEditado.setNumeroDePortas(numerodeportas);
                carroEditado.setMediaDeKml(mediadekml);
                carroEditado.setArCondicionado(arcondicionado);

                System.out.println("\n+ Modificado com sucesso ? " + listaDeVeiculos.set(placaCarro, carroEditado));

            }

            break;

        case 2:
            System.out.print("\nInforme a placa do Caminhão: ");
            String placaCaminhao = input.nextLine();

            if (listaDeVeiculos.get(placaCaminhao) instanceof Caminhao) {
                Caminhao caminhaoEditado = (Caminhao) listaDeVeiculos.get(placaCaminhao);

                System.out.print("\n- Caminhão a ser editado: " + caminhaoEditado);
                System.out.print("\n+ Digite a nova placa: ");
                String placaEditada = input.nextLine();

                System.out.print("+ Digite a nova diária: ");
                float diariaEditada = input.nextFloat();
                input.nextLine();

                int ano = caminhaoEditado.getAno();
                int numerodeeixos = caminhaoEditado.getNumeroDeEixos();
                float cargamaxima = caminhaoEditado.getCargaMaxima();

                caminhaoEditado = new Caminhao(placaEditada, ano, diariaEditada);

                caminhaoEditado.setNumeroDeEixos(numerodeeixos);
                caminhaoEditado.setCargaMaxima(cargamaxima);

                System.out
                        .println("\n+ Modificado com sucesso ? " + listaDeVeiculos.set(placaCaminhao, caminhaoEditado));

            }
            break;

        case 3:
            System.out.print("\nInforme a placa do Ônibus: ");
            String placaOnibus = input.nextLine();

            if (listaDeVeiculos.get(placaOnibus) instanceof Onibus) {
                Onibus onibusEditado = (Onibus) listaDeVeiculos.get(placaOnibus);

                System.out.print("\n- Ônibus a ser editado: " + onibusEditado);
                System.out.print("\n+ Digite a nova placa: ");
                String placaEditada = input.nextLine();

                System.out.print("+ Digite a nova diária: ");
                float diariaEditada = input.nextFloat();
                input.nextLine();

                int ano = onibusEditado.getAno();
                int numerodepassageiros = onibusEditado.getNumeroDePassageiros();
                String categoria = onibusEditado.getCategoria();
                boolean wifi = onibusEditado.getWifi();
                boolean arcondicionado = onibusEditado.getArCondicionado();

                onibusEditado = new Onibus(placaEditada, ano, diariaEditada);

                onibusEditado.setNumeroDePassageiros(numerodepassageiros);
                onibusEditado.setCategoria(categoria);
                onibusEditado.setWifi(wifi);
                onibusEditado.setArCondicionado(arcondicionado);

                System.out.println("\n+ Modificado com sucesso ? " + listaDeVeiculos.set(placaOnibus, onibusEditado));

            }
            break;

        default:
            ;
        }
    }

    public static void consultarDadosPorPlaca() {

        System.out.println("\n- Dados do Veículo por Placa - ");
        System.out.print("  ● Informe a Placa: ");
        System.out.println(listaDeVeiculos.getInfo(input.nextLine()));
    }

    public static void exibirResumoDeTodosVeiculos() {
        System.out.println(listaDeVeiculos.getResumoInfo());
    }

    public static void exibirTodosVeiculos() {
        System.out.println(listaDeVeiculos.getInfo());
    }

    /*---------------------------------------------------------------------------------------*/

    public static void adicionarNovaLocacao() {
        Locacao novaLocacao;

        System.out.println("\n- Adicionar Locação -");

        System.out.print("+ CPF do cliente: ");
        Cliente clientelocador = listaDeClientes.get(input.nextLong());
        System.out.println(clientelocador);
        input.nextLine();

        System.out.print("+ Placa do veículo: ");
        Veiculo veiculolocado = listaDeVeiculos.get(input.nextLine());
        System.out.println(veiculolocado);

        novaLocacao = new Locacao(clientelocador, veiculolocado);

        System.out.print("+ Data de Início: ");
        novaLocacao.setDataInicio(input.nextLine());

        System.out.print("+ Data Final: ");
        novaLocacao.setDataFinal(input.nextLine());

        System.out.print("+ Adicionar seguro ? (S ou N): ");
        char resposta = Character.toUpperCase(input.next().charAt(0));
        if (resposta == 'S') {
            novaLocacao.setSeguro(true);
        } else if (resposta == 'N') {
            novaLocacao.setSeguro(false);
        }

        listaDeLocacoes.add(novaLocacao);

        System.out.println("\n+ Deseja continuar adicionando mais Locações ?");
        System.out.println("- Digite 1 para continuar adicionando");
        System.out.println("- Digite 0 para sair do cadastro");
        int option = input.nextInt();
        input.nextLine();

    }

    public static void removerLocacao() {
        System.out.println("\n- Remover Locação- ");
        System.out.print("+ Informe o código: ");
        System.out.println("\nRemovido com sucesso? " + listaDeLocacoes.remove(input.nextInt()));

    }

    public static void modificarLocacao() {

        Locacao locacaoEditada;

        System.out.println("\n- Modificar dados de locacação- ");

        System.out.print("+ Código da locação: ");
        int codigo = input.nextInt();

        Locacao locacaoAntiga = listaDeLocacoes.get(codigo);
        System.out.println("\nLocacao a ser editado: " + locacaoAntiga);
        input.nextLine();

        System.out.print("+ CPF do cliente: ");
        Cliente clientelocador = listaDeClientes.get(input.nextLong());
        System.out.println(clientelocador);
        input.nextLine();

        System.out.print("+ Placa do veículo: ");
        Veiculo veiculolocado = listaDeVeiculos.get(input.nextLine());
        System.out.println(veiculolocado);

        System.out.print("+ Data de Início: ");
        String datainicio = input.nextLine();

        System.out.print("+ Data final: ");
        String datafinal = input.nextLine();

        System.out.print("+ Seguro ? (S ou N): ");
        char resposta = Character.toUpperCase(input.next().charAt(0));
        input.nextLine();

        if (resposta == 'S') {
            locacaoAntiga.setSeguro(true);
        } else if (resposta == 'N') {
            locacaoAntiga.setSeguro(false);
        }

        locacaoEditada = new Locacao(clientelocador, veiculolocado, datainicio, datafinal);

        System.out.println("\n+ Modificado com sucesso ? " + listaDeLocacoes.set(codigo, locacaoEditada));
    }

    public static void consultarLocacaoPorCodigo() {
        System.out.println("\n- Dados da Locação por código - ");
        System.out.print("+ Informe o código: ");
        System.out.println(listaDeLocacoes.getInfo(input.nextInt()));
    }

    public static void exibirTodasLocacao() {
        System.out.println(listaDeLocacoes.getInfo());
    }

    public static void main(String[] args) {
        App.menu();
    }

}
