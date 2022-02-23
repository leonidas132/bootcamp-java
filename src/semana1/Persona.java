package semana1;
/*Crear un branch con el nombre practica-adicional-semana3:
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
4- alumnos que deben recursar la materia, aquellos que obtuvieron un promedio < 7

*/
public class Persona {

    protected String nombre;// protecte nos perimite acceder a los metodos
    protected String apellido;
    protected   int edad ;

    public Persona(String nombre,String apellido,int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido() {
         return apellido;
    }
    public int getEdad(){
         return edad;
    }
}
