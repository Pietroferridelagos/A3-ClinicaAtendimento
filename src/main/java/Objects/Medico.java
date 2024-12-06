package Objects;

import java.util.ArrayList;
import java.util.List;
import Objects.Paciente;

public class Medico extends Pessoa {

    private String especialidade;
    private String crm;
    private List<Paciente> pacientes;

    public Medico(String nome, String email, String telefone, String especialidade, String crm) {
        super(nome, email, telefone);
        this.especialidade = especialidade;
        this.crm = crm;
        this.pacientes = new ArrayList<>();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Paciente> getPaciente() {
        return this.pacientes;
    }

    public void setPaciente(List<Paciente> paciente) {
        this.pacientes = paciente;
    }

    public void addPaciente(Paciente p){
        this.pacientes.add(p);
    }

    @Override
    public String toString() {
        return getNome() + " | especialidade = " + getEspecialidade() + " | crm= " + getCrm() + " | Pacientes = " + getPaciente();
    }
}
