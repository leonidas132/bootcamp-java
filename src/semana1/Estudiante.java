package semana1;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Estudiante {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int idEstudiante;
    protected int codigoCurso;
    protected int notaExamen1;
    protected int notaExamen2;
    protected int notaExamen3;


    public Estudiante (String nombre, String apellido, int edad, int idEstudiante,int codigoCurso, int notaExamen1,
                       int notaExamen2, int notaExamen3){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.idEstudiante = idEstudiante;
        this.codigoCurso = codigoCurso;
        this.notaExamen1 = notaExamen1;
        this.notaExamen2 = notaExamen2;
        this.notaExamen3 = notaExamen3;
    }

  //  public Estudiante (){

    //}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getNotaExamen1() {
        return notaExamen1;
    }

    public void setNotaExamen1(int notaExamen1) {
        this.notaExamen1 = notaExamen1;
    }

    public int getNotaExamen2() {
        return notaExamen2;
    }

    public void setNotaExamen2(int notaExamen2) {
        this.notaExamen2 = notaExamen2;
    }

    public int getNotaExamen3() {
        return notaExamen3;
    }

    public void setNotaExamen3(int notaExamen3) {
        this.notaExamen3 = notaExamen3;
    }

    @Override // me permite visualisar de una manera mas rapida la informacion
    public String toString() {
        return "Estudiante" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", idEstudiante=" + idEstudiante +
                ", codigoCurso=" + codigoCurso +
                ", notaExamen1=" + notaExamen1 +
                ", notaExamen2=" + notaExamen2 +
                ", notaExamen3=" + notaExamen3 ;
    }
}

 /*
    La idea es practicar ciclos, dobles con vectores, máximo, mínimo, promedio.
    realizar el siguiente ejercicios:
    La escuela primaria xyz solicita el desarrollo de una aplicación para poder llevar el control de notas para cada alumno.
    El programa solicitará el ingreso la cantidad de alumnos a procesar.
    Para cada alumno se deberá ingresar los siguientes datos:
         - nombre (string)
		 - apellido (string)
		 - número de examen
		 - nota que obtubo el alumno (númerico >=0 <=10)
    Al finalizar la carga de datos, se procederá a listar la siguiente información:
            1- alumno/s con la calificación mas alta
		 2- alumno/s con la calificación mas baja
		 3- alumnos que promocionan, aquellos que obtubieron un promerdio >= 7
            4- alumnos que deben recursar la materia, aquellos que obtuvieron un promedio < 7 */
