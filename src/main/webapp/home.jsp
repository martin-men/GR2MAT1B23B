<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sistema de Gestión de Bibliotecas</title>
    <style>


        .grid-container {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr)); /* Se ajusta automáticamente y tiene un ancho mínimo de 200px */
            max-width: 98%;

        }

        .producto {
            border: 1px solid #ddd;
            padding: 15px;
            text-align: center;
            min-width: 200px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .dato{
            justify-content: center;
            text-align: center;
        }
        .recibo {
            border: 1px solid #000;
            padding: 20px;
            width: 300px;
            margin: 0 auto;
        }

        .header {
            text-align: center;
            font-size: 20px;
            font-weight: bold;
        }

        .info {
            margin-top: 10px;
        }

        .info p {
            margin: 5px 0;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #333;
            color: white;
        }

    </style>
</head>
<body>
    <h1>BIBLIOTECA</h1>
    <h2>Bienvenido: ${usuario}</h2>
    <a href="index.jsp">Cerrar sesión</a>
    <h3>Reserva de libros</h3>
    <form action="/home" method="POST">
        <div>
            ${libros}
            <input type="submit" value="Alquilar libro">
        </div>
    </form>
    <div>
        ${Recibo}
    </div>
    <div>
        <h2>Historial de Alquileres</h2>
        ${historial}
    </div>

</body>
</html>
