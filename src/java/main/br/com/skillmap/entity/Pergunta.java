package br.com.skillmap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pergunta {

	@Id
	@GeneratedValue
	@Column(name = "id_question")
	private long id;

	@Column(name = "descricao_pergunta", nullable = false, length = 500)
	private String descricaoPergunta;

	@Column(name = "resposta_correta", nullable = false, length = 500)
	private String respostaCorreta;

	@Column(name = "resposta_1", nullable = false, length = 500)
	private String resposta1;

	@Column(name = "resposta_2", nullable = false, length = 500)
	private String resposta2;

	@Column(name = "resposta_3", nullable = false, length = 500)
	private String resposta3;

	@Column(name = "resposta_4", nullable = false, length = 500)
	private String resposta4;

	@Column(name = "area_atuacao", nullable = false)
	private String areaAtuacao;

	public String getDescricaoPergunta() {
		return descricaoPergunta;
	}

	public void setDescricaoPergunta(String descricaoPergunta) {
		this.descricaoPergunta = descricaoPergunta;
	}

	public String getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

	public String getResposta1() {
		return resposta1;
	}

	public void setResposta1(String resposta1) {
		this.resposta1 = resposta1;
	}

	public String getResposta2() {
		return resposta2;
	}

	public void setResposta2(String resposta2) {
		this.resposta2 = resposta2;
	}

	public String getResposta3() {
		return resposta3;
	}

	public void setResposta3(String resposta3) {
		this.resposta3 = resposta3;
	}

	public String getResposta4() {
		return resposta4;
	}

	public void setResposta4(String resposta4) {
		this.resposta4 = resposta4;
	}

	public long getId() {
		return id;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
}
