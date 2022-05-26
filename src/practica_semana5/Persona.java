package practica_semana5;

import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.Objects;

public class Persona {
    private String nombre;
    private String apelldio;

    public Persona() {
    }

    public Persona(String nombre, String apelldio) {
        this.nombre = nombre;
        this.apelldio = apelldio;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldio() {
        return apelldio;
    }

    public void setApelldio(String apelldio) {
        this.apelldio = apelldio;
    }

    @Override
    public String toString() {
        return
                "nombre: " + nombre +
                " apelldio: " + apelldio ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre) && apelldio.equals(persona.apelldio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apelldio);
    }






}
