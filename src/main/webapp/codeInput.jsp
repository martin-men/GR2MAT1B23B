<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sistema de Gestión de Bibliotecas</title>
</head>
<body>
    <h1>BIBLIOTECA</h1>
    <h3>Recuperación de contraseña</h3>
    <p>Código a ingresar (no debería imprimirse, pero se lo hace por facilidad de uso y</p><br>
    <p>dado que es una simulación de envío de código. Copiar y pegar.): ${codigo}</p>
    <form action="" method="POST">
        <fieldset>
            Ingrese el código
            <input type="text" required placeholder="Ingrese el código" name="codigo"> <br>
            ${error} <br> <br>
            <input type="submit" value="Ingresar"/>
        </fieldset>
    </form> <br> <br>
    <a href="passwordRecovery.jsp">Volver</a>
</body>
</html>
