package semana4;

public abstract class InformacionVolador implements Registros {
    private String tipoFuselaje;
    private String ID;
    private String origenVolador;
    private String numeroAsientos;

    public InformacionVolador() {

    }

    public InformacionVolador(String tipoFuselaje, String ID, String origenVolador, String numeroAsientos) {
        this.tipoFuselaje = tipoFuselaje;
        this.ID = ID;
        this.origenVolador = origenVolador;
        this.numeroAsientos = numeroAsientos;
    }


    public String getTipoVolador( ){
        return tipoFuselaje;
    }
    public void setTipoVolador(String tipoFuselaje){
        this.tipoFuselaje = tipoFuselaje;
    }
    public String getID (){
        return ID;
    }
    public void setID ( String ID){
        this.ID = ID;
    }
    public String getOrigenVolador (){
        return origenVolador;
    }
    public void setOrigenVolador ( String origenVolador ){
        this.origenVolador = origenVolador;
    }

    public String getTipoFuselaje() {
        return tipoFuselaje;
    }

    public void setTipoFuselaje(String tipoFuselaje) {
        this.tipoFuselaje = tipoFuselaje;
    }

    public String getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(String numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public String toString() {
        return "Volador" +
                "tipoFuselaje='" + tipoFuselaje + '\'' +
                ", ID='" + ID + '\'' +
                ", origenVolador='" + origenVolador + '\'' +
                ", numeroAsientos='" + numeroAsientos ;
    }
}
