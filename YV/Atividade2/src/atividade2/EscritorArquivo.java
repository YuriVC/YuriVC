package atividade2;

import java.io.*;
import java.util.Map;

public class EscritorArquivo {
	public void escreverArquivo(String caminhoArquivo, Map<String, Double> medias, Map<String, String> situacoes) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
			for (String nome : medias.keySet()) {
				double media = medias.get(nome);
				String situacao = situacoes.get(nome);
				bw.write(nome + " " + String.format("%.2f", media) + " " + situacao);
				bw.newLine();
			}
		}
	}

}
