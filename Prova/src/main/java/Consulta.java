public class Consulta {
    private Receita receita;
    private Medico medico;
    private Paciente paciente;

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public String getMedico() {
        return this.medico.getNome();
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return this.paciente.getNome();
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
