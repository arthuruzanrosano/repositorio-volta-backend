import java.time.LocalTime;

public class Avaliacao {
    private int id;
    private Cooperativa cooperativa;
    private int cooperativa_id = cooperativa.getId();
    private Usuario usuario;
    private int usuario_id= usuario.getId();
    private Coleta coleta;
    private int coleta_id = coleta.getId();
    private int estrelas;
    private String comentario;
    private LocalTime data_avaliacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
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

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalTime getData_avaliacao() {
        return data_avaliacao;
    }

    public void setData_avaliacao(LocalTime data_avaliacao) {
        this.data_avaliacao = data_avaliacao;
    }
}
