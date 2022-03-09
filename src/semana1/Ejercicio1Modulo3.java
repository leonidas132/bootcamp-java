package semana1;
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

        }
    }
}