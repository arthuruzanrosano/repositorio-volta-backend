import java.time.LocalTime;

public class Mensagem {
    // declaração de variaveis
    private int id;
    private Conversa conversa;
    private int conversa_id = conversa.getId();
    private Usuario usuario;
    private int usuario_id = usuario.getId();
    private String texto;
    private boolean denunciada;
    private LocalTime enviada_em;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conversa getConversa() {
        return conversa;
    }

    public void setConversa(Conversa conversa) {
        this.conversa = conversa;
    }

    public int getConversa_id() {
        return conversa_id;
    }

    public void setConversa_id(int conversa_id) {
        this.conversa_id = conversa_id;
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

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isDenunciada() {
        return denunciada;
    }

    public void setDenunciada(boolean denunciada) {
        this.denunciada = denunciada;
    }

    public LocalTime getEnviada_em() {
        return enviada_em;
    }

    public void setEnviada_em(LocalTime enviada_em) {
        this.enviada_em = enviada_em;
    }
}
