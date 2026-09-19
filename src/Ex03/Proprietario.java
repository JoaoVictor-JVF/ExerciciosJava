package Ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Proprietario extends Pessoa{
    private String telefone;
    private List<Veiculo> veiculos = new ArrayList<>();

    public Proprietario(String nome, String telefone) {
        super(nome);
        this.telefone = telefone;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public Iterator<Veiculo> obterVeiculos() {
        return Collections.unmodifiableList(this.veiculos).iterator();
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "telefone='" + telefone + '\'' +
                "} " + super.toString();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
