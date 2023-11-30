package epn.edu.ec.prueba1ib_grupo2_ma;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "CodigoRecuperacionServlet", urlPatterns = {"/codigoRecuperacion"})
public class CodigoRecuperacionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        getServletContext().getRequestDispatcher("/codeInput.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        gestorUsuarios.inicializarDatos();
        request.setAttribute("mensajeCodigo", gestorUsuarios.recuperarContrasenia(request.getParameter("usuario")
                , request.getParameter("codigo")));
        request.setAttribute("usuario", request.getParameter("usuario"));
        getServletContext().getRequestDispatcher("/codeInput.jsp").forward(request, response);
    }

}
