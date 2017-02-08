package br.com.skillmap.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.skillmap.dao.DAO;
import br.com.skillmap.entity.Pergunta;
import br.com.skillmap.entity.Prova;
import br.com.skillmap.entity.Resposta;
import br.com.skillmap.entity.Site;
import br.com.skillmap.tools.NumerosAleatorios;

/**
 * Classe responsavel por recuperar as perguntas do banco e gerar armazenar as
 * respostas.
 * 
 * @author jojalmeida
 *
 */
@ManagedBean
@SessionScoped
public class ProvaBean {

	/**
	 * 
	 */
	//Declaração de variaveis
	private Prova prova = new Prova();
	
	private long idSite;

	private Pergunta pergunta;

	private Resposta resposta;

	private List<Pergunta> listaDePergunta;
	
	private List<Resposta> listaDeResposta = new ArrayList<Resposta>();
	
	private int contador = 0;
	
	private int qtdAcertos = 0;

	public int getQtdAcertos() {
		return qtdAcertos;
	}

	public void setQtdAcertos(int qtdAcertos) {
		this.qtdAcertos = qtdAcertos;
	}

	private String respostaUsuario;
	
	private List<Site> listaSite;
		
	//Getters and setters	
	public List<Resposta> getListaDeResposta() {
		return listaDeResposta;
	}

	public long getIdSite() {
		return idSite;
	}

	public void setIdSite(long idSite) {
		this.idSite = idSite;
	}

	public String getRespostaUsuario() {
		return respostaUsuario;
	}

	public void setRespostaUsuario(String respostaUsuario) {
		this.respostaUsuario = respostaUsuario;
	}

	public int getContador() {
		return contador;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}

	public Resposta getResposta() {
		return resposta;
	}

	public void setResposta(Resposta resposta) {
		this.resposta = resposta;
	}

	public List<Pergunta> getListaDePergunta() {
		return listaDePergunta;
	}
		
	public List<Site> getListaSite() {
		listaSite = new DAO<Site>(Site.class).listaTodos();
		return listaSite;
	}

	//Metodos
	public String comecaProva() {	
		this.prova.setData(Calendar.getInstance().getTime());
		
		
		this.listaDePergunta = getListaDePerguntas();
		this.pergunta = listaDePergunta.get(contador);
		
		//System.out.println(this.prova.getLogin());
		System.out.println(this.prova.getNome());
		System.out.println(this.prova.getData());
		
		return "prova";
	}
	
	/**
	 * Faz a gravação da prova no banco
	 * @return: Pagina de resultados por analista
	 */
	public String finalizaProva(){
		this.prova.setResposta(this.listaDeResposta);
		this.prova.setSite(new DAO<Site>(Site.class).buscaPorId(idSite));
		new DAO<Prova>(Prova.class).adiciona(this.prova);
		this.prova = new Prova();
		
		return "fim";
	}
	
	public String proximaPergunta(){
		this.contador += 1;
		
		this.resposta = new Resposta();
		this.resposta.setPergunta(this.pergunta);
		this.resposta.setResposta(this.respostaUsuario);
		this.resposta.setAcerto(verificaAcerto(this.resposta));
		new DAO<Resposta>(Resposta.class).adiciona(this.resposta);
		
		this.listaDeResposta.add(this.resposta);
		
		if (contador == 50){			
			return "concluir";
		}
		
		this.pergunta = listaDePergunta.get(contador);
		return null;
	}
	
	public List<Pergunta> getListaDePerguntas(){
		
		List<Pergunta> lista = new ArrayList<Pergunta>();
		List<Long> random = new NumerosAleatorios().geraNumerosAleatorios(50);
		
		for (Long l : random) {
			Pergunta p = new DAO<Pergunta>(Pergunta.class).buscaPorId(l);
			lista.add(p);
		}
		
		return lista;
	}
	
	public boolean verificaAcerto(Resposta resp){
		if (resp.getPergunta().getRespostaCorreta().equals(resp.getResposta())){
			this.qtdAcertos += 1;
			return true;
		}
		return false;
	}
}
