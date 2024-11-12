package atividade2;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class DutosFiltros {
	public static void main(String[] args) {
		String caminhoEntrada = "C:\\Users\\Aluno\\YV\\Atividade2\\src\\entrada.txt";
		String caminhoSaida = "C:\\Users\\Aluno\\YV\\Atividade2\\src\\saida.txt";
		
		LeitorArquivo leitor = new LeitorArquivo();
		CalcularMedia calculador = new CalcularMedia();
		DeterminadorSituacao determinador = new DeterminadorSituacao();
		EscritorArquivo escritor = new EscritorArquivo();
		
		try {
			List<String> linhas = leitor.lerArquivo(caminhoEntrada);
			
			Map<String, Double> medias = calculador.calcularMedias(linhas);
			
			Map<String, String> situacoes = determinador.determinarSituacoes(medias);
			
			escritor.escreverArquivo(caminhoEntrada, medias, situacoes);
			
			System.out.println("Verifique o arquivo de saida.");
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
