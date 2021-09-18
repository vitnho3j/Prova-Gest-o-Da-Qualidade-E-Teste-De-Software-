public class Convenio {
    private String nome;
    private float valor;

    public Convenio(String nome){
        if (nome == null){
            throw new NullPointerException("Descrição é obrigatória");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null){
            throw new NullPointerException("Descrição é obrigatória");
        }
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
