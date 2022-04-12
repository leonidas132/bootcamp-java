package semana4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface Registros {
    public static final String FORMATO_FECHA = ("dd-MM-yyyy");

    public abstract void permisoAterrizar(String permiso);

    public abstract void numeroPista();


    public static String getCadenaDate (Date fecha){
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMATO_FECHA);
        return dateFormat.format(fecha);
    }
    public static Date getDateCadena (String fecha) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat(FORMATO_FECHA);
        return formato.parse(fecha);
    }


}
