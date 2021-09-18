import java.util.ArrayList;
import java.util.List;

public class Receita {
    private List<Remedio> remedios;

    public Receita() {
        this.remedios = new ArrayList<Remedio>();
    }

    public void adicionarRemedio(Remedio remedio) {
        if (remedio == null) {
            throw new NullPointerException("Remédio é obrigatório!");
        }
        this.remedios.add(remedio);
    }

    public List<Remedio> getRemedios() {
        return remedios;
    }

    public void setRemedios(List<Remedio> remedios) {
        this.remedios = remedios;
    }

    public int getNumeroRemedio() {
        return this.remedios.size();
    }

    public boolean verificaRemedio(Remedio remedio) {
        if (remedio == null) {
            throw new NullPointerException("Remédio é obrigatório!");
        }
        return this.remedios.contains(remedio);
    }

    public boolean verificaRemedioPorNome(String nome) {
        for (Remedio remedio : this.remedios) {
            if (remedio.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
}

