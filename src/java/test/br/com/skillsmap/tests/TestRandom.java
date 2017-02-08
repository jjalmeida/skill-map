package br.com.skillsmap.tests;

import java.util.List;

import br.com.skillmap.tools.NumerosAleatorios;

public class TestRandom {

	public static void main(String[] args) {
		
		List<Long> num = new NumerosAleatorios().geraNumerosAleatorios(50);
		
		for (Long i : num) {
			System.out.println(i);
		}
		
		System.out.println(num.size());
		

	}

}
