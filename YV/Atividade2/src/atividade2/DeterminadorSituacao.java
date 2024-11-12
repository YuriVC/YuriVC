package atividade2;

import java.util.HashMap;
import java.util.Map;

public class DeterminadorSituacao {
	public Map<String, String> determinarSituacoes(Map<String, Double> medias) {
		Map<String, String> situacoes = new HashMap<>();
		
		for (Map.Entry<String, Double> entrada : medias.entrySet()) {
			String nome = entrada.getKey();
			double media = entrada.getValue();
			
			String situacao = (media >= 6) ? "aprovado" : "reprovado";
			situacoes.put(nome, situacao);
		}
		return situacoes;		
	}
}
