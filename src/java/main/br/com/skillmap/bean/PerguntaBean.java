package br.com.skillmap.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import br.com.skillmap.dao.DAO;
import br.com.skillmap.entity.Pergunta;

@ManagedBean
public class PerguntaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Pergunta pergunta = new Pergunta();

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}
	
	public void gravar(){
		new DAO<Pergunta>(Pergunta.class).adiciona(this.pergunta);
		pergunta = new Pergunta();
	}
}
