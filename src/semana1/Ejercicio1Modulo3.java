package semana1;
import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;
public class Ejercicio1Modulo3 {

    public static void main(String[] args) {
        // ejercicio 1 modulo 3
        Scanner sc = new Scanner(System.in);
        String usuario = "hillson", clave = "0015";
        System.out.println("Este es su sistema financiero BancaMovil");
        System.out.println("Ingrese Usuario");
        usuario = sc.nextLine();
        System.out.println("Ingrese Clave");
        clave = sc.nextLine();
        if (usuario.equals("hillson") && clave.equals("0015")) {
            System.out.println("Bienvenido al sistema, Señor hillson");
        } else {
            System.out.println("credenciales incorrectas");
        }
        // ejercicio 2 mofdulo 3
        Scanner scan = new Scanner(System.in);
        int temeperatura;
        String tem;
        System.out.println("Bienvenidos al tiempo ");
        System.out.println("ingresa la temperatura");
        temeperatura = scan.nextInt();
        if (temeperatura > 25 && temeperatura <= 30) {
            System.out.println("Dia soleado");
            System.out.println("actividad sugerida para realizar: 1: caminar y tomar sol");
        } else if (temeperatura > 15 && temeperatura <= 25) {
            System.out.println(" es un dia soleado");
            System.out.println("actividad sugerida para realizar: 1: caminar ");
        } else if (temeperatura > 10 && temeperatura <= 15) {
            System.out.println("es un dia nublado");
            System.out.println("ctividad sugerida para realizar: 1: caminar con campera");
        } else if (temeperatura == 10) {
            System.out.println("es un dia lluvioso");
            System.out.println("quedarse en casa o salir con paraguas");
        } else if (temeperatura > 0 && temeperatura < 10) {
            System.out.println("es un dia de nevado");
            System.out.println("recomendacion quedarce en casa");
        } else {
            System.out.println("el clima esta loco");
        }

            // ejercicio de switch
        byte opcion = 20;

        switch (opcion) {
            case 10:
                System.out.println("vale dioe");
                break;
            case 20:
                System.out.println("vale 20");
                break;
            case 30:
                System.out.println("vale 30");
                break;
            default:
                System.out.println("no vale");
                break;

        }

        Scanner teclado = new Scanner(System.in);
        double operador, total = 0;

        int opcions;
        System.out.println("bienvenido a tu calculadora");
        System.out.println("----------escoja una opcion :---------- \n"
                + " 1 : Suma \n"
                + " 2 : Resta \n"
                + " 3 : Multiplicacion \n"
                + " 4 : Division \n");
        System.out.println("Ingrese la opcion deseada");
        opcions = teclado.nextInt();

        switch (opcion) {
            case 1:
                double numero1, numero2;
                System.out.println(" Ingrese el primer numero");
                numero1 = teclado.nextDouble();
                System.out.println(" Ingrese el segundo numero");
                numero2 = teclado.nextDouble();
                total = numero1 + numero2;
                System.out.println("la suma es :" + numero1 + "+" + numero2 + " = " + total);
                break;
            case 2:
                double num1, num2;
                System.out.println(" Ingrese el primer numero");
                num1 = teclado.nextDouble();
                System.out.println(" Ingrese el segundo numero");
                num2 = teclado.nextDouble();
                total = num1 - num2;
                System.out.println("la resta es :" + num1 + "-" + num2 + " = " + total);
                break;
            case 3:
                double numer1, numer2;
                System.out.println(" Ingrese el primer numero");
                numer1 = teclado.nextDouble();
                System.out.println(" Ingrese el segundo numero");
                numer2 = teclado.nextDouble();
                total = numer1 * numer2;
                System.out.println("la multiplicacion  es :" + numer1 + " * " + numer2 + "  =  " + total);
                break;
            case 4:
                double n1, n2;
                System.out.println(" Ingrese el primer numero");
                n1 = teclado.nextDouble();
                System.out.println(" Ingrese el segundo numero");
                n2 = teclado.nextDouble();
                total = n1 / n2;
                System.out.println("la la division"
                        + " es :" + n1 + "+" + n2 + " = " + total);
                break;
            default:
                System.out.println("opcion invalida");
        }

            // ejercicio switch
           /*
           Crear un programa en Java que simule la petición de una opción según el siguiente menú y
            muestre en pantalla que ha ingresado a la opción seleccionada con las opciones siguientes:
            Gracias por contactarte con nosotros!
            ¿En qué podemos ayudarte?
            A) Documentación
            B) Cotización
            C) Asistencia
            D) Siniestros
            E) Información de Pagos
            F) Otras Consultas
            G) Anulación
            Escribe la letra de la opción seleccionada
            */
        Scanner teclado1 = new Scanner (System.in);
        String opt;
        System.out.println("Gracia por contactarte con nosotros");
        System.out.println("¿ En qué podemos ayudarte");
        System.out.println("A) Documentacion \n"
                + "B) Cotización\n"
                + "C) Asistencia\n"
                + "D) Siniestros\n"
                + "E) Informacion de pagos\n"
                + "F) Otras Consultas\n"
                + "G) Anulacion ");
        System.out.println("Escriba la letra de la opción seleccionada");
        opt = teclado1.nextLine();

        switch (opt){

            case "a":
            case "A":

                System.out.println("Usted selecciono Documentacion");
                break;

            case "b ":
            case "B" :
                System.out.println("Usted selecciono Cotizacion");
                break;

            case "c ":
            case "C" :
                System.out.println("Usted selecciono Asistencia");
                break;

            case "d" :
            case "D" :
                System.out.println("Usted selecciono Siniestros");
                break;

            case "e" :
            case "E" :
                System.out.println("Usted selecciono Informacion de pago");
                break;

            case "f" :
            case "F" :
                System.out.println("Usted selecciono Otras consultas");
                break;

            case "g" :
            case "G" :
                System.out.println("Usted selecciono Anular proceso");
                break;

            default :
                System.out.println("Opcion incorrecta");



        }
        // laboratorio final
        int n1 = 100, n2 =10, n3 = 150;
        if (n1 > n2 && n1 > n3){
            System.out.println("el numero mayor es n1: "+ n1);
        }else if (n2 > n1 && n2 > n3){
            System.out.println("el numero mayor es n2: "+ n2);
        }else if (n3 > n2 && n3 >n1){
            System.out.println("el numero mayor es n3: "+ n3);
        }else
            System.out.println("comparacion fallida");


        /*
        Dado el siguiente código:
            int a = 10, b=-2, c=5;
            hay 2 números positivos y 1 negativo
            Informar la multiplicación de los dos
            números positivos.

         */
        int a = -10, b=10, c=5;
        if(a>0 && b>0){
            int mult = a * b ;
            System.out.println(a +" * " + b + " = "+ mult);
        }else if( a >0 && c >0){
            int mult = a * c ;
            System.out.println(a +" * " + c + " = "+ mult);
        }else if (b > 0 && c > 0) {
            int mult = b * c;
            System.out.println(b + " * " + c + " = " + mult);
        }else
          System.out.println("Hay dos valores negativo");

        /*
        Dado el siguiente código:
        String usuario = “Pepito”, clave= “1234”;
        Informar los siguientes casos:
        Si usuario=”pepito” y clave=”1234” informar
        Bienvenido pepito!”
        Si usuario=”pepito” y clave no es “1234”
        informar “Usuario incorrecto”
        Si usuario no es “pepito” y clave= “1234”
        informar “Contraseña incorrecta”

         */
        String usuario1 = "Pepito", clave1= "1234";
        if (usuario1.equals("Pepito") && clave1.equals("1234")){
            System.out.println("Bienvenido pepito!");
        }else if (usuario1.equals("Pepito") && clave1 != "1234"){
            System.out.println("Contraseña incorrecta");
        }else if ((usuario1 != "pepito") && clave1.equals("1234")){
            System.out.println("usuario incorrecto");
        }else
            System.out.println("no coinciden los datos");
    }
}