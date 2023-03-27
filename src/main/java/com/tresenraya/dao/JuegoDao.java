package com.tresenraya.dao;

import java.util.List;

public interface JuegoDao {
	
	public void guardarUsuario(String usuario);
	
	public String turno();
	
	public String usuario();
	
	public String jugar(String turno);
	
	public void reiniciar();
	
	public String cambiarTurno(String turno);
	
	public List<String> filtrarBotones(String btn1,String btn2,String btn3,
										String btn4,String btn5,String btn6,
										String btn7,String btn8,String btn9);
	
	public String verificarGanador(String turno);
	
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
