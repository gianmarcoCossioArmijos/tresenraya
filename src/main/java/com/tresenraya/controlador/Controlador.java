package com.tresenraya.controlador;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.tresenraya.dao.JuegoDao;
import com.tresenraya.dao.JuegoDaoImp;
import com.tresenraya.entidad.Tablero;

@Controller
public class Controlador {

	@Autowired
	private JuegoDao juegoDao;
	
	@GetMapping("/")
	public String inicio() {
		
		return "inicio";
	}
	
	@GetMapping("/tablero")
	public String usuario(@RequestParam("nombre")String name,Model modelo) {
		
		juegoDao.guardarUsuario(name);
		Tablero tablero = new Tablero(null,null,juegoDao.usuario(),null,null,null,null,null,null,null,null,null,null);
		modelo.addAttribute("tablero", tablero);
		
		return "juego";
	}
	
	@GetMapping("/reiniciar")
	public String reiniciar(Model modelo) {
		
		juegoDao.reiniciar();
		Tablero tablero = new Tablero(null,null,juegoDao.usuario(),null,null,null,null,null,null,null,null,null,null);
		modelo.addAttribute("tablero", tablero);
		
		return "juego";
	}
	
	@GetMapping("/iniciar")
	public String iniciar(@ModelAttribute("tablero") Tablero tablero, Model modelo) {
		
		Tablero juego = new Tablero("reiniciar",juegoDao.turno(),juegoDao.usuario(),null,null,null,null,null,null,null,null,null,null);
		modelo.addAttribute("tablero", juego);
		
		return "juego";
	}
	
	@GetMapping("/jugarBtn1")
	public String jugarBtn1(@ModelAttribute("tablero") Tablero tablero, Model modelo) {
		
		String ganador;
		String jugada = juegoDao.jugar(tablero.getTurno());
		String resultado = juegoDao.verificarGanador(tablero.getTurno());
		String turno = juegoDao.cambiarTurno(tablero.getTurno());
		juegoDao.btn1(jugada);
		
		if (resultado.equals("X")) {
			
			ganador = "El rival ha ganado!";
		} else if (resultado .equals("O")) {
			
			ganador = juegoDao.usuario() + " ha ganado!";
		} else {
			ganador = null;
		}
		
		Tablero juego = new Tablero("reiniciar",
									turno,
									juegoDao.usuario(),
									jugada,
									JuegoDaoImp.btn2,
									JuegoDaoImp.btn3,
									JuegoDaoImp.btn4,
									JuegoDaoImp.btn5,
									JuegoDaoImp.btn6,
									JuegoDaoImp.btn7,
									JuegoDaoImp.btn8,
									JuegoDaoImp.btn9,
									ganador);
		modelo.addAttribute("tablero",juego);
		
		return "juego";
	}
	
	@GetMapping("/jugarBtn2")
	public String jugarBtn2(@ModelAttribute("tablero") Tablero tablero, Model modelo) {
		
		String ganador;
		String jugada = juegoDao.jugar(tablero.getTurno());
		String resultado = juegoDao.verificarGanador(tablero.getTurno());
		juegoDao.btn2(jugada);
		String turno = juegoDao.cambiarTurno(tablero.getTurno());
		
		if (resultado.equals("X")) {
			
			ganador = "El rival ha ganado!";
		} else if (resultado .equals("O")) {
			
			ganador = juegoDao.usuario() + " ha ganado!";
		} else {
			ganador = null;
		}
		
		Tablero juego = new Tablero("reiniciar",
									turno,
									juegoDao.usuario(),
									JuegoDaoImp.btn1,
									jugada,
									JuegoDaoImp.btn3,
									JuegoDaoImp.btn4,
									JuegoDaoImp.btn5,
									JuegoDaoImp.btn6,
									JuegoDaoImp.btn7,
									JuegoDaoImp.btn8,
									JuegoDaoImp.btn9,
									ganador);
		modelo.addAttribute("tablero",juego);
		
		return "juego";
	}
	
	@GetMapping("/jugarBtn3")
	public String jugarBtn3(@ModelAttribute("tablero") Tablero tablero, Model modelo) {
		
		String ganador;
		String jugada = juegoDao.jugar(tablero.getTurno());
		String resultado = juegoDao.verificarGanador(tablero.getTurno());
		juegoDao.btn3(jugada);
		String turno = juegoDao.cambiarTurno(tablero.getTurno());
		
		if (resultado.equals("X")) {
			
			ganador = "El rival ha ganado!";
		} else if (resultado .equals("O")) {
			
			ganador = juegoDao.usuario() + " ha ganado!";
		} else {
			ganador = null;
		}
		
		Tablero juego = new Tablero("reiniciar",
									turno,
									juegoDao.usuario(),
									JuegoDaoImp.btn1,
									JuegoDaoImp.btn2,
									jugada,
									JuegoDaoImp.btn4,
									JuegoDaoImp.btn5,
									JuegoDaoImp.btn6,
									JuegoDaoImp.btn7,
									JuegoDaoImp.btn8,
									JuegoDaoImp.btn9,
									ganador);
		modelo.addAttribute("tablero",juego);
		
		return "juego";
	}
	
	@GetMapping("/jugarBtn4")
	public String jugarBtn4(@ModelAttribute("tablero") Tablero tablero, Model modelo) {
		
		String ganador;
		String jugada = juegoDao.jugar(tablero.getTurno());
		juegoDao.btn4(jugada);
		String resultado = juegoDao.verificarGanador(tablero.getTurno());
		String turno = juegoDao.cambiarTurno(tablero.getTurno());
		
		if (resultado.equals("X")) {
			
			ganador = "El rival ha ganado!";
		} else if (resultado .equals("O")) {
			
			ganador = juegoDao.usuario() + " ha ganado!";
		} else {
			ganador = null;
		}
		
		Tablero juego = new Tablero("reiniciar",
									turno,
									juegoDao.usuario(),
									JuegoDaoImp.btn1,
									JuegoDaoImp.btn2,
									JuegoDaoImp.btn3,
									jugada,
									JuegoDaoImp.btn5,
									JuegoDaoImp.btn6,
									JuegoDaoImp.btn7,
									JuegoDaoImp.btn8,
									JuegoDaoImp.btn9,
									ganador);
		modelo.addAttribute("tablero",juego);
		
		return "juego";
	}
	
	@GetMapping("/jugarBtn5")
	public String jugarBtn5(@ModelAttribute("tablero") Tablero tablero, Model modelo) {
		
		String ganador;
		String jugada = juegoDao.jugar(tablero.getTurno());
		juegoDao.btn5(jugada);
		String resultado = juegoDao.verificarGanador(tablero.getTurno());
		String turno = juegoDao.cambiarTurno(tablero.getTurno());
		
		if (resultado.equals("X")) {
			
			ganador = "El rival ha ganado!";
		} else if (resultado .equals("O")) {
			
			ganador = juegoDao.usuario() + " ha ganado!";
		} else {
			ganador = null;
		}
		
		Tablero juego = new Tablero("reiniciar",
									turno,
									juegoDao.usuario(),
									JuegoDaoImp.btn1,
									JuegoDaoImp.btn2,
									JuegoDaoImp.btn3,
									JuegoDaoImp.btn4,
									jugada,
									JuegoDaoImp.btn6,
									JuegoDaoImp.btn7,
									JuegoDaoImp.btn8,
									JuegoDaoImp.btn9,
									ganador);
		modelo.addAttribute("tablero",juego);
		
		return "juego";
	}
	
	@GetMapping("/jugarBtn6")
	public String jugarBtn6(@ModelAttribute("tablero") Tablero tablero, Model modelo) {
		
		String ganador;
		String jugada = juegoDao.jugar(tablero.getTurno());
		juegoDao.btn6(jugada);
		String resultado = juegoDao.verificarGanador(tablero.getTurno());
		String turno = juegoDao.cambiarTurno(tablero.getTurno());
		
		if (resultado.equals("X")) {
			
			ganador = "El rival ha ganado!";
		} else if (resultado .equals("O")) {
			
			ganador = juegoDao.usuario() + " ha ganado!";
		} else {
			ganador = null;
		}
		
		Tablero juego = new Tablero("reiniciar",
									turno,
									juegoDao.usuario(),
									JuegoDaoImp.btn1,
									JuegoDaoImp.btn2,
									JuegoDaoImp.btn3,
									JuegoDaoImp.btn4,
									JuegoDaoImp.btn5,
									jugada,
									JuegoDaoImp.btn7,
									JuegoDaoImp.btn8,
									JuegoDaoImp.btn9,
									ganador);
		modelo.addAttribute("tablero",juego);
		
		return "juego";
	}
	
	@GetMapping("/jugarBtn7")
	public String jugarBtn7(@ModelAttribute("tablero") Tablero tablero, Model modelo) {
		
		String ganador;
		String jugada = juegoDao.jugar(tablero.getTurno());
		juegoDao.btn7(jugada);
		String resultado = juegoDao.verificarGanador(tablero.getTurno());
		String turno = juegoDao.cambiarTurno(tablero.getTurno());
		
		if (resultado.equals("X")) {
			
			ganador = "El rival ha ganado!";
		} else if (resultado .equals("O")) {
			
			ganador = juegoDao.usuario() + " ha ganado!";
		} else {
			ganador = null;
		}
		
		Tablero juego = new Tablero("reiniciar",
									turno,
									juegoDao.usuario(),
									JuegoDaoImp.btn1,
									JuegoDaoImp.btn2,
									JuegoDaoImp.btn3,
									JuegoDaoImp.btn4,
									JuegoDaoImp.btn5,
									JuegoDaoImp.btn6,
									jugada,
									JuegoDaoImp.btn8,
									JuegoDaoImp.btn9,
									ganador);
		modelo.addAttribute("tablero",juego);
		
		return "juego";
	}
	
	@GetMapping("/jugarBtn8")
	public String jugarBtn8(@ModelAttribute("tablero") Tablero tablero, Model modelo) {
		
		String ganador;
		String jugada = juegoDao.jugar(tablero.getTurno());
		juegoDao.btn8(jugada);
		String resultado = juegoDao.verificarGanador(tablero.getTurno());
		String turno = juegoDao.cambiarTurno(tablero.getTurno());
		
		if (resultado.equals("X")) {
			
			ganador = "El rival ha ganado!";
		} else if (resultado .equals("O")) {
			
			ganador = juegoDao.usuario() + " ha ganado!";
		} else {
			ganador = null;
		}
		
		Tablero juego = new Tablero("reiniciar",
									turno,
									juegoDao.usuario(),
									JuegoDaoImp.btn1,
									JuegoDaoImp.btn2,
									JuegoDaoImp.btn3,
									JuegoDaoImp.btn4,
									JuegoDaoImp.btn5,
									JuegoDaoImp.btn6,
									JuegoDaoImp.btn7,
									jugada,
									JuegoDaoImp.btn9,
									ganador);
		modelo.addAttribute("tablero",juego);
		
		return "juego";
	}
	
	@GetMapping("/jugarBtn9")
	public String jugarBtn9(@ModelAttribute("tablero") Tablero tablero, Model modelo) {
		
		String ganador;
		String jugada = juegoDao.jugar(tablero.getTurno());
		juegoDao.btn9(jugada);
		String resultado = juegoDao.verificarGanador(tablero.getTurno());
		String turno = juegoDao.cambiarTurno(tablero.getTurno());
		
		if (resultado.equals("X")) {
			
			ganador = "El rival ha ganado!";
		} else if (resultado .equals("O")) {
			
			ganador = juegoDao.usuario() + " ha ganado!";
		} else {
			ganador = null;
		}

		Tablero juego = new Tablero("reiniciar",
									turno,
									juegoDao.usuario(),
									JuegoDaoImp.btn1,
									JuegoDaoImp.btn2,
									JuegoDaoImp.btn3,
									JuegoDaoImp.btn4,
									JuegoDaoImp.btn5,
									JuegoDaoImp.btn6,
									JuegoDaoImp.btn7,
									JuegoDaoImp.btn8,
									jugada,
									ganador);
		modelo.addAttribute("tablero",juego);
		
		return "juego";
	}
}
