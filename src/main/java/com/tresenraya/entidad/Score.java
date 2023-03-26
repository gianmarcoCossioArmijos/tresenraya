package com.tresenraya.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "score")
public class Score {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "score")
	private int score;

	public Score() {
	}

	public Score(String usuario, int score) {
		this.usuario = usuario;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [id=" + id + ", usuario=" + usuario + ", score=" + score + "]";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}
}
