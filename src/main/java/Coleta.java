import java.time.LocalTime;

public class Coleta {

    //declaração das variáveis
    private int id;
    private Ocorrencia ocorrencia;
    private int ocorrencia_id = ocorrencia.getId();
    private Cooperativa cooperativa;
    private int cooperativa_id = cooperativa.getId();
    private LocalTime data_solicitacao;
    private LocalTime data_agendada;
    private String status_atual;
    private String tipo_coleta;
    private boolean urgente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public int getOcorrencia_id() {
        return ocorrencia_id;
    }

    public void setOcorrencia_id(int ocorrencia_id) {
        this.ocorrencia_id = ocorrencia_id;
    }

    public Cooperativa getCooperativa() {
        return cooperativa;
    }

    public void setCooperativa(Cooperativa cooperativa) {
        this.cooperativa = cooperativa;
    }

    public int getCooperativa_id() {
        return cooperativa_id;
    }

    public void setCooperativa_id(int cooperativa_id) {
        this.cooperativa_id = cooperativa_id;
    }

    public LocalTime getData_solicitacao() {
        return data_solicitacao;
    }

    public void setData_solicitacao(LocalTime data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
    }

    public LocalTime getData_agendada() {
        return data_agendada;
    }

    public void setData_agendada(LocalTime data_agendada) {
        this.data_agendada = data_agendada;
    }

    public String getStatus_atual() {
        return status_atual;
    }

    public void setStatus_atual(String status_atual) {
        this.status_atual = status_atual;
    }

    public String getTipo_coleta() {
        return tipo_coleta;
    }

    public void setTipo_coleta(String tipo_coleta) {
        this.tipo_coleta = tipo_coleta;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }
}
