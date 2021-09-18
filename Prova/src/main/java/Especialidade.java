public class Especialidade {

    public Especialidade(String nome) {
        if (nome == null){
            throw new NullPointerException("Nome é obrigatório!");
        }
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null){
            throw new NullPointerException("Nome é obrigatório!");
        }
        this.nome = nome;
    }
}
