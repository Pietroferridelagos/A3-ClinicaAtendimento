package Objects;

public class Medicamento {

    private String nome;
    private String dosagem;
    private String frequencia;
    private String descricao;
    private String dataPrescricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataPrescricao() {
        return dataPrescricao;
    }

    public void setDataPrescricao(String dataPrescricao) {
        this.dataPrescricao = dataPrescricao;
    }

    public Medicamento(String nome, String dosagem, String frequencia, String descricao, String dataPrescricao) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.descricao = descricao;
        this.dataPrescricao = dataPrescricao;


    }
    @Override
    public String toString() {
        return getNome() + " | dosagem = " + getDosagem() + " | frequencia = " + getFrequencia() + " | descricao = " + getDescricao() + " | dataPrescricao = " + getDataPrescricao();
    }
}
