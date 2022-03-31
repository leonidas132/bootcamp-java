package semana1;

import java.util.Arrays;
import java.util.Scanner;

public class condicionales {


    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
       int numeroUsuario; //ingresado por el usuario
       int numeroMaximo; //rango de valor
       System.out.println("indique la cantidad de numero  a generar");
        numeroUsuario= leer.nextInt();
       System.out.println("ingrese el rango de numero aleatorio a generar");
       numeroMaximo = leer.nextInt();
       int [] pares = new int[numeroUsuario];

        // llenamos el arreglo de enteros con numeros aleatorios
        for (int i = 1; i < pares.length; i++) {
            // llenamos el arreglo de enteros con numeros aleatorios
            int numero = (int)  ((Math.random() * numeroMaximo)+ 1);
            pares[i] = numero;

        }
       /* String dev = Arrays.toString(pares);
        System.out.println(dev);*/

        for (int i=0;i <pares.length; i++){
            boolean esPrimo = true;
            int numero = pares[i];
            // un numero es primo cuando posee mas de dos divisores
            // adicionalmente no tenemos que evaluar todos los numeros por debajo de el, con
            // evaluar hasta la raiz cuadrada es suficiente
            for (int j = 2 ;j<=(Math.sqrt(numero));j++){
                if (numero % j ==0){
                    esPrimo = false;
                    break;
                }
            }
            System.out.println("El numero " + numero + " " + ((!esPrimo || numero ==1)? "no es primo":"es primo"));
        }
        String dev = Arrays.toString(pares);
        leer.close();










    }




}

