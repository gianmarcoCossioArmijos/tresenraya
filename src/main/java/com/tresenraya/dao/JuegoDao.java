package com.tresenraya.dao;

import java.util.List;

import com.tresenraya.entidad.Score;

public interface JuegoDao {

	public List<Score> getScores();
	
	public void guardarUsuario(String usuario);
	
	public String turno();
	
	public String usuario();
	
	public String jugar(String turno);
	
	public void reiniciar();
	
	public String cambiarTurno(String turno);
	
	public String btn1(String jugada);
	
	public String btn2(String jugada);
	
	public String btn3(String jugada);
	
	public String btn4(String jugada);
	
	public String btn5(String jugada);
	
	public String btn6(String jugada);
	
	public String btn7(String jugada);
	
	public String btn8(String jugada);
	
	public String btn9(String jugada);
}
