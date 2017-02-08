package br.com.skillmap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Resposta {

	@Id
	@GeneratedValue
	@Column(name = "id_resposta")
	private long id;

	@Column(nullable = false, length = 500)
	private String resposta;

	@OneToOne
	private Pergunta pergunta;

	private boolean acerto;

	public boolean isAcerto() {
		return acerto;
	}

	public void setAcerto(boolean acerto) {
		this.acerto = acerto;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public void setId(long id) {
		this.id = id;
	}

}
