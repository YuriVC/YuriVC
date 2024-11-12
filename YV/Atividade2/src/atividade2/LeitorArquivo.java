package atividade2;

import java.io.*;
import java.util.*;

public class LeitorArquivo {
	public List<String> lerArquivo(String caminhoArquivo) throws IOException {
		List<String> linhas = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				linhas.add(linha);
			}
		}
		return linhas;
	}

}
