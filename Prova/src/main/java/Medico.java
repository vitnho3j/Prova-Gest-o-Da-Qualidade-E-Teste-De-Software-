import java.util.Date;

public class Medico extends Pessoa {

    public Medico(Especialidade especialidade) {
        if (especialidade == null){
            throw new NullPointerException("Especialidade é obrigatória!");
        }
        this.especialidade = especialidade;
    }

    private Date dataAdmissao;
    private String CRM;
    private Especialidade especialidade;


    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade.getNome();
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null){
            throw new NullPointerException("Especialidade é obrigatória!");
        }
        this.especialidade.setNome(especialidade);
    }
}




