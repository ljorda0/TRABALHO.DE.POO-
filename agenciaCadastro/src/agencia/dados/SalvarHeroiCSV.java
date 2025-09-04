package agencia.dados;

import agencia.negocio.Alienigena;
import agencia.negocio.Ciborgue;
import agencia.negocio.Heroi;
import agencia.negocio.MetaHumano;
import agencia.negocio.Mutante;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SalvarHeroiCSV {

    private static final String FILE_NAME = "herois.csv";

    public void inserirHeroi(Heroi heroi) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            String linhaBase =
                heroi.getNome() + "," +
                heroi.getCidade() + "," +
                heroi.getHabilidades() + "," +
                heroi.getSexo() + "," +
                heroi.getNivelPoder() + "," +
                heroi.getNivelAmeaca();

            // Identificar a subclasse e salvar atributos específicos
            if (heroi instanceof Mutante) {
                Mutante m = (Mutante) heroi;
                linhaBase += ",Mutante," + m.getIdadePoderes();
            } else if (heroi instanceof Alienigena) {
                Alienigena a = (Alienigena) heroi;
                linhaBase += ",Alienigena," + a.getPlanetaNatal() + a.getCausaDaVinda();
            } else if (heroi instanceof Ciborgue) {
                Ciborgue c = (Ciborgue) heroi;
                linhaBase += ",Tecnologico," + c.getModificacoes();
            } else if (heroi instanceof MetaHumano) {
                MetaHumano mh = (MetaHumano) heroi;
                linhaBase += ",Mistico," + mh.getCausaPoderes();
            }

            out.println(linhaBase);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Heroi> lerHeroi() {
        List<Heroi> herois = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");

                String nome = dados[0];
                String cidade = dados[1];
                String poder = dados[2];
                String sexo = dados[3];
                int nivelPoder = Integer.parseInt(dados[4]);
                int nivelAmeaca = Integer.parseInt(dados[5]);

                String classe = dados[6]; // Mutante, Alienigena, etc.

                Heroi h = null;
                switch (classe) {
                    case "Mutante":
                        int idadeDescoberta = Integer.parseInt(dados[7]);
                        h = new Mutante(nome, cidade, poder, sexo, nivelPoder, nivelAmeaca, idadeDescoberta);
                        break;
                    case "Alienigena":
                        String planeta = dados[7];
                        String motivo = dados[8];
                        h = new Alienigena(nome, cidade, poder, sexo, nivelPoder, nivelAmeaca, motivo, planeta);
                        break;
                    case "Ciborgue":
                        String nivelTec = dados[7];
                        h = new Ciborgue(nome, cidade, poder, sexo, nivelPoder, nivelAmeaca, nivelTec);
                        break;
                    case "MetaHumano":
                        String causaPoderes = dados[7];
                        h = new MetaHumano(nome, cidade, poder, sexo, nivelPoder, nivelAmeaca, causaPoderes);
                        break;
                }

                if (h != null) {
                    herois.add(h);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return herois;
    }
}
