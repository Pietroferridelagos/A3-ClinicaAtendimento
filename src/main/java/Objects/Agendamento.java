package Objects;

public class Agendamento {
    private String dataHora;
    private String diagnostico;
    private String prescricao;

    public Agendamento(String dataHora, String diagnostico, String prescricao) {
        this.dataHora = dataHora;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }
    @Override
    public String toString() {
        return "Agendamento{dataHora= " + getDataHora() + ", diagnostico= " + getDiagnostico() + ", prescricao= " + getPrescricao() + "}";
    }
}
