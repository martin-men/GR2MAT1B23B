package epn.edu.ec.prueba1ib_grupo2_ma;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuario"})
public class UsuarioServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.inicializarDatos();
        if (gestorUsuarios.validarUsuarioContrasenia(
                request.getParameter("usuario"), request.getParameter("clave"))) {
            getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
        } else {
            request.setAttribute("errorIngreso", gestorUsuarios.mostrarErrorIngreso());
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

}