package exerciciosjava.heranca.Ex03;

import java.time.LocalDate;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Mecanico mec = new Mecanico("Carlos", 3500.0);
        Proprietario prop = new Proprietario("João", "99999-9999");

        Carro carro = new Carro("ABC-1234", "Fiat Uno", 5);
        Moto moto = new Moto("XYZ-5678", "Honda CG", 150);

        prop.adicionarVeiculo(carro);
        prop.adicionarVeiculo(moto);

        carro.adicionarManutencao(new Manutencao(LocalDate.now(), 250.0, mec, carro));
        moto.adicionarManutencao(new Manutencao(LocalDate.now().minusDays(10), 180.0, mec, moto));

        Iterator<Veiculo> it = prop.obterVeiculos();
        while (it.hasNext()) {
            Veiculo v = it.next();
            System.out.println(v);
            Iterator<Manutencao> manuts = v.obterManutencoes();
            while (manuts.hasNext()) {
                System.out.println("  " + manuts.next());
                System.out.printf("------------------------------------\n" +
                        "");
            }
        }
    }
}

