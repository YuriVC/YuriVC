package atividade2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalcularMedia {
	public Map<String, Double> calcularMedias(List<String> linhas) {
		Map<String, Double> medias = new HashMap<>();
		
		for (String linha : linhas) {
			String[] partes = linha.split(" ");
			String nome = partes[0];
			double soma = 0;
			int contador = 0;
			
			for (int i = 1; i < partes.length; i++) {
				soma += Double.parseDouble(partes[i]);
				contador++;
			}
			
			double media = soma / contador;
			medias.put(nome, media);
		}
		return medias;
	}	
}