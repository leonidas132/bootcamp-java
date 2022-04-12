package semana4;
import java.time.LocalDate;
import java.util.Date;
public class Volador1 extends InformacionVolador {
    private String Nombre;
    private String marca;
    private LocalDate fechaAterrizaje;

    public Volador1() {

    }

    public Volador1(String tipoFuselaje, String ID, String origenVolador, String numeroAsientos, String nombre, String marca) {
        super(tipoFuselaje, ID, origenVolador, numeroAsientos);
        Nombre = nombre;
        this.marca = marca;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechaAterrizaje() {
        return fechaAterrizaje;
    }

    public void setFechaAterrizaje(LocalDate fechaAterrizaje) {
        this.fechaAterrizaje = fechaAterrizaje;
    }

    @Override
    public void permisoAterrizar(String permiso) {

        if (getNombre().equals("ovni") || getNombre().equals("superman")) {
            System.out.println("no se permitio el aterrizaje del volador por lo cual la fecha no fue tomada  : ");
            System.out.println("no tiene permiso de aterrizar. El gobierno condena el uso de " +
                    "nuetras instalaciones por parte de voladores no pertenecientes a este mundo");

        }else if ((Nombre != "ovni" || Nombre !="superman") && permiso!=("cancelado")){
            System.out.println("el volador tiene permiso de aterrizar");
            System.out.println("la fecha del aterrizaje es: " + getFechaAterrizaje());

        } else {
            System.out.println("Aterrizaje cancelado");
        }


    }


    @Override
    public String toString () {
        return "Volador1 " +
                " Nombre :'" + Nombre + '\'' +
                " marca : '" + marca + '\'' + " Tipos fuselaje :" + getTipoFuselaje() + '\'' +
                " ID : " + getID() + '\'' + " Origen volador : " + getOrigenVolador() + '\'' +
                " Numero asientos : " + getNumeroAsientos()  ;

    }


    @Override
    public void numeroPista() {

    }
}