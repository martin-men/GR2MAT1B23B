package epn.edu.ec.prueba1ib_grupo2_ma;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet (name = "PrestamoServlet", urlPatterns = {"/home"})
public class PrestamoServlet extends HttpServlet  {
    private final GestorLibros gestor = new GestorLibros();
    private String usuario = "";

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("libros", gestor.toString());
        this.usuario = request.getParameter("usuario");
        request.setAttribute("usuario", usuario);
        request.setAttribute("historial", gestor.mostrarHistorial(usuario));
        request.getRequestDispatcher("/home.jsp").forward(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int libro = gestor.obtenerLibro(request);
        request.setAttribute("Recibo", gestor.prestarLibro(libro, this.usuario));
        request.setAttribute("usuario", usuario);
        request.setAttribute("libros", gestor.toString());
        request.setAttribute("historial", gestor.mostrarHistorial(this.usuario));
        request.getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
    }
}
