package br.com.systemjmrs.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the questao_tp database table.
 * 
 */
@Entity
@Table(name="questao_tp")
@NamedQuery(name="QuestaoTp.findAll", query="SELECT q FROM QuestaoTp q")
public class QuestaoTp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="questao_tp_id")
	private int questaoTpId;

	private String descricao;

	public QuestaoTp() {
	}

	public int getQuestaoTpId() {
		return this.questaoTpId;
	}

	public void setQuestaoTpId(int questaoTpId) {
		this.questaoTpId = questaoTpId;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}