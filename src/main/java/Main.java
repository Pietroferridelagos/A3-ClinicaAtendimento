import Management.Clinica;
import Objects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Clinica clinicaStarBem = new Clinica();

        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();
        List<Medicamento> medicamentos = new ArrayList<>();
        List<Dispositivo> dispositivos = new ArrayList<>();
        List<PrescricaoMedica> prescricoes = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Cadastrar Médico");
            System.out.println("3. Listar Pacientes");
            System.out.println("4. Listar Médicos");
            System.out.println("5. Cadastrar Medicamento");
            System.out.println("6. Cadastrar Dispositivo");
            System.out.println("7. Listar Medicamentos");
            System.out.println("8. Listar Dispositivos");
            System.out.println("9. Criar Prescrição Médica");
            System.out.println("10. Listar Prescrição Médica");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1: // Cadastrar Paciente
                    System.out.print("Digite o nome do paciente: ");
                    String nomePaciente = scanner.nextLine();
                    System.out.print("Digite o cpf do paciente: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite a data de nascimento do paciente: ");
                    String dataNascimento = scanner.nextLine();
                    System.out.print("Digite o endereço do paciente: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Digite o telefone do paciente: ");
                    String telefonePaciente = scanner.nextLine();
                    System.out.print("Digite o e-mail do paciente: ");
                    String emailPaciente = scanner.nextLine();
                    Paciente paciente = new Paciente(nomePaciente, emailPaciente, telefonePaciente, cpf, dataNascimento, endereco);
                    pacientes.add(paciente);
                    System.out.println("Paciente cadastrado com sucesso!");
                    break;

                case 2: // Cadastrar Médico
                    System.out.print("Digite o nome do médico: ");
                    String nomeMedico = scanner.nextLine();
                    System.out.print("Digite a especialidade do médico: ");
                    String especialidade = scanner.nextLine();
                    System.out.print("Digite o crm do médico: ");
                    String crm = scanner.nextLine();
                    System.out.print("Digite o email do médico: ");
                    String emailMedico = scanner.nextLine();
                    System.out.print("Digite o telefone do médico: ");
                    String telefoneMedico = scanner.nextLine();
                    Medico medico = new Medico(nomeMedico, emailMedico, telefoneMedico, especialidade, crm);
                    medicos.add(medico);
                    System.out.println("Médico cadastrado com sucesso!");
                    break;

                case 3: // Listar Pacientes
                    System.out.println("Lista de Pacientes:");
                    for (Paciente p: pacientes) {
                        System.out.println("- " + p);
                    }
                    break;

                case 4: // Listar Médicos
                    System.out.println("Lista de Médicos:");
                    for (Medico m : medicos) {
                        System.out.println("- " + m);
                    }
                    break;

                case 5: // Cadastrar Medicamento
                    System.out.print("Digite o nome do medicamento: ");
                    String nomeMedicamento = scanner.nextLine();
                    System.out.print("Digite a dosagem do medicamento: ");
                    String dosagem = scanner.nextLine();
                    System.out.print("Digite a frequencia do medicamento: ");
                    String frequencia = scanner.nextLine();
                    System.out.print("Digite a descricao do medicamento: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Digite a dataPrescricao do medicamento: ");
                    String dataPrescricao = scanner.nextLine();
                    Medicamento medicamento = new Medicamento(nomeMedicamento, dosagem,frequencia, descricao, dataPrescricao);
                    medicamentos.add(medicamento);
                    System.out.println("Medicamento cadastrado com sucesso!");
                    break;

                case 6: // Cadastrar Dispositivo
                    System.out.print("Digite o tipo do dispositivo: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Digite a marca do dispositivo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo do dispositivo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o status do dispositivo: ");
                    String status = scanner.nextLine();
                    System.out.print("Digite o valoresReferencia do dispositivo: ");
                    String valoresReferencia = scanner.nextLine();
                    Dispositivo dispositivo = new Dispositivo(tipo, marca, modelo, status, valoresReferencia);
                    dispositivos.add(dispositivo);
                    System.out.println("Dispositivo cadastrado com sucesso!");
                    break;

                case 7: // Listar Medicamentos
                    System.out.println("Lista de Medicamentos:");
                    for (Medicamento med : medicamentos) {
                        System.out.println("- " + med);
                    }
                    break;

                case 8: // Listar Dispositivos
                    System.out.println("Lista de Dispositivos:");
                    for (Dispositivo disp : dispositivos) {
                        System.out.println("- " + disp);
                    }
                    break;

                case 9: // Prescrição Médica
                    if(pacientes.isEmpty() || medicos.isEmpty() || medicamentos.isEmpty()){
                        System.out.println("Não há os cadastros de pacientes, médicos ou medicamentos necessários!!!");
                        break;
                    }else{
                        System.out.println("Digite o nome para a prescrição Médica:");
                        String nome = scanner.nextLine();
                        System.out.println("Escolha o medicamento: (Digite o número da ordem dele!!)");
                        for(int i = 0; i < medicamentos.size(); i++){
                            System.out.println(i+1 + " - " + medicamentos.get(i));
                        }
                        int medicamentoOpcao = scanner.nextInt();
                        Medicamento medicamentoGet = medicamentos.get(medicamentoOpcao - 1);
                        System.out.println("Escolha o médico responsável: (Digite o número da ordem dele!!)");
                        for(int i = 0; i < medicos.size(); i++){
                            System.out.println(i+1 + " - " + medicos.get(i));
                        }
                        int medicoOpcao = scanner.nextInt();
                        Medico medicoGet = medicos.get(medicoOpcao - 1);
                        System.out.println("Escolha o paciente da prescrição: (Digite o número da ordem dele!!)");
                        for(int i = 0; i < pacientes.size(); i++){
                            System.out.println(i+1 + " - " + pacientes.get(i));
                        }
                        int pacienteOpcao = scanner.nextInt();
                        Paciente pacienteGet = pacientes.get(pacienteOpcao - 1);

                        PrescricaoMedica pM = new PrescricaoMedica(nome, medicamentoGet, medicoGet, pacienteGet);

                        prescricoes.add(pM);
                        clinicaStarBem.AdicioanarMedicoEmPaciente(medicoGet, pacienteGet);
                        System.out.println("Prescrição registrada com sucesso!");
                        break;
                    }

                case 10:
                    for(PrescricaoMedica p : prescricoes){
                        System.out.println("Lista de Prescrições:");
                        System.out.println(prescricoes);
                    }
                    break;

                case 0: // Sair
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
