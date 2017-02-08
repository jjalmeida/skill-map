package br.com.skillmap.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.skillmap.dao.DAO;
import br.com.skillmap.entity.Pergunta;
import br.com.skillmap.entity.Prova;
import br.com.skillmap.entity.Resposta;

@ManagedBean
public class ConsultaResultadosBean {

	private Prova prova;

	private Resposta resposta;

	private Pergunta pergunta;

	private int contResposta;

	private int contRespostaCorreta;

	private int contProva;

	private int contRespostaPorAreaDeAtuacao;

	private List<Prova> listaProva;

	private List<Resposta> listaResposta;

	private int contEntrepriseVault;
	private int contVDI;
	private int contGeraisItauN3;
	private int contTelecom;
	private int contFieldOperacao;
	private int contFieldProcesso;
	private int contMobilidade;
	private int contPerformance;
	private int contAsset;
	private int contGmido;

	public int getContGmido() {
		return contGmido;
	}

	public List<Prova> getListaProva() {
		return listaProva;
	}

	public List<Resposta> getListaResposta() {
		return listaResposta;
	}

	public Prova getProva() {
		return prova;
	}

	public Resposta getResposta() {
		return resposta;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public int getContResposta() {
		return contResposta;
	}

	public int getContRespostaCorreta() {
		return contRespostaCorreta;
	}

	public int getContProva() {
		return contProva;
	}

	public int getContRespostaPorAreaDeAtuacao() {
		return contRespostaPorAreaDeAtuacao;
	}

	public int getContEntrepriseVault() {
		return contEntrepriseVault;
	}

	public int getContVDI() {
		return contVDI;
	}

	public int getContGeraisItauN3() {
		return contGeraisItauN3;
	}

	public int getContTelecom() {
		return contTelecom;
	}

	public int getContFieldOperacao() {
		return contFieldOperacao;
	}

	public int getContFieldProcesso() {
		return contFieldProcesso;
	}

	public int getContMobilidade() {
		return contMobilidade;
	}

	public int getContPerformance() {
		return contPerformance;
	}

	public int getContAsset() {
		return contAsset;
	}

	@PostConstruct
	public void init() {
		listaProva = new DAO<Prova>(Prova.class).listaTodos();
		contProva = listaProva.size();

		listaResposta = new DAO<Resposta>(Resposta.class).listaTodos();

		for (Resposta r : listaResposta) {
			if (r.getPergunta().getAreaAtuacao().equals("Entreprise Vault")
					&& r.isAcerto())
				contEntrepriseVault += 1;
			if (r.getPergunta().getAreaAtuacao().equals("VDI") && r.isAcerto())
				contVDI += 1;
			if (r.getPergunta().getAreaAtuacao().equals("Gerais Itau N3")
					&& r.isAcerto())
				contGeraisItauN3 += 1;
			if (r.getPergunta().getAreaAtuacao().equals("TELECOM")
					&& r.isAcerto())
				contTelecom += 1;
			if (r.getPergunta().getAreaAtuacao().equals("Field - Operação")
					&& r.isAcerto())
				contFieldOperacao += 1;
			if (r.getPergunta().getAreaAtuacao().equals("Field - Processo")
					&& r.isAcerto())
				contFieldProcesso += 1;
			if (r.getPergunta().getAreaAtuacao().equals("Field - Mobilidade")
					&& r.isAcerto())
				contMobilidade += 1;
			if (r.getPergunta().getAreaAtuacao().equals("ASSET")
					&& r.isAcerto())
				contAsset += 1;
			if (r.getPergunta().getAreaAtuacao().equals("Field - Performance")
					&& r.isAcerto())
				contPerformance += 1;
			if (r.getPergunta().getAreaAtuacao().equals("Gravação de Midias e Downloads")
					&& r.isAcerto())
				contGmido += 1;
		}
	}

}
