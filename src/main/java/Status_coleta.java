import java.time.LocalTime;

public class Status_coleta {
    private int id;
    private Coleta coleta;
    private int coleta_id = coleta.getId();
    private String status;
    private LocalTime data_alteracao;
    private String observacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coleta getColeta() {
        return coleta;
    }

    public void setColeta(Coleta coleta) {
        this.coleta = coleta;
    }

    public int getColeta_id() {
        return coleta_id;
    }

    public void setColeta_id(int coleta_id) {
        this.coleta_id = coleta_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalTime getData_alteracao() {
        return data_alteracao;
    }

    public void setData_alteracao(LocalTime data_alteracao) {
        this.data_alteracao = data_alteracao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


}
