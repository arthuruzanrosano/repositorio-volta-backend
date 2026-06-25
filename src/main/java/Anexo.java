public class Anexo {
    // declaração das variáveis
    private int id;
    private Ocorrencia ocorrencia;
    private int ocorencia_id = ocorrencia.getId();
    private String url_arquivo;
    private String tipo_arquivo;

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

    public int getOcorencia_id() {
        return ocorencia_id;
    }

    public void setOcorencia_id(int ocorencia_id) {
        this.ocorencia_id = ocorencia_id;
    }

    public String getUrl_arquivo() {
        return url_arquivo;
    }

    public void setUrl_arquivo(String url_arquivo) {
        this.url_arquivo = url_arquivo;
    }

    public String getTipo_arquivo() {
        return tipo_arquivo;
    }

    public void setTipo_arquivo(String tipo_arquivo) {
        this.tipo_arquivo = tipo_arquivo;
    }
}
