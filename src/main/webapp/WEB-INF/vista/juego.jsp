<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	font-family: monospace;
}

body {
	background-color: #0d0d0d;
	color: white;
}

.contenedor {
	width: 700px;
	height: 570px;
	border: 2px solid white;
	background-image: url("https://getwallpapers.com/wallpaper/full/3/0/f/718596-dark-purple-backgrounds-1920x1200-full-hd.jpg");
	border-collapse: collapse;
	border-radius: 30px;
	margin: auto;
	text-align: center;
}

.jugador {
	display: inline-block;
	width: 100px;
}

.turno {
	display: inline-block;
	width: 100px;
}

.boton {
	margin: auto;
	border-radius: 15px;
	width: 120px;
	height: 120px;
	color: gray;
	background-color: #ededed;
	font-size: 70px;
	font-weight: bold;
}

.boton:hover {
	background-color: white;
}

.botones {
	padding: 20px 100px 20px 100px;
}

.boton_juego {
	width: 370px;
	height: 40px;
	color: black;
	background-color: #7dff00;
	border-radius: 8px;
	font-weight: bold;
}

.ganador {
	display: inline-block;
	font-size: 20px;
	width: 370px;
	height: 20px;
	text-align: center;
}
</style>
</head>
<body>

	<div class="contenedor">

		<form name="formulario">

			<br> <br>

			<div class="datos">

				<label class="jugador">Jugador:</label>
				<input class="jugador" type="text" name="nombre" value="${tablero.nombre}"/>

				<label class="turno">Turno:</label>
				<input class="turno" type="text" name="turno" value="${tablero.turno}"/>

			</div>

			<div class="botones">

				<c:choose>
					<c:when test="${tablero.btn1 != null}">
						<input class="boton" type="button" name="btn1" value="${tablero.btn1}"/>
					</c:when>
					<c:when test="${tablero.btn1 == null && tablero.turno != null}">
						<input class="boton" type="button" name="btn1" value="+"
						onclick="formulario.action='/tresenraya/jugarBtn1';formulario.method='get';
						formulario.modelAttribute='tablero';formulario.submit()" />
					</c:when>
					<c:otherwise>
						<input class="boton" type="button" name="btn1" value="+"/>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${tablero.btn2 != null}">
						<input class="boton" type="button" name="btn2" value="${tablero.btn2}"/>
					</c:when>
					<c:when test="${tablero.btn2 == null && tablero.turno != null}">
						<input class="boton" type="button" name="btn2" value="+"
						onclick="formulario.action='/tresenraya/jugarBtn2';formulario.method='get';
						formulario.modelAttribute='tablero';formulario.submit()" />
					</c:when>
					<c:otherwise>
						<input class="boton" type="button" name="btn2" value="+"/>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${tablero.btn3 != null}">
						<input class="boton" type="button" name="btn3" value="${tablero.btn3}"/>
					</c:when>
					<c:when test="${tablero.btn3 == null && tablero.turno != null}">
						<input class="boton" type="button" name="btn3" value="+"
						onclick="formulario.action='/tresenraya/jugarBtn3';formulario.method='get';
						formulario.modelAttribute='tablero';formulario.submit()" />
					</c:when>
					<c:otherwise>
						<input class="boton" type="button" name="btn3" value="+"/>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${tablero.btn4 != null}">
						<input class="boton" type="button" name="btn4" value="${tablero.btn4}"/>
					</c:when>
					<c:when test="${tablero.btn4 == null && tablero.turno != null}">
						<input class="boton" type="button" name="btn4" value="+"
						onclick="formulario.action='/tresenraya/jugarBtn4';formulario.method='get';
						formulario.modelAttribute='tablero';formulario.submit()" />
					</c:when>
					<c:otherwise>
						<input class="boton" type="button" name="btn4" value="+"/>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${tablero.btn5 != null}">
						<input class="boton" type="button" name="btn5" value="${tablero.btn5}"/>
					</c:when>
					<c:when test="${tablero.btn5 == null && tablero.turno != null}">
						<input class="boton" type="button" name="btn5" value="+"
						onclick="formulario.action='/tresenraya/jugarBtn5';formulario.method='get';
						formulario.modelAttribute='tablero';formulario.submit()" />
					</c:when>
					<c:otherwise>
						<input class="boton" type="button" name="btn5" value="+"/>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${tablero.btn6 != null}">
						<input class="boton" type="button" name="btn6" value="${tablero.btn6}"/>
					</c:when>
					<c:when test="${tablero.btn6 == null && tablero.turno != null}">
						<input class="boton" type="button" name="btn6" value="+"
						onclick="formulario.action='/tresenraya/jugarBtn6';formulario.method='get';
						formulario.modelAttribute='tablero';formulario.submit()" />
					</c:when>
					<c:otherwise>
						<input class="boton" type="button" name="btn6" value="+"/>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${tablero.btn7 != null}">
						<input class="boton" type="button" name="btn7" value="${tablero.btn7}"/>
					</c:when>
					<c:when test="${tablero.btn7 == null && tablero.turno != null}">
						<input class="boton" type="button" name="btn7" value="+"
						onclick="formulario.action='/tresenraya/jugarBtn7';formulario.method='get';
						formulario.modelAttribute='tablero';formulario.submit()" />
					</c:when>
					<c:otherwise>
						<input class="boton" type="button" name="btn7" value="+"/>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${tablero.btn8 != null}">
						<input class="boton" type="button" name="btn8" value="${tablero.btn8}"/>
					</c:when>
					<c:when test="${tablero.btn8 == null && tablero.turno != null}">
						<input class="boton" type="button" name="btn8" value="+"
						onclick="formulario.action='/tresenraya/jugarBtn8';formulario.method='get';
						formulario.modelAttribute='tablero';formulario.submit()" />
					</c:when>
					<c:otherwise>
						<input class="boton" type="button" name="btn8" value="+"/>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test="${tablero.btn9 != null}">
						<input class="boton" type="button" name="btn9" value="${tablero.btn9}"/>
					</c:when>
					<c:when test="${tablero.btn9 == null && tablero.turno != null}">
						<input class="boton" type="button" name="btn9" value="+"
						onclick="formulario.action='/tresenraya/jugarBtn9';formulario.method='get';
						formulario.modelAttribute='tablero';formulario.submit()" />
					</c:when>
					<c:otherwise>
						<input class="boton" type="button" name="btn9" value="+"/>
					</c:otherwise>
				</c:choose>

			</div>
			
			<c:choose>
				<c:when test="${tablero.ganador == null}">
					<h3 class="ganador"></h3>
				</c:when>
				<c:otherwise>
					<h3 class="ganador">${tablero.ganador}</h3>
				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when test="${tablero.boton == 'reiniciar'}">
					<input class="boton_juego" type="button" name="boton" id="boton" value="Reiniciar"
						onclick="formulario.action='/tresenraya/reiniciar';formulario.method='get';formulario.submit()" />
				</c:when>
				<c:otherwise>
					<input class="boton_juego" type="button" name="boton" id="boton" value="Jugar"
						onclick="formulario.action='/tresenraya/iniciar';formulario.method='get';formulario.submit()" />
				</c:otherwise>
			</c:choose>

		</form>

	</div>

</body>
</html>