package epn.edu.ec.prueba1ib_grupo2_ma;

import jakarta.servlet.http.HttpServletRequest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestorLibros {
    private List<Libro> libros = new ArrayList<>();
    private HistorialTransacciones historial = new HistorialTransacciones();

    public GestorLibros() {
        libros.add(new Libro("1984", "George Orwell", "Ficción distópica", "9780451524935", true));
        libros.add(new Libro("To Kill a Mockingbird", "Harper Lee", "Ficción", "0061120081", true));
        libros.add(new Libro("The Great Gatsby", "F. Scott Fitzgerald", "Ficción", "9780743273565", false));
        libros.add(new Libro("The Catcher in the Rye", "J.D. Salinger", "Ficción", "9780241950425", true));
        libros.add(new Libro("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasía", "9780590353427", false));
        libros.add(new Libro("The Hobbit", "J.R.R. Tolkien", "Fantasía", "9780547928227", true));
        libros.add(new Libro("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "No ficción", "9780062316097", true));
        libros.add(new Libro("Educated", "Tara Westover", "ficción", "9780399590504", false));
        libros.add(new Libro("The Immortal Life of Henrietta Lacks", "Rebecca Skloot", "No ficción", "9781400052172", true));
        libros.add(new Libro("Becoming", "Michelle Obama", "ficción", "9781524763138", false));
    }

    public HistorialTransacciones getHistorial() {
        return historial;
    }

    public String prestarLibro(int i, String usuario){
        libros.get(i).setEstado(false);
        String salida = generarTicket(i, usuario);
        historial.agregarRegistro(libros.get(i).getTitulo(),fechaActual() ,usuario);
        return salida;
    }

    private String generarTicket(int i, String usuario){
        return "<div class=\"recibo\">\n" +
                "<div class=\"header\">Recibo</div>\n" +
                "<div class=\"info\">\n" +
                "            <p>Fecha:"+ fechaActual() +"</p>\n" +
                "            <p>Título del libro:" + libros.get(i).getTitulo() +"</p>\n" +
                "            <p>Nombre del usuario:" + usuario + "</p>\n" +
                "        </div>";
    }

    private String fechaActual() {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return  dateFormat.format(today);
    }

    @Override
    public String toString() {
        String salida = "<div class=\"grid-container\">";
        int cont = 0;

        for (Libro libro: this.libros) {
            if(libro.estado) {
                salida += "<div class=\"producto\">" +
                        "<label><input type=\"radio\" value= \"" + cont + "\" name=\"" + "item" + "\">" + "Seleccionar" + "</label>";
                salida += "<p>" + libro.toString() + "</p>";
                salida += "</div>";
            }
            cont++;
        }
        salida += "</div>";
        return salida;
    }

    public int obtenerLibro(HttpServletRequest request) {
        return Integer.parseInt(request.getParameter("item"));
    }
    public String mostrarHistorial(String usuario){
        return historial.mostrarHistorial(usuario);
    }
}
