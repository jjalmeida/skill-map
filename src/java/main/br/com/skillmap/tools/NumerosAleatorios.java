package br.com.skillmap.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumerosAleatorios {

	private List<Long> listaNumeroAleatorios = new ArrayList<Long>();

	public List<Long> geraNumerosAleatorios(Integer qtdQuestoesCadastradasNoBanco) {
		int cont = 1;
		Random sorteio = new Random();
		Long num;

		do {
			num = (long) sorteio.nextInt(qtdQuestoesCadastradasNoBanco + 1);
		} while (num == 0);

		listaNumeroAleatorios.add(num);
		do {
			num = (long) sorteio.nextInt(qtdQuestoesCadastradasNoBanco + 1);
			if (!listaNumeroAleatorios.contains(num) && (num != 0)) {
				cont++;
				listaNumeroAleatorios.add(num);
			}

		} while (cont < 50);

		return listaNumeroAleatorios;

	}

}
