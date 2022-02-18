package semana1;


import jdk.swing.interop.SwingInterOpUtils;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calendario {
    String date;
    String dia1,mes1,anio1;
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
        dia1 = date.substring(0, position); // un subString es un un fragmento de la cadena de String principal en este caso tomara la posiciones que se le asigne
       // System.out.println(day);
        date = date.substring(position+1);
      //  System.out.println(date);
        position = date.indexOf("/");
        mes1 =date.substring(0, position);
      //  System.out.println(month);
        date = date.substring(position+1);
        anio1 = date;
     //   System.out.println(year);
        dia = Integer.parseInt(dia1);
        mes= Integer.parseInt(mes1);
        anio=Integer.parseInt(anio1);

            if (mes == 2) {

                if(( anio % 4 == 0) && anio % 100 != 0){
                    if(dia >= 1 && dia <=29){
                        System.out.println("ES UN AÑO BISIESTO");
                    }
                }else{
                        if  (dia >= 1 && dia <= 28){
                            System.out.println("la fecha es correcta");
                        }

                    }

            } else {
                if(dia >= 1 && dia <= 31 ){
                    System.out.println("año y fecha correcta");
                }
            }

        }


    }*/








/*Crear un brach con el nombre practica-semanal-semana2:
        Realizar el ejercicio validación de fechas:
        Ingresar una fecha dd/mm/yyyy
        validar que dd >=1 && <=31 TENIENDO EN CUENTA EL MES
        validar que mes >=1 && <=12
        validar que anio >=1900 && <= 2099*/