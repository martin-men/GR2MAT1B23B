package epn.edu.ec.prueba1ib_grupo2_ma;

public class Libro {
    private String titulo, autor,genero,num_ISBN;
    boolean estado;

    public Libro(String titulo, String autor, String genero, String num_ISBN, boolean estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.num_ISBN = num_ISBN;
        this.estado = estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getNum_ISBN() {
        return num_ISBN;
    }

    @Override
    public String toString() {
        return  "<div>"+
                "<div class = \"dato\"> titulo:"+ this.titulo + "</div>"+
                "<div class = \"dato\"> autor:"+ this.autor + "</div>"+
                "<div class = \"dato\"> genero:"+  this.genero+ "</div>"+
                "</div>";
    }
}
