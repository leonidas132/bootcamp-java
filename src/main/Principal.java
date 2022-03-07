package main;

//import semana1.Calendario;
import java.sql.SQLOutput;
import java.util.Scanner;

import jdk.swing.interop.SwingInterOpUtils;
import semana1.Estudiante;

import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {

      //  Calendario can  = new Calendario ();
     //  can.CapturaFecha();
    //   can.covercionFecha();
        Scanner teclado = new Scanner(System.in);
        ArrayList<Estudiante> listaEstudiante = new ArrayList<Estudiante>();

        String nombre,apellido;
        int edad,idEstudiante,codigoCurso,notaExamen1,notaExamen2,notaExamen3,conteo=1, numEstudiante;


        System.out.println("ingrese numero de estudiantes");
        numEstudiante= teclado.nextInt();
        while(conteo <= numEstudiante) {
            teclado.nextLine();
            System.out.println("ingrese nombre del estudiante :");
            nombre = teclado.nextLine();
            System.out.println("ingrese apellido :");
            apellido = teclado.nextLine();
            System.out.println("ingrese edad : ");
            edad = teclado.nextInt();
            System.out.println("ingrese numero de identificacion :");
            idEstudiante = teclado.nextInt();
            System.out.println("ingrese codigo del curso :");
            codigoCurso = teclado.nextInt();
            System.out.println("ingrese la nota del primer examen: ");
            notaExamen1 = teclado.nextInt();
            System.out.println("ingrese la nota del segundo examen :");
            notaExamen2 = teclado.nextInt();
            System.out.println("ingrese la nota del tercer examen :");
            notaExamen3 = teclado.nextInt();
            System.out.println("\n");
            Estudiante estud = new Estudiante(nombre, apellido, edad, idEstudiante, codigoCurso, notaExamen1, notaExamen2, notaExamen3   );
            listaEstudiante.add(estud);
            conteo++;
        }

            for (int i = 0 ; i <listaEstudiante.size(); i++) {
                System.out.println("-----Alumnos Registrados en el sistema----------");
                System.out.println("Nombre Estudiante :" + listaEstudiante.get(i).getNombre());
                System.out.println("Apellido :" + listaEstudiante.get(i).getApellido());
                System.out.println("edad :" + listaEstudiante.get(i).getEdad());
                System.out.println("Id del estudiante: " + listaEstudiante.get(i).getIdEstudiante());
                System.out.println("Codigo del curso: " + listaEstudiante.get(i).getCodigoCurso());
                System.out.println("\n");
            }
            // falta sacar el promedio para  hacer una mejor validacion
            for (int i = 0 ; i < listaEstudiante.size() ; i++){
                System.out.println("-----------calificaciones del Alumno--------");
                System.out.println("Nombre del Estudiante :"+listaEstudiante.get(i).getNombre());
                System.out.println("Apellido :" +listaEstudiante.get(i).getApellido());
                System.out.println("Nota 1 : " + listaEstudiante.get(i).getNotaExamen1());
                System.out.println("Nota 2 : " + listaEstudiante.get(i).getNotaExamen2());
                System.out.println("Nota 3 : " +listaEstudiante.get(i).getNotaExamen3());
                int suma = listaEstudiante.get(i).getNotaExamen1() + listaEstudiante.get(i).getNotaExamen2()+ listaEstudiante.get(i).getNotaExamen3();
                     if (suma > 0 && suma <10 ){
                         System.out.println("nota incorrecta");
                     } if(suma >= 10 && suma <=50){
                        System.out.println("el estudiante debe recuperar  el semestre " + "su nota fue :" + suma);
                     }else if(suma >50 && suma <= 70){
                        System.out.println("el estudiante obtuvo una nota basica " + "su nota fue :" + suma);
                     }else if (suma > 70 && suma <=100){
                        System.out.println("felicidades el estudiante aprobo el semestre " + "su nota fue :" + suma);
                     }else{
                        System.out.println("la nota supera el rango por lo cual el profesor re");
                    }


            }

    }

}

