package semana4;

import java.text.ParseException;
import java.time.LocalDate;

public class App {
    // en el siguiente programa solo pueden aterrizar voladores pertenecientes al planeta tierra
    // voladores no pertenecientes a este mundo se les prohíbe el aterrizaje

    public static void main(String [] args) throws ParseException {
        Volador1 volador = new Volador1("bimotor", "ID 1023", "unit state", "5PT", "avion de guerra", "black jao");

        volador.setFechaAterrizaje(LocalDate.now()); // registramos la fecha actual del aterrizaje
        System.out.println(volador.toString());
        volador.permisoAterrizar("cancelado"); // tipo de permisos (cancelado o concedido)



    }

}