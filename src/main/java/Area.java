public class Area {

    //declaração das variáveis
    private int id;
    private Empresa empresa;
    private int empresa_id = empresa.getId();
    private String nome_setor;
    private String descricao_localizacao;

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

    public String getNome_setor() {
        return nome_setor;
    }

    public void setNome_setor(String nome_setor) {
        this.nome_setor = nome_setor;
    }

    public String getDescricao_localizacao() {
        return descricao_localizacao;
    }

    public void setDescricao_localizacao(String descricao_localizacao) {
        this.descricao_localizacao = descricao_localizacao;
    }





}
