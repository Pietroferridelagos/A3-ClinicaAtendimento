package Objects;

public class PrescricaoMedica {
    private String nome;
    private Medicamento medicamentos;
    private Medico medico;
    private Paciente paciente;

    public PrescricaoMedica(String nomeMedicamento, Medicamento medicamentos, Medico medico, Paciente paciente) {
        this.nome = nomeMedicamento;
        this.medicamentos = medicamentos;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Medicamento getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamento medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Nome = " + getNome() + " | Medicamentos = " +  getMedicamentos() + " | Medico = " + getMedico() + " | Paciente = " + getPaciente();
    }
}