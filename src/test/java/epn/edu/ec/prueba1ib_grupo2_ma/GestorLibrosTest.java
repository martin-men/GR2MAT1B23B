package epn.edu.ec.prueba1ib_grupo2_ma;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class GestorLibrosTest {
    public static GestorLibros gestorLibros = null;

    @BeforeClass
    public static void setUpClass() {
        gestorLibros = new GestorLibros();
    }

    @Test
    public void given_user_without_registers_when_show_history_then_no_history_message() {
        assertEquals("<div>No existen registros anteriores</div>", gestorLibros.mostrarHistorial("Dario"));
    }

    @Test
    public void given_user_with_registers_when_show_history_then_registers() {
        HistorialTransacciones historialTransacciones = gestorLibros.getHistorial();
        historialTransacciones.agregarRegistro("libro1", "12/12/12", "Martin");
        historialTransacciones.agregarRegistro("libro2", "12/12/12", "Martin");
        historialTransacciones.agregarRegistro("libro3", "12/12/12", "Martin");
        assertNotEquals("<div>No existen registros anteriores</div>", gestorLibros.mostrarHistorial("Martin"));
    }
}