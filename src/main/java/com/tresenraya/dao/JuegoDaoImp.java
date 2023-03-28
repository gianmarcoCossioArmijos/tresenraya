package com.tresenraya.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class JuegoDaoImp implements JuegoDao {
	
	public static String nombre;
	public static String btn1;
	public static String btn2;
	public static String btn3;
	public static String btn4;
	public static String btn5;
	public static String btn6;
	public static String btn7;
	public static String btn8;
	public static String btn9;

	@Override
	public String turno() {
		
		String turno;
		int numero = (int)(Math.random() * 2 + 1);
		
		if(numero == 1) {
			turno = "jugador";
		} else {
			turno = "rival";
		}
		return turno;
	}

	@Override
	public void guardarUsuario(String usuario) {
		
		nombre = usuario;
	}

	@Override
	public String usuario() {
		
		return nombre;
	}

	@Override
	public String jugar(String turno) {
		
		String jugada;
		
		if (turno.equals("rival")) {
			
			jugada = "X";
		} else {
			
			jugada = "O";
		}
		
		return jugada;
	}

	@Override
	public String cambiarTurno(String turno) {
		
		String cambioTurno;
		
		if (turno.equals("rival")) {
			cambioTurno = "jugador";
		} else {
			cambioTurno = "rival";
		}
		return cambioTurno;
	}
	
	@Override
	public void reiniciar() {
		
		btn1 = null;
		btn2 = null;
		btn3 = null;
		btn4 = null;
		btn5 = null;
		btn6 = null;
		btn7 = null;
		btn8 = null;
		btn9 = null;
	}
	
	@Override
	public List<String> filtrarBotones(String btn1,String btn2,String btn3,
										String btn4,String btn5,String btn6,
										String btn7,String btn8,String btn9) {
		
		List<String> botones = new ArrayList<>();
		if (btn1 == null) btn1 = "";
		if (btn2 == null) btn2 = "";
		if (btn3 == null) btn3 = "";
		if (btn4 == null) btn4 = "";
		if (btn5 == null) btn5 = "";
		if (btn6 == null) btn6 = "";
		if (btn7 == null) btn7 = "";
		if (btn8 == null) btn8 = "";
		if (btn9 == null) btn9 = "";
		botones.add(btn1);
		botones.add(btn2);
		botones.add(btn3);
		botones.add(btn4);
		botones.add(btn5);
		botones.add(btn6);
		botones.add(btn7);
		botones.add(btn8);
		botones.add(btn9);

		return botones;
	}
	
	@Override
	public String verificarGanador(String turno) {
		
		List<String> botones = filtrarBotones(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
		
		if (turno.equals("rival")) {
				
			if (botones.get(0).equals("X") && botones.get(3).equals("X") && botones.get(6).equals("X")) return new String("X");
			else if (botones.get(0).equals("X") && botones.get(1).equals("X") && botones.get(2).equals("X")) return new String("X");
			else if (botones.get(2).equals("X") && botones.get(5).equals("X") && botones.get(8).equals("X")) return new String("X");
			else if (botones.get(6).equals("X") && botones.get(7).equals("X") && botones.get(8).equals("X")) return new String("X");
			else if (botones.get(3).equals("X") && botones.get(4).equals("X") && botones.get(5).equals("X")) return new String("X");
			else if (botones.get(1).equals("X") && botones.get(4).equals("X") && botones.get(7).equals("X")) return new String("X");
			else if (botones.get(0).equals("X") && botones.get(4).equals("X") && botones.get(8).equals("X")) return new String("X");
			else if (botones.get(2).equals("X") && botones.get(4).equals("X") && botones.get(6).equals("X")) return new String("X");
			else return new String("sin ganador");
			
		} else {
				
			if (botones.get(0).equals("O") && botones.get(3).equals("O") && botones.get(6).equals("O")) return new String("O");
			else if (botones.get(0).equals("O") && botones.get(1).equals("O") && botones.get(2).equals("O")) return new String("O");
			else if (botones.get(2).equals("O") && botones.get(5).equals("O") && botones.get(8).equals("O")) return new String("O");
			else if (botones.get(6).equals("O") && botones.get(7).equals("O") && botones.get(8).equals("O")) return new String("O");
			else if (botones.get(3).equals("O") && botones.get(4).equals("O") && botones.get(5).equals("O")) return new String("O");
			else if (botones.get(1).equals("O") && botones.get(4).equals("O") && botones.get(7).equals("O")) return new String("O");
			else if (botones.get(0).equals("O") && botones.get(4).equals("O") && botones.get(8).equals("O")) return new String("O");
			else if (botones.get(2).equals("O") && botones.get(4).equals("O") && botones.get(6).equals("O")) return new String("O");
			else return new String("sin ganador");
			
		}
	}

	@Override
	public String btn1(String jugada) {
		
		btn1 = jugada;
		
		return btn1;
	}

	@Override
	public String btn2(String jugada) {
		
		btn2 = jugada;
		
		return btn2;
	}

	@Override
	public String btn3(String jugada) {
		
		btn3 = jugada;
		
		return btn3;
	}

	@Override
	public String btn4(String jugada) {
		
		btn4 = jugada;
		
		return btn4;
	}

	@Override
	public String btn5(String jugada) {
		
		btn5 = jugada;
		
		return btn5;
	}

	@Override
	public String btn6(String jugada) {
		
		btn6 = jugada;
		
		return btn6;
	}

	@Override
	public String btn7(String jugada) {
		
		btn7 = jugada;
		
		return btn7;
	}

	@Override
	public String btn8(String jugada) {
		
		btn8 = jugada;
		
		return btn8;
	}

	@Override
	public String btn9(String jugada) {
		
		btn9 = jugada;
		
		return btn9;
	}
}
