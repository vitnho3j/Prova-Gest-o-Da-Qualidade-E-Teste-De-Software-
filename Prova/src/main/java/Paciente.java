public class Paciente extends Pessoa {

    private Convenio convenio;
    private Consulta consulta;

    public Convenio getConvenio() {
        return convenio;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public void setConvenio(Convenio convenio) {
        if (convenio == null) {
            throw new NullPointerException("Convênio é obrigatório!");
        }
        this.convenio = convenio;
    }

    public String pegaNomeMedicoDeConsulta() {
        return this.consulta.getMedico();
    }

    public String getNomeConvenio(){
        return this.convenio.getNome();
    }
}
