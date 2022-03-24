package semana1;

import java.util.Scanner;

public class condicionales {


    public static void main(String[] args) {
    /*  byte n = 15;
                if(n==10){
                     System.out.println("el numnero corresponde a: "+n);
                }else
               System.out.println("numero incorrecto");*/


        /*
        int nt = 5;
        for (int s = 1; s <= nt; s++ ){
            int su1 = s+s+s+s+s;
            System.out.println("la suma es : "+ s+"+"+s+"+"+s+"+"+s+"+"+s+ "=");
        }*/

        String asignado = "";


        for( int cone = 6;cone>1;cone++){
            for (int i = 1; i < cone ; i--) {
                if(cone % 2==0){
                    asignado =asignado+ "@";
                    System.out.println(asignado);}
                else if(cone % 2== 1) {
                    asignado =asignado+ "@";
                    System.out.println(asignado);
                }

            }
            System.out.println();



       }


        /*
        for( int con = 1;con<=3;con++){
            System.out.println(cara);

        }*/
    }



}

