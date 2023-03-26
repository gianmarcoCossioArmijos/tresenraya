package com.tresenraya.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tresenraya.entidad.Score;

@Repository
public class JuegoDaoImp implements JuegoDao {
	
	@Autowired
	private SessionFactory sf;
	
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
	@Transactional
	public List<Score> getScores() {
		
		Session sn = sf.getCurrentSession();
		Query<Score> query = sn.createQuery("FROM Score",Score.class);
		List<Score> scores = query.getResultList();
		
		return scores;
	}

	@Override
	public String turno() {
		
		String turno;
		int numero = (int)(Math.random() * 2 + 1);
		
		if(numero == 1) {
			turno = "jugador";
		} else {
			turno = "computadora";
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
		
		if (turno.equals("computadora")) {
			
			jugada = "X";
		} else {
			
			jugada = "O";
		}
		
		return jugada;
	}

	@Override
	public String cambiarTurno(String turno) {
		
		String cambioTurno;
		
		if (turno.equals("computadora")) {
			cambioTurno = "jugador";
		} else {
			cambioTurno = "computadora";
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
