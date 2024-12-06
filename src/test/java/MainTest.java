import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import Management.*;
import Objects.*;

public class MainTest {

    private Clinica clinicaStarBem;
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Medicamento> medicamentos;
    private List<Dispositivo> dispositivos;
    private List<PrescricaoMedica> prescricoes;

    @BeforeEach
    public void setUp() {
        clinicaStarBem = new Clinica();
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        medicamentos = new ArrayList<>();
        dispositivos = new ArrayList<>();
        prescricoes = new ArrayList<>();
    }

    @Test
    public void testCadastrarPaciente() {
        Paciente paciente = new Paciente("João Silva", "joao@gmail.com", "123456789", "123.456.789-00", "01/01/1990", "Rua A, 123");
        pacientes.add(paciente);
        assertEquals(1, pacientes.size());
        assertEquals("João Silva", pacientes.get(0).getNome());
    }

    @Test
    public void testCadastrarMedico() {
        Medico medico = new Medico("Dra. Maria", "maria@gmail.com", "987654321", "Cardiologia", "CRM12345");
        medicos.add(medico);
        assertEquals(1, medicos.size());
        assertEquals("Dra. Maria", medicos.get(0).getNome());
    }

    @Test
    public void testCadastrarMedicamento() {
        Medicamento medicamento = new Medicamento("Paracetamol", "500mg", "2 vezes ao dia", "Analgesico", "01/12/2023");
        medicamentos.add(medicamento);
        assertEquals(1, medicamentos.size());
        assertEquals("Paracetamol", medicamentos.get(0).getNome());
    }

    @Test
    public void testCadastrarDispositivo() {
        Dispositivo dispositivo = new Dispositivo("Monitor de Pressão", "Omron", "HEM-7120", "Disponível", "120/80 mmHg");
        dispositivos.add(dispositivo);
        assertEquals(1, dispositivos.size());
        assertEquals("Monitor de Pressão", dispositivos.get(0).getTipo());
    }

    @Test
    public void testCriarPrescricaoMedica() {
        // Configurar os dados necessários para criar uma prescrição
        Paciente paciente = new Paciente("João Silva", "joao@gmail.com", "123456789", "123.456.789-00", "01/01/1990", "Rua A, 123");
        Medico medico = new Medico("Dra. Maria", "maria@gmail.com", "987654321", "Cardiologia", "CRM12345");
        Medicamento medicamento = new Medicamento("Paracetamol", "500mg", "2 vezes ao dia", "Analgesico", "01/12/2023");

        pacientes.add(paciente);
        medicos.add(medico);
        medicamentos.add(medicamento);

        PrescricaoMedica prescricao = new PrescricaoMedica("Prescrição João", medicamento, medico, paciente);
        prescricoes.add(prescricao);

        assertEquals(1, prescricoes.size());
        assertEquals("Prescrição João", prescricoes.get(0).getNome());
        assertEquals(paciente, prescricoes.get(0).getPaciente());
        assertEquals(medico, prescricoes.get(0).getMedico());
        assertEquals(medicamento, prescricoes.get(0).getMedicamentos());
    }
}
