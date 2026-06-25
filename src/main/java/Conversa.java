import java.time.LocalTime;

public class Conversa {
    //declaração das variáveis
    private int id;
    private Empresa empresa;
    private int empresa_id = empresa.getId();
    private Cooperativa cooperativa;
    private int cooperativa_id = cooperativa.getId();
    private Coleta coleta;
    private int coleta_id = coleta.getId();
    private LocalTime criada_em;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(int empresa_id) {
        this.empresa_id = empresa_id;
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

    public LocalTime getCriada_em() {
        return criada_em;
    }

    public void setCriada_em(LocalTime criada_em) {
        this.criada_em = criada_em;
    }
}