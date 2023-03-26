<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tres en Raya</title>
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
   background: linear-gradient(180deg, rgba(66,0,73,1) 0%, rgba(5,0,40,1) 100%);
   border-collapse: collapse;
   border-radius: 30px;
   margin: auto;
}

.formulario{
	text-align: center;
}

.input {
	width: 400px;
}


.titulo {
	margin-top: 30px;
	text-align: center;
}

.boton {
	width: 400px;
	height: 40px;
	color: black;
	background-color: #7dff00;
	border-radius: 8px;
}

.logo {
	margin-left: 225px;
	margin-left: 225px;
	width: 250px;
	height: 250px;
}

</style>
</head>
<body>

	<div class="contenedor">
		
		<h2 class="titulo">Tres en Raya</h2>
		
		<img class="logo" alt="logo" src="https://juststickers.in/wp-content/uploads/2018/11/game-controller-cartoon.png">
		
		<br><br><br>
	
		<form class="formulario" action="/tresenraya/tablero" method="get">
		
			<label>Imgrese su nombre:</label><br><br><br>
			<input class="input" type="text" name="nombre"/><br><br><br><br>
			
			<input class="boton" type="submit" value="Continuar"><br><br>
		
		</form>
		
	</div>

</body>
</html>