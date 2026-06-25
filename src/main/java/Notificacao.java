import java.time.LocalTime;

public class Notificacao {

    //declaração das variáveis
    private int id;
    private Usuario usuario;
    private int usuario_id = usuario.getId();
    private String tipo;
    private String titulo;
    private String mensagem;
    private boolean lida;
    private LocalTime criada_em;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }

    public LocalTime getCriada_em() {
        return criada_em;
    }

    public void setCriada_em(LocalTime criada_em) {
        this.criada_em = criada_em;
    }
}
