package semana1;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EjerciciosModulos {

//Generar un programa donde se pida al usuario que
    //ingrese por consola números con decimales simple
    //o de una sola precisión y realizar las siguientes
    //operaciones:
    //1. Realizar la multiplicación, división, suma y resta.
    //2. Mostrar los resultados con doble precisión (20
    //decimales) y sin decimales.
    public void numrosDecimal (){
        Scanner sc = new Scanner(System.in);
        float num1,num2;
        System.out.println("Ingrese el primer numero decimal");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo numero decimal");
        num2 =sc.nextFloat();
        float suma = num1 + num2;
        float resta = num1 - num2;
        float multiplicasion = num1 * num2;
        float division = num1 / num2;
        System.out.println("la suma es :"+ suma);
        System.out.println("la resta es : "+resta);
        System. out.println("la miltiplicasion es :" + multiplicasion);
        System.out.println("la division es :" + division);
        System.out.println("\n");
        System.out.println("con precision de 20 decimales");


        System.out.println("la suma es :"+ String.format("%.20f",suma));
        System.out.println("la resta es : "+String.format("%.20f",resta));
        System. out.println("la miltiplicasion es :" + String.format("%.20f",multiplicasion));
        System.out.println("la division es :" + String.format("%.20f",division));

        System.out.println("operacion sin decimales");
        int sum = (int) suma;
        System.out.println("suma es : " + sum);
        int res = (int) resta;
        System.out.println("resta es: " + res);
        int mult = (int) multiplicasion;
        System.out.println("multiplicasion es :" + mult);
        int div = (int) division;
        System.out.println("divicion es :" +div );


    }

    // desafio final del modulo
        /*Generar un programa que permita al usuario
        ingresar por consola en la misma línea el primer
        nombre y primer apellido y realice las siguientes
        operaciones:
        1. Mostrar el nombre y apellido por separado.
        2. Mostrar las iniciales en Mayúsculas.*/
    public void nombreApellidso (){
        String nombre,apellido;
        int posicion ;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese su primer nombre y primer apellido");
            String nombreApellido = teclado.readLine();
            // System.out.println(nombreApellido);
            posicion =nombreApellido.indexOf(" ");
            nombre=nombreApellido.substring(0,posicion);
            System.out.println("su primer nombre corresponde a : "+nombre);
            nombreApellido = nombreApellido.substring(posicion+1);
            apellido = nombreApellido;
            System.out.println(" su primer apellido corresponde a :" + apellido);

        }catch (Exception e){
            System.out.println(e);
        }


    }










}

