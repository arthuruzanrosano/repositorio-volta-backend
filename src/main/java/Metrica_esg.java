import java.time.LocalTime;

public class Metrica_esg {

    // declaração de variáveis
    private int id;
    private Empresa empresa;
    private int empresa_id = empresa.getId();
    private String periodo;
    private double total_kg_residuos;
    private double total_kg_reciclado;
    private double porcetagem_reciclagem;
    private LocalTime calculado_em;

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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getTotal_kg_residuos() {
        return total_kg_residuos;
    }

    public void setTotal_kg_residuos(double total_kg_residuos) {
        this.total_kg_residuos = total_kg_residuos;
    }

    public double getTotal_kg_reciclado() {
        return total_kg_reciclado;
    }

    public void setTotal_kg_reciclado(double total_kg_reciclado) {
        this.total_kg_reciclado = total_kg_reciclado;
    }

    public double getPorcetagem_reciclagem() {
        return porcetagem_reciclagem;
    }

    public void setPorcetagem_reciclagem(double porcetagem_reciclagem) {
        this.porcetagem_reciclagem = porcetagem_reciclagem;
    }

    public LocalTime getCalculado_em() {
        return calculado_em;
    }

    public void setCalculado_em(LocalTime calculado_em) {
        this.calculado_em = calculado_em;
    }
}
