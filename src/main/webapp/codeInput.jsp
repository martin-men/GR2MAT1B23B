<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sistema de Gestión de Bibliotecas</title>
</head>
<body>
    <h1>BIBLIOTECA</h1>
    <h3>Recuperación de contraseña</h3>
    <p>Su contraseña es: ${mensajeCodigo}</p>
    <form action="/codigoRecuperacion" method="POST">
        <fieldset>
            Usuario
            <input type="text" value="${usuario}" name="usuario" readonly />
            Ingrese el código
            <input type="text" required placeholder="Ingrese el código" name="codigo"> <br>
            <input type="submit" value="Ingresar"/>
        </fieldset>
    </form> <br> <br>
    <a href="passwordRecovery.jsp">Volver</a>
</body>
</html>
