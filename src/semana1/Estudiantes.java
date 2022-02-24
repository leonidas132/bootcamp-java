package semana1;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Estudiantes {
    protected String nombre;
    protected String apellido;
    protected String numeroExamen;
    protected String notaExamenes;
    protected String notaExamen1;
    protected String notaExamen2;
    protected String notaExamen3;

 public  Estudiantes(String nombre, String apellido, String numeroExamen, String notaExamenes1,
                       String notaExamenes2, String notaExamenes3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroExamen = numeroExamen;
        this.notaExamen1 = notaExamenes1;
        this.notaExamen2 = notaExamenes2;
        this.notaExamen3 = notaExamenes3;
    }

    public void ingresarDatos()  {

        try{
            int numeroEstudiante = 0;
            Estudiantes listaEstudiante[] = new Estudiantes[numeroEstudiante];
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese Nombre y Apellido estudiante, y las notas de los tres examenes");
            System.out.println("---------Ingresar numero de estudiantes-------------");
            numeroEstudiante = teclado.read();
            for (int i = 0; i < numeroEstudiante; i++) {
                nombre = teclado.readLine();
                apellido = teclado.readLine();
                numeroExamen = teclado.readLine();
                notaExamen1 = teclado.readLine();
                notaExamen2 = teclado.readLine();
                notaExamen3 = teclado.readLine();

                listaEstudiante[i] = new Estudiantes(nombre, apellido, numeroExamen, notaExamen1, notaExamen2, notaExamen3);
            }
            for (int contador = 0;contador<listaEstudiante.length;contador++) {
                System.out.println(contador);



            }

        }catch (IOException io){
            System.out.println("el error: "+ io);
        }




    }
    public String mostrarDatos () {

            System.out.println("datos de los estudiantes");
            return "Nombre:  " + nombre + "\nApellido" + apellido +
                    "\nNumero examen: " + numeroExamen + "\nNota examen 1 : " + notaExamen1 +
                    "\nNota examen 2 : " + notaExamen2 + "\nNota examen 3 : " + notaExamen3;

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
