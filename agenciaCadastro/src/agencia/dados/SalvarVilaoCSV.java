package agencia.dados;

import agencia.negocio.Vilao;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SalvarVilaoCSV {

    private static final String FILE_NAME = "viloes.csv";

    // Salvar um vilão no CSV
    public void inserirVilao(Vilao vilao) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            // Converte o vilão para linha CSV
            out.println(
                vilao.getNome() + "," +
                vilao.getHabilidades() + "," +
                vilao.getSexo() + "," +
                vilao.getCidade() + "," +
                vilao.getNivelPoder()
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ler todos os vilões do CSV
    public List<Vilao> lerVilao() {
        List<Vilao> viloes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");

                if (dados.length == 5) {
                    String nome = dados[0];
                    String habilidades = dados[1];
                    String sexo = dados[2];
                    String cidade = dados[3];
                    int nivelPoder = Integer.parseInt(dados[4]);

                    Vilao v = new Vilao(nome, habilidades, sexo, cidade, nivelPoder);
                    viloes.add(v);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de vilões ainda não existe, será criado na primeira inserção.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return viloes;
    }
}
