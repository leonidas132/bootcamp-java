package semana1;

import java.util.Scanner;

public class ModuloCuatro {
    public static void main(String[] args) {



        //Ejercicios de bucles while y for


          /*
        * Crear un programa que lea números enteros (Positivos y
        Negativos) del teclado y muestre la suma de dichos
        números ingresados, el programa se detendrá cuando el
        usuario indique el número 0.
        Utilizar bucle while
        * */
        Scanner capVal = new Scanner(System.in);
        int val1, val2, val3, sum, exi = 1;
        int cont = 1;
        System.out.println("sistemas de sumas repetitivo");

        while (cont > 0) {

            System.out.println("ingrse valor");
            val1 = capVal.nextInt();
            System.out.println("ingrese  valor");
            val2 = capVal.nextInt();
            System.out.println("ingrese  valor");
            val3 = capVal.nextInt();
            sum = val1 + val2 + val3;
            System.out.println("la suma es :" + sum);
            System.out.println("ingrese uno para continar, '0' para salir");
            cont = capVal.nextInt();
            if (cont == 0) {
                System.out.println("proseso finalisado");
            }

        }
        /*
        * Imprimir los números del 1 al 10, sin
        imprimir números 2, 5 y 9, uno abajo
        del otro.
        Requisito: se necesita tener
        conocimiento del operador AND (&&)
        y del operador NOT (!=)
        * */
        int i = 1; //iterador
        int container = 10;

        while (i <= container) {
            if (i != 2 && i != 5 && i != 9)
                System.out.println(i);

            /*System.out.println("imprime solo 3");
              if (i == 2 || i == 5 || i ==9) //en este caso solo imprime 2,5,9
                System.out.println(i);*/


            i++;
        }
        /*
        * Imprimir los números del 1 al 30 sin
        imprimir números entre el 10 y el 20
        uno abajo del otro.
        Requisito: se necesita tener
        conocimientos del operador OR (||)*/
        int x = 1;
        int n = 30;
        while (x <= n) {
            if (x <= 10 || x >= 20) // 1-2....9..10..20..
                System.out.println(x);


            x++;
        }
        // Imprimir la suma de los números del 1 al 10
        int j = 1, number1 = 10;
        int sum1 = 0;

        while (j <= number1) {
            sum1 = j + j;
            System.out.println("la suma es : " + j + "+" + j + "=" + sum1);

            j++;

        }


        Scanner scn = new Scanner(System.in);
        String usuari = "pepe";
        String clav = "123";
        int z = 1;

        while (z > 0) {
            System.out.println("ingrese el usuario");
            usuari = scn.nextLine();
            System.out.println("ingresar clave");
            clav = scn.nextLine();
            if (usuari.equals("pepe") && clav.equals("123")) {
                System.out.println("usuario y clave  correctos");
                break;
            } else
                System.out.println("datos incorrectos");

        }


        /// ciclo do while
        // imprime los numeros del 1 al 10
        int ct = 1;
        do {
            System.out.println(ct);
            ct++;

        } while (ct <= 10);


        //imprime los numeros del 10 al 1
        int cot = 10;
        do {
            System.out.println(ct);
            cot--;

        } while (cot >= 1);


            /*Crear un programa que lea números enteros (Positivos y
            Negativos) del teclado y muestre la suma de dichos
            números ingresados, el programa se detendrá cuando el
            usuario indique el número 0, adicionalmente debe indicar
            el número mayor y número menor introducido en el
            programa
             *
             * */


        Scanner scnn = new Scanner(System.in);
        int v1, v2, v3, v4, it = 0;
        do {
            System.out.println("ingresa numeros negativos y positivos para sumar");
            System.out.println("numero 1 ");
            v1 = scnn.nextInt();
            System.out.println("numero 2");
            v2 = scnn.nextInt();
            System.out.println("numero 3");
            v3 = scnn.nextInt();
            System.out.println("numero 4");
            v4 = scnn.nextInt();
            if (v1 > v2 && v1 > v3) {
                System.out.println("numero mayor 1: " + v1);

            } else if (v2 > v1 && v2 > v3) {
                System.out.println("numero mayor 2:" + v2);
            } else if (v3 > v1 && v3 > v2) {
                System.out.println("numero mayor 3: " + v3);
            } else if (v4 > v1 && v4 > v2 && v4 > v3) {
                System.out.println("numero mayor 4: " + v4);
            } else
                System.out.println("ninguno es mayor");


            if (v1 < v2 && v1 < v3) {
                System.out.println("numero  menor es : " + v1);
            } else if (v2 < v1 && v2 < v3) {
                System.out.println("numero  menor es:" + v2);
            } else if (v3 < v1 && v3 < v2) {
                System.out.println("numero  menor es: " + v3);
            } else if (v4 < v1 && v4 < v2 && v4 < v3) {
                System.out.println("numero  menor es: " + v4);
            } else
                System.out.println("ninguno es menor");

            int su = v1 + v2 + v3 + v4;
            System.out.println("la suma es " + su);

            System.out.println("ingre  '0' para salir y cualquier numero para seguir sumado ");
            it = scnn.nextInt();
            if (it == 0) {
                System.out.println(" saliste del programa");
                break;
            } else
                System.out.println("continia sumando");


        } while (it > 0);

        // mostrar los numeros pares de manera desendiente desde el 20

        int par = 20;
        System.out.println("numeros pares de manera decendentes ");
        while (par != 0) {
            System.out.println("par = " + par);
            par = par - 2;
        }

        int pares = 0;
        System.out.println("numero acendentes");
        while (pares < 20) {
            System.out.println("numeros acendentes: " + pares);
            pares += 2;
        }

        // con do while
        int paress = 0;
        do {

            System.out.println("numeros acendentes: " + pares);
            paress += 2;
        } while (paress <= 20);


        // ciclo o bucle for
        // imprimir numeros del numero del 10
        System.out.println("bucle for sencillo");
        for (int in = 0; in < 10; in++) {
            //for (int in = 1; in <= 10; in++){
            //System.out.println("veces que hace el ciclo " + in);
            System.out.println("veces que hace el ciclo " + (in + 1));
        }
        // ciclo o bucle for
        // imprimir numeros del 1 al 10 menos el 3 y 5

        System.out.println("bucle for sencillo");
        for (int itr = 0; itr <= 10; itr++) {
            if (itr == 3) {
                continue;
            } else if (itr == 5) {
                continue;
            }

            System.out.println("veces que hace el ciclo " + (itr));

        }
        //Imprimir los números del 1 al 10 uno
        // abajo del otro.
        int nro = 10;

        for (int nro1 = 0; nro1 <= nro; nro1++) {
            System.out.println(nro1);

        }

        //Imprimir los números del 1 al 10
        //salteando de a dos uno abajo del otro

        int nuMero = 10;
        System.out.println("imprime numero haciendo saltos de 2 en dos");
        for (int cons = 0; cons <= nuMero; cons += 2) {

            System.out.println(cons);

        }
        //Imprimir los números del 10 al 1 uno
        //abajo del otro.
        int d = 10;
        for (int ds = d; ds > 0; ds--) {   //
            System.out.println(ds);
        }
        //Imprimir la suma de los números impares del 1 al 10
        int nuM = 10;
        for (int id = 0; id <= nuM; id++) {
            /* if (id % 2==0){
                 int suma2 = i + i;

                 System.out.println("suma de los numeros pares: "+ i+"+"+i+"="+suma2);

             }*/
            if (id % 2 == 1) {
                int suma2 = i + i;

                System.out.println("suma de los numeros inpares: " + i + "+" + i + "=" + suma2);

            }
        }

        // Crear un programa que ingrese una oración y muestre
        //cuál es el carácter que más se repite.
        // No debe incluir el espacio en blanco.
        // La oración a ingresar no debe estar vacía
        Scanner palabra = new Scanner(System.in);

        String cadena1; // guarda Sreing ingresado
        System.out.println("ingrese la oracion a evaluar");
        cadena1 = palabra.nextLine(); // captura el dato desde el teclado

        String junteTexto = "";
        int contador = 0;
        int conti = -1;
        char caracter = 'h';
        for ( int c = 0 ; c <cadena1.length();c++   ){ // con lenght me devuelve la longitud de la cadena
            System.out.println( cadena1.charAt(c));//aqui imprimo c con la funcion charAt para poder visualizar el caracter
            //System.out.println(c);  si solo imprimo se me solo el valor del indice de cada caracter
            junteTexto  += cadena1.charAt(c); // aqui guardo el valor de cada caracter para imprimirlo de manera orizontal

        }
        conti = cadena1.indexOf(caracter) ; //aquí obtengo el primer indice del String
        System.out.println(conti); // imprimo para verificar el indice

        while(conti != -1){ // comparo el valor del primer indice
            conti = cadena1.indexOf(caracter,conti+1);
            contador ++;

        }
        System.out.println(junteTexto);
        System.out.println("el caracter "+ caracter +" se repite " +contador + " veces en la oracion");


        /*Imprimir la siguiente figura:
            @
            @
            @
            @
            @*/
        char cara = '@';


        for( int con = 1;con<=5;con++){
            System.out.println(cara);

        }

      /*  Imprimir la siguiente figura:
        @
        @@
        @
        @@
        @*/
        for( int cone = 1;cone<=5;cone++){


            if(cone % 2==0){
                System.out.println("@@");

            }else if(cone % 2== 1) {
                System.out.println('@');
            }


        }
        /*
        * Imprimir la siguiente figura:
        @
        @@
        @@@
        @@@@
        @@@@@*/


        String asignado = "";


        for( int cone = 1;cone<=5;cone++){
            if(cone % 2==0){
                //   almacena += asignado.charAt(cone);
                asignado =asignado+ "@";
                System.out.println(asignado);}
            else if(cone % 2== 1) {
                asignado =asignado+ "@@";
                System.out.println(asignado);
            }


        }








    }

}
