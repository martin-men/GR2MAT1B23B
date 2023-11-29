package epn.edu.ec.prueba1ib_grupo2_ma;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "prestamo", urlPatterns = "/prestamo")

public class PrestamoServlet {
    GestorLibros gestor  = new GestorLibros();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            request.setAttribute("libro", gestor.toString());
            request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int libro = gestor.obtenerLibro(request);
        request.setAttribute("Recibo",gestor.prestarLibro(libro,"nani"));
        request.setAttribute("libros", gestor.toString());
        request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }


}


