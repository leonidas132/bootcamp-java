package semana1;
import java.util.Scanner;
public class Ejercicio1Modulo3 {

    public static void main (String[] args){
        // ejercicio 1 modulo 3
        Scanner teclado = new Scanner (System.in);
        String usuario = "hillson",clave = "0015";
        System.out.println("Este es su sistema financiero BancaMovil");
        System.out.println("Ingrese Usuario");
        usuario = teclado.nextLine();
        System.out.println("Ingrese Clave");
        clave = teclado.nextLine();
        if (usuario.equals("hillson") && clave.equals("0015")){
            System.out.println("Bienvenido al sistema, Señor hillson");
        }else{
            System.out.println("credenciales incorrectas");
        }
        // ejercicio 2 mofdulo 3
        Scanner scan = new Scanner (System.in);
        int temeperatura ;
        String tem;
        System.out.println("Bienvenidos al tiempo ");
        System.out.println("ingresa la temperatura");
        temeperatura = scan.nextInt();
        if (temeperatura > 25 && temeperatura <=30){
            System.out.println("Dia soleado");
            System.out.println("actividad sugerida para realizar: 1: caminar y tomar sol");
        } else if (temeperatura > 15  && temeperatura <=25){
            System.out.println(" es un dia soleado");
            System.out.println( "actividad sugerida para realizar: 1: caminar ");
        } else if (temeperatura > 10 && temeperatura <=15) {
            System.out.println("es un dia nublado");
            System.out.println("ctividad sugerida para realizar: 1: caminar con campera");
        }else if(temeperatura == 10){
            System.out.println("es un dia lluvioso");
            System.out.println("quedarse en casa o salir con paraguas");
        } else if (temeperatura > 0 && temeperatura <10) {
            System.out.println("es un dia de nevado");
            System.out.println("recomendacion quedarce en casa");
        }
        else{
            System.out.println("el clima esta loco");
        }

    }
}
