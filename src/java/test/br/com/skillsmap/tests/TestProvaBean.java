package br.com.skillsmap.tests;

import br.com.skillmap.bean.ConsultaResultadosBean;


public class TestProvaBean {
	
	public static void main(String[] args){		
		/*
		ProvaBean prova = new ProvaBean();
		List<Pergunta> lista = new ArrayList<Pergunta>();
		List<Long> random = new NumerosAleatorios().geraNumerosAleatorios(20);
		Pergunta pt = new Pergunta();
		
		for (Long i : random) {
			Pergunta p = new DAO<Pergunta>(Pergunta.class).buscaPorId(i);
			lista.add(p);
		}
	
		int contator = 0;
		System.out.println(lista.get(contator).getDescricaoPergunta());
		
		
		prova.comeca();
		
		lista = prova.getListaDePergunta();
		int contator = 0;
		pt = lista.get(contator);
		System.out.println(pt.getDescricaoPergunta());
		lista = prova.getListaDePergunta();
		pt = prova.getPergunta();
		System.out.println(pt.getDescricaoPergunta());
		prova.comecaProva();
		prova.proximaPergunta();

		*/
		
		ConsultaResultadosBean crb = new ConsultaResultadosBean();
		
		crb.init();
		
		System.out.println("EV " + crb.getContEntrepriseVault());
		
		System.out.println("VDI " + crb.getContVDI());
				
				
		
	}
	

}
