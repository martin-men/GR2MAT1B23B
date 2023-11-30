<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Sistema de Gestión de Bibliotecas</title>
</head>
<body>
  <h1>BIBLIOTECA</h1>
  <h3>Inicio de sesión</h3>
  <form action="/home" method="get">
    <fieldset>
      Usuario:
      <input type="text" required placeholder="Ingrese su usuario" name="usuario"> <br> <br>
      Contraseña:
      <input type="password" pattern="^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9]).{8,16}$" title="Contraseña no válida" required placeholder="Ingrese su contraseña" name="clave"> <br> <br>
      <input type="submit" value="Ingresar"/>
    </fieldset>
  </form> <br> <br>
  ¿No recuerda su contraseña? <a href="passwordRecovery.jsp">Recupérela</a>
</body>
</html>