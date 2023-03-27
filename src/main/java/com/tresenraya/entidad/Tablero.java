package com.tresenraya.entidad;

public class Tablero {
	
	private String boton;
	private String turno;
	private String nombre;
	private String btn1;
	private String btn2;
	private String btn3;
	private String btn4;
	private String btn5;
	private String btn6;
	private String btn7;
	private String btn8;
	private String btn9;
	private String ganador;
	
	public Tablero() {
	}

	public Tablero(String boton, String turno, String nombre, String btn1, String btn2, String btn3, String btn4,
			String btn5, String btn6, String btn7, String btn8, String btn9, String ganador) {
		this.boton = boton;
		this.turno = turno;
		this.nombre = nombre;
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.btn3 = btn3;
		this.btn4 = btn4;
		this.btn5 = btn5;
		this.btn6 = btn6;
		this.btn7 = btn7;
		this.btn8 = btn8;
		this.btn9 = btn9;
		this.ganador = ganador;
	}

	@Override
	public String toString() {
		return "Tablero [boton=" + boton + ", turno=" + turno + ", nombre=" + nombre + ", btn1=" + btn1 + ", btn2="
				+ btn2 + ", btn3=" + btn3 + ", btn4=" + btn4 + ", btn5=" + btn5 + ", btn6=" + btn6 + ", btn7=" + btn7
				+ ", btn8=" + btn8 + ", btn9=" + btn9 + ", ganador=" + ganador + "]";
	}

	public String getBoton() {
		return boton;
	}

	public void setBoton(String boton) {
		this.boton = boton;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBtn1() {
		return btn1;
	}

	public void setBtn1(String btn1) {
		this.btn1 = btn1;
	}

	public String getBtn2() {
		return btn2;
	}

	public void setBtn2(String btn2) {
		this.btn2 = btn2;
	}

	public String getBtn3() {
		return btn3;
	}

	public void setBtn3(String btn3) {
		this.btn3 = btn3;
	}

	public String getBtn4() {
		return btn4;
	}

	public void setBtn4(String btn4) {
		this.btn4 = btn4;
	}

	public String getBtn5() {
		return btn5;
	}

	public void setBtn5(String btn5) {
		this.btn5 = btn5;
	}

	public String getBtn6() {
		return btn6;
	}

	public void setBtn6(String btn6) {
		this.btn6 = btn6;
	}

	public String getBtn7() {
		return btn7;
	}

	public void setBtn7(String btn7) {
		this.btn7 = btn7;
	}

	public String getBtn8() {
		return btn8;
	}

	public void setBtn8(String btn8) {
		this.btn8 = btn8;
	}

	public String getBtn9() {
		return btn9;
	}

	public void setBtn9(String btn9) {
		this.btn9 = btn9;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
}
