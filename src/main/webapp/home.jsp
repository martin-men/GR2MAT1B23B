<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sistema de Gestión de Bibliotecas</title>
</head>
<body>
    <h1>BIBLIOTECA</h1>
    <h2>Bienvenido: ${usuario}</h2>
    <a href="index.jsp">Cerrar sesión</a>
    <h3>Reserva de libros</h3>
    <form action="" method="POST">
        <fieldset>
            ${libros}
        </fieldset>
    </form>
</body>
</html>
