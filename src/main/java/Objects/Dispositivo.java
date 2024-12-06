package Objects;

public class Dispositivo {
    private String tipo;
    private String marca;
    private String modelo;
    private String status;
    private String valoresReferencia;

    public Dispositivo(String tipo, String marca, String modelo, String status, String valoresReferencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.status = status;
        this.valoresReferencia = valoresReferencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValoresReferencia() {
        return valoresReferencia;
    }

    public void setValoresReferencia(String valoresReferencia) {
        this.valoresReferencia = valoresReferencia;
    }
    @Override
    public String toString() {
        return "Dispositivo{tipo= " + getTipo() + ", marca= " + getMarca() + ", modelo= " + getModelo() + "status= " + getStatus() + ", valoresReferencia= " + getValoresReferencia() + "}";
    }
}
