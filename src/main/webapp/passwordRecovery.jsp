<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sistema de Gestión de Bibliotecas</title>
</head>
<body>
  <h1>BIBLIOTECA</h1>
  <h3>Recuperación de contraseña</h3>
  <form action="/contrasenia" method="POST">
    <fieldset>
      Ingrese su nombre de usuario
      <input type="text" required placeholder="Ingrese su nombre de usuario" name="usuario"> <br>
      Su contraseña se enviará al correo electrónico asociado <br> <br>
      <input type="submit" value="Enviar"/>
    </fieldset>
  </form> <br> <br>
  <div>${errorUsuario}</div>
  <a href="index.jsp">Volver</a>
</body>
</html>
