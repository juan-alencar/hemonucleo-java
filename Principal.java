import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {


    public static void main(String[] args) throws IOException, InterruptedException {
        Metodos metodos = new Metodos();

        Scanner scanner = new Scanner(System.in);

        ArrayList<Doador> listaDoador = new ArrayList<Doador>();
        ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
        ArrayList<Profissional> listaProfissional = new ArrayList<Profissional>();
        ArrayList<Doacao> listaDoacao = new ArrayList<Doacao>();
        ArrayList<Transfusao> listaTransfusao = new ArrayList<Transfusao>();

        int op = 0;

        do {
            if(op == 1){
                System.out.println("#1. Cadastrar Doador\n");

                Doador doador = new Doador();
                System.out.println("Digite o Nome do Doador: ");
                doador.setNome(scanner.nextLine());
                System.out.println("Digite a Idade do Doador: ");
                doador.setIdade(Integer.parseInt(scanner.nextLine()));
                System.out.println("Digite o Tipo Sanguineo do Doador: ");
                doador.setTipoSanguineo(scanner.nextLine());
                if(listaDoador.isEmpty()){
                    doador.setId(1);
                }else{
                    doador.setId(listaDoador.get(listaDoador.size() - 1).getId() + 1);
                }
                listaDoador.add(doador);

                System.out.println("Doador cadastrado com Sucesso!\n");
                System.out.println("Você sera redirecionado para o Menu \n\n\n!");
            }

            else if(op == 2){
                System.out.println("#2. Cadastrar Paciente\n");
                Paciente paciente = new Paciente();
                System.out.println("Digite o Nome do Paciente: ");
                paciente.setNome(scanner.nextLine());
                System.out.println("Digite a Idade do Paciente: ");
                paciente.setIdade(Integer.parseInt(scanner.nextLine()));
                System.out.println("Digite o Tipo Sanguineo do Paciente: ");
                paciente.setTipoSanguineo(scanner.nextLine());
                if(listaPaciente.isEmpty()){
                    paciente.setId(1);
                }else{
                    paciente.setId(listaPaciente.get(listaPaciente.size() - 1).getId() + 1);
                }
                listaPaciente.add(paciente);

                System.out.println("Paciente cadastrado com Sucesso!\n");
                System.out.println("Você sera redirecionado para o Menu \n\n\n!");
            }

            else if(op == 3){
                System.out.println("#3. Cadastrar Profissional\n");
                Profissional profissional = new Profissional();
                System.out.println("Digite o Nome do Profissional: ");
                profissional.setNome(scanner.nextLine());
                if(listaProfissional.isEmpty()){
                    profissional.setMatricula(1);
                }else{
                    profissional.setMatricula(listaProfissional.get(listaPaciente.size() - 1).getMatricula() + 1);
                }
                listaProfissional.add(profissional);

                System.out.println("Profissional cadastrado com Sucesso!\n");
                System.out.println("Você sera redirecionado para o Menu \n\n\n!");
            }

            else if(op == 4){
                System.out.println("#4. Doacao de Sangue\n");
                System.out.println("Digite o ID do Paciente: ");
                Paciente paciente = new Paciente(); 
                int pacienteId = Integer.parseInt(scanner.nextLine());
                for (Paciente paciente1: listaPaciente) {
                    if(paciente1.getId() == pacienteId){
                        paciente = paciente1;
                    }
                }
                
                System.out.println("Digite o ID do Doador: ");
                Doador doador = new Doador();
                int doadorId = Integer.parseInt(scanner.nextLine());
                for (Doador doador1: listaDoador) {
                    if(doador1.getId() == doadorId){
                        doador = doador1;
                    }
                }

                System.out.println("Digite a Matrícula do Profissional: ");
                Profissional profissional = new Profissional();
                int profissionalId = Integer.parseInt(scanner.nextLine());
                for (Profissional profissional1: listaProfissional) {
                    if(profissional1.getMatricula() == profissionalId){
                        profissional = profissional1;
                    }
                }

                Doacao newDoacao = metodos.newDoacao(doador, paciente, profissional);
                listaDoacao.add(newDoacao);

                System.out.println("Doacao cadastrada com Sucesso!\n");
                System.out.println("Você sera redirecionado para o Menu \n\n\n!");
            }

            else if(op == 5){
                System.out.println("#5. Transfusao de Sangue\n");
                System.out.println("Digite o ID do Paciente: ");
                Paciente paciente = new Paciente();
                int pacienteId = Integer.parseInt(scanner.nextLine());
                for (Paciente paciente1: listaPaciente) {
                    if(paciente1.getId() == pacienteId){
                        paciente = paciente1;
                    }
                }

                System.out.println("Digite o ID do Doador: ");
                Doador doador = new Doador();
                int doadorId = Integer.parseInt(scanner.nextLine());
                for (Doador doador1: listaDoador) {
                    if(doador1.getId() == doadorId){
                        doador = doador1;
                    }
                }

                System.out.println("Digite a Matrícula do Profissional: ");
                Profissional profissional = new Profissional();
                int profissionalId = Integer.parseInt(scanner.nextLine());
                for (Profissional profissional1: listaProfissional) {
                    if(profissional1.getMatricula() == profissionalId){
                        profissional = profissional1;
                    }
                }

                Transfusao newTransfusao = metodos.newTransfusao(doador, paciente, profissional);
                listaTransfusao.add(newTransfusao);

                System.out.println("Transfusao cadastrada com Sucesso!\n");
                System.out.println("Você sera redirecionado para o Menu \n\n\n!");
            }
            else if(op == 6){
                String listString = listaDoacao.stream().map(Doacao::toString)
                        .collect(Collectors.joining(", "));
                System.out.println(listString);
            }
            else if(op == 7){
                String listString = listaTransfusao.stream().map(Transfusao::toString)
                        .collect(Collectors.joining(", "));
                System.out.println(listString);
            }
            else if(op == 8){
                String listString = listaDoador.stream().map(Doador::toString)
                        .collect(Collectors.joining(", "));
                System.out.println(listString);
            }
            else if(op == 9){
                String listString = listaPaciente.stream().map(Paciente::toString)
                        .collect(Collectors.joining(", "));
                System.out.println(listString);
            }
            else if(op == 10){
                String listString = listaProfissional.stream().map(Profissional::toString)
                        .collect(Collectors.joining(", "));
                System.out.println(listString);
            }

            System.out.println("##Bem vindo ao Hemonucleo##\n");
            System.out.println("Escolha uma opcao abaixo:");
            System.out.println("1. Cadastrar Doador");
            System.out.println("2. Cadastrar Paciente");
            System.out.println("3. Cadastrar Profissional");
            System.out.println("4. Doar Sangue");
            System.out.println("5. Transfusao de Sangue");
            System.out.println("6. Visualizar Doacoes");
            System.out.println("7. Visualizar Transfusoes");
            System.out.println("8. Visualizar Doadores");
            System.out.println("9. Visualizar Pacientes");
            System.out.println("10. Visualizar Profissionais");

            op = Integer.parseInt(scanner.nextLine());

        }while (op != 0);
    }
}
