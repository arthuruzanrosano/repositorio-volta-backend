import java.time.LocalTime;
public class Ocorrencia {

    // declaração das variaveis
    private int id;
    private Empresa empresa;
    private int empresa_id = empresa.getId();
    private Usuario usuario;
    private int usuario_id = usuario.getId();
    private Area area;
    private int area_id = area.getId();
    private Tipo_residuo tipoResiduo;
    private int tipoResiduo_id = tipoResiduo.getId();
    private String foto_url;
    private String nivel_conta;
    private double quantidade_estimada;
    private String prioridade;
    private String status;
    private LocalTime data_registro;


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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public Tipo_residuo getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(Tipo_residuo tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public int getTipoResiduo_id() {
        return tipoResiduo_id;
    }

    public void setTipoResiduo_id(int tipoResiduo_id) {
        this.tipoResiduo_id = tipoResiduo_id;
    }

    public String getFoto_url() {
        return foto_url;
    }

    public void setFoto_url(String foto_url) {
        this.foto_url = foto_url;
    }

    public String getNivel_conta() {
        return nivel_conta;
    }

    public void setNivel_conta(String nivel_conta) {
        this.nivel_conta = nivel_conta;
    }

    public double getQuantidade_estimada() {
        return quantidade_estimada;
    }

    public void setQuantidade_estimada(double quantidade_estimada) {
        this.quantidade_estimada = quantidade_estimada;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalTime getData_registro() {
        return data_registro;
    }

    public void setData_registro(LocalTime data_registro) {
        this.data_registro = data_registro;
    }


}
