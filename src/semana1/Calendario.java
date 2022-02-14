package semana1;


import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calendario {
    String date;
    String day,month,year;
    int position ;
    int dia,mes,anio;
    public String CapturaFecha() {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)) ;// BufferedReader al igual que la clase Scanner capturar datos desde el teclado y pertenece al paquete   java.io.BufferedReader
            System.out.println("Ingresar fecha (dd/mm/yyyy): ");
            date = teclado.readLine();
            System.out.println(date);

        }catch (Exception e){
            System.out.println(e);
        }
        return date;
    }
    public void covercionFecha (){
        position = date.indexOf("/");// Indexof se utiliza para obtener el valor entero de un indice partiendo del objeto de tipo String
        day = date.substring(0, position); // un subString es un un fragmento de la cadena de String principal en este caso tomara la posiciones que se le asigne
       // System.out.println(day);
        date = date.substring(position+1);
      //  System.out.println(date);
        position = date.indexOf("/");
        month =date.substring(0, position);
      //  System.out.println(month);
        date = date.substring(position+1);
        year = date;
     //   System.out.println(year);
        dia = Integer.parseInt(day);
        mes= Integer.parseInt(month);
        anio=Integer.parseInt(year);
        if (1>dia ||dia>31|| 1 > mes ||mes>12 ||1900> anio || anio >2099){
            System.out.println("LA FECHA ES INCORRECTA");

        }
        else{
            System.out.println("la fecha es correcta");
        }
    }



}




/*Crear un brach con el nombre practica-semanal-semana2:
        Realizar el ejercicio validación de fechas:
        Ingresar una fecha dd/mm/yyyy
        validar que dd >=1 && <=31 TENIENDO EN CUENTA EL MES
        validar que mes >=1 && <=12
        validar que anio >=1900 && <= 2099*/