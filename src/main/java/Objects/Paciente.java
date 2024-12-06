package Objects;

import java.util.List;

public class Paciente extends Pessoa {

    private String cpf;
    private String dataNascimento;
    private String endereco;
    private Medico medico;
    private List<Medicamento> medicamentos;
    private List<Dispositivo> dispositivo;

    public Paciente(String nome, String email, String telefone, String cpf, String dataNascimento, String endereco) {
        super(nome, email, telefone);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getMedico() {
        if(this.medico == null){
            return "Vazio";
        }else{
            return this.medico.getNome();
        }
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<Dispositivo> getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(List<Dispositivo> dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public String toString() {
        return getNome() + " | cpf = " + getCpf() + " | dataNascimento = " + getDataNascimento() + " | endereco = " + getEndereco() + " | telefone = " + getTelefone() + " | email = " + getEmail() + " | Medico = " + getMedico();
    }
}


