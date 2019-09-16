import Cliente.java;
import Veiculo.java;
import Locacao.java;
import ClientesController.java;
import VeiculosController.java;
import LocacoesController.java;

import java.util.Scanner;

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

            System.out.println("\n- Gerenciamento de clientes -");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Remover cliente cadastrado");
            System.out.println("3. Modificar cliente cadastrado");
            System.out.println("4. Consultar cliente por CPF");
            System.out.println("5. Exibir resumo de todos os clientes");
            System.out.println("6. Exibir todos os clientes");

            System.out.println("\n- Gerenciamento de veículos -");
            System.out.println("7. Cadastrar novo veículo");
            System.out.println("8. Remover veículo cadastrado");
            System.out.println("9. Modificar veículo cadastrado");
            System.out.println("10. Consultar veículo por placa");
            System.out.println("11. Exibir resumo de todos os veículos");
            System.out.println("12. Exibir todos os veículos");

            System.out.println("\n- Gerenciamento de locações -");
            System.out.println("13. Adicionar nova locação");
            System.out.println("14. Remover locação");
            System.out.println("15. Modificar locação");
            System.out.println("16. Consultar locação pelo código");
            System.out.println("17. Exibir todas as locações");

            System.out.println("0. Sair\n");

            System.out.print("+ Informe a opção desejada: ");
            option = input.nextInt();
            input.nextLine();

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

    public static void cadastrarCliente() {
        Cliente novoCliente;

        int option;
        do {
            System.out.print("- Cadastro de cliente - ");
            System.out.print("\n+ Informe o nome: ");
            String nome = input.nextLine();

            System.out.print("+ Informe o CPF: ");
            long cpf = input.nextLong();
            input.nextLine();

            novoCliente = new Cliente(nome, cpf);

            System.out.println("\n+ Deseja fazer o cadastro completo ?");
            System.out.println("- Digite 1 para continuar adicionando");
            System.out.println("- Digite 0 para finalizar o cadastro");
            option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                System.out.print("\n- Informe o número da carteira de motorista: ");
                novoCliente.setNumeroDaCarteiraDeMotorista(input.nextDouble());
                input.nextLine();

                System.out.print("- Informe o endereço: ");
                novoCliente.setEndereco(input.next());
                input.nextLine();

                System.out.print("- Informe o número de telefone: ");
                novoCliente.setTelefone(input.nextDouble());
                input.nextLine();

            }
            listaDeClientes.add(novoCliente);
            System.out.println("\nCliente " + novoCliente.getNome() + " cadastrado com sucesso !");

            System.out.println("\n+ Deseja continuar adicionando mais clientes ?");
            System.out.println("- Digite 1 para continuar adicionando");
            System.out.println("- Digite 0 para sair do cadastro");
            option = input.nextInt();
            input.nextLine();

        } while (option != 0);
    }

    public static void removerCliente() {
        System.out.println("\n- Remover Cliente- ");
        System.out.print("+ Informe o CPF: ");
        System.out.println("\nRemovido com sucesso? " + listaDeClientes.remove(input.nextLong()));
    }

    public static void modificarCliente() {
        Cliente novoCliente;
        System.out.println("\n- Modificar dados de cliente- ");
        System.out.print("+ Informe o CPF: ");

        System.out.print("\nDeseja editar este cliente? " + listaDeClientes.get(input.nextLong()));
        int option = input.nextInt();
        if (option == 1) {

        }
    }

    public static void consultarDadosPorCPF() {

        System.out.println("\n- Dados do Cliente por CPF - ");
        System.out.print("+ Informe o CPF: ");
        System.out.println(listaDeClientes.getInfo(input.nextLong()));
    }

    public static void exibirResumoDeTodosClientes() {
        System.out.println(listaDeClientes.getResumoInfo());
    }

    public static void exibirTodosClientes() {
        System.out.println(listaDeClientes.getInfo());
    }

    public static void verificarSeClienteExiste() {
        System.out.println("\n- Verificar existência de Cliente - ");
        System.out.print("+ Informe o CPF: ");
        System.out.println(listaDeClientes.existe(input.nextLong()));

    }

    /* ------------------------------------------------------- */

    public static void cadastrarVeiculo() {
        Veiculo novoVeiculo;

        int option;
        do {
            System.out.print("\n- Cadastro de Veiculo - ");

            System.out.println("\n1. Carro ");
            System.out.println("2. Caminhao ");
            System.out.println("3. Ônibus ");
            System.out.print("\n+ Informe qual o tipo de veículo que deseja cadastrar: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
            case 1:
                Carro novoCarro;
                System.out.println("\n+ Cadastro de novo carro ");
                System.out.print("- Informe a placa: ");
                String placaCarro = input.nextLine();

                System.out.print("- Informe o ano: ");
                int anoCarro = input.nextInt();
                input.nextLine();

                System.out.print("- Informe o valor da diária: ");
                float diariaCarro = input.nextFloat();
                input.nextLine();

                novoCarro = new Carro(placaCarro, anoCarro, diariaCarro);

                System.out.println("\n+ Deseja fazer o cadastro completo ?");
                System.out.println("- Digite 1 para continuar adicionando");
                System.out.println("- Digite 0 para finalizar o cadastro");
                option = input.nextInt();

                if (option == 1) {
                    System.out.print("\n- Informe o número de passageiros: ");
                    novoCarro.setNumeroDePassageiros(input.nextInt());
                    input.nextLine();

                    System.out.print("- Informe o número de portas: ");
                    novoCarro.setNumeroDePortas(input.nextInt());
                    input.nextLine();

                    System.out.print("- Informe a média de Km/L: ");
                    novoCarro.setMediaDeKml(input.nextFloat());
                    input.nextLine();

                    System.out.print("- Possuí ar-condicionado? (S ou N) ");
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
                System.out.print("- Informe a placa: ");
                String placaCaminhao = input.nextLine();

                System.out.print("- Informe o ano: ");
                int anoCaminhao = input.nextInt();
                input.nextLine();

                System.out.print("- Informe o valor da diária: ");
                float diariaCaminhao = input.nextFloat();
                input.nextLine();

                novoCaminhao = new Caminhao(placaCaminhao, anoCaminhao, diariaCaminhao);

                System.out.println("\n+ Deseja fazer o cadastro completo ?");
                System.out.println("- Digite 1 para continuar adicionando");
                System.out.println("- Digite 0 para finalizar o cadastro");
                option = input.nextInt();

                if (option == 1) {
                    System.out.print("\n- Informe o número de eixos: ");
                    novoCaminhao.setNumeroDeEixos(input.nextInt());
                    input.nextLine();

                    System.out.print("- Informe a carga máxima: ");
                    novoCaminhao.setCargaMaxima(input.nextFloat());
                    input.nextLine();

                }

                listaDeVeiculos.add(novoCaminhao);
                System.out.println("\nCaminhão cadastrado com sucesso !");
                break;

            case 3:

                Onibus novoOnibus;
                System.out.println("\n+ Cadastro de novo Ônibus ");
                System.out.print("- Informe a placa: ");
                String placaOnibus = input.next();

                System.out.print("- Informe o ano: ");
                int anoOnibus = input.nextInt();
                input.nextLine();

                System.out.print("- Informe o valor da diária: ");
                float diariaOnibus = input.nextFloat();
                input.nextLine();

                novoOnibus = new Onibus(placaOnibus, anoOnibus, diariaOnibus);

                System.out.println("\n+ Deseja fazer o cadastro completo ?");
                System.out.println("- Digite 1 para continuar adicionando");
                System.out.println("- Digite 0 para finalizar o cadastro");
                option = input.nextInt();

                if (option == 1) {
                    System.out.print("\n- Informe o número de passageiros: ");
                    novoOnibus.setNumeroDePassageiros(input.nextInt());
                    input.nextLine();

                    System.out.print("- Informe a categoria: ");
                    novoOnibus.setCategoria(input.next());
                    input.nextLine();

                    System.out.print("- Possuí ar-condicionado? (S ou N) ");
                    char resposta = Character.toUpperCase(input.next().charAt(0));

                    if (resposta == 'S') {
                        novoOnibus.setArCondicionado(true);
                    } else if (resposta == 'N') {
                        novoOnibus.setArCondicionado(false);
                    }

                    System.out.print("- Possuí Internet sem fio? (S ou N) ");
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
            System.out.println("\n+ Deseja continuar adicionando mais veículos ?");
            System.out.println("- Digite 1 para continuar adicionando");
            System.out.println("- Digite 0 para sair do cadastro");
            option = input.nextInt();
            input.nextLine();

        } while (option != 0);

    }

    public static void removerVeiculo() {
        System.out.println("\n- Remover Veículo- ");
        System.out.print("+ Informe a placa: ");
        System.out.println("\nRemovido com sucesso? " + listaDeVeiculos.remove(input.nextLine()));

    }

    public static void modificarVeiculo() {
        Veiculo novoVeiculo;
        System.out.println("\n- Modificar dados de cliente- ");
        System.out.print("+ Informe o CPF: ");

        System.out.print("\nDeseja editar este cliente? " + listaDeVeiculos.get(input.nextLine()));
        int option = input.nextInt();
        if (option == 1) {

        }
    }

    public static void consultarDadosPorPlaca() {

        System.out.println("\n- Dados do Veículo por Placa - ");
        System.out.print("+ Informe a Placa: ");
        System.out.println(listaDeVeiculos.getInfo(input.nextLine()));
    }

    public static void exibirResumoDeTodosVeiculos() {
        System.out.println(listaDeVeiculos.getResumoInfo());
    }

    public static void exibirTodosVeiculos() {
        System.out.println(listaDeVeiculos.getInfo());
    }

    /*------------------------------------------------------------------------*/

    public static void adicionarNovaLocacao() {
        Locacao novaLocacao;

        System.out.println("\n- Adicionar Locação -");

        System.out.print("+ CPF do cliente: ");
        String clientelocador = listaDeClientes.getInfo(input.nextLong());
        System.out.println(clientelocador);
        input.nextLine();

        System.out.print("+ Placa do veículo: ");
        String veiculolocado = listaDeVeiculos.getInfo(input.nextLine());
        System.out.println(veiculolocado);

        novaLocacao = new Locacao(clientelocador, veiculolocado);

        System.out.print("\n+ Data de Início: ");
        novaLocacao.setDataInicio(input.nextLine());

        System.out.print("\n+ Data Final: ");
        novaLocacao.setDataFinal(input.nextLine());

        System.out.println("\n+ Adicionar seguro ? (S ou N)");
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

        System.out.println("\n- Modificar dados da locação- ");
        System.out.print("+ Informe o código: ");
        System.out.print("\nDeseja editar esta locação? " + listaDeLocacoes.get(input.nextInt()));
        int option = input.nextInt();
        if (option == 1) {

        }
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
