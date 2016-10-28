<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guardar Clientes</title>
</head>
<style type="text/css">

body{ background: deepskyblue; padding: 0; margin: 0;}

h1{text-align: center; font-size: 50px; font-family: arial; color: white; text-shadow: 2px 2px 2px rgba(0, 0, 0, .2);}

form{width: 500px; margin: 50px auto; background: white; height: 300px; border: 1px solid rgba(0, 0, 0, .5); 
border-radius: 10px; box-shadow: 5px 5px 10px rgba(0, 0, 0, .5);}

.btn-enviar{background: purple; margin-left: 170px; margin-top: 50px; padding: 10px 50px;
 border-radius: 2px; color: white; transition: all .5s ease;}
 
.btn-enviar:hover{transform: scale(1.1); background: orange;}

.input-nombre{width: 70%; height: 40px; margin-top: 50px; margin-left: 20px; border-radius: 4px;}

.input-correo{width: 70%; height: 40px; margin-top: 50px; margin-left: 27px; border-radius: 4px;}

label {margin-left: 10px; font-family: arial;}
</style>
<body>
	<h1>Registrar Clientes</h1>
	<form action="/springhibernate/clientes" method="post">
	<div>
		<label for="nombre">Nombre:</label>
		<input class="input-nombre" type="text" name="nombre" id="nombre" placeholder="Escriba un Nombre" required>
	</div>
	<div>
		<label for="correo">Correo: </label>
		<input class="input-correo" type="email" name="correo" id="correo" placeholder="Escriba un Correo" required>
	</div>
	<div>
		<input type="submit" value="Enviar" class="btn-enviar">
	</div>
	</form>

</body>
</html>