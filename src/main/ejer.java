package main;

import java.util.Scanner;

public class ejer {
    public static void main(String[] args) {
   /*  int variable = 123;
         System.out.println(variable);
       long variable2 = 304388244;
          System.out.println(variable2);
    byte variable3 = 32;
        System.out.println(variable3);
    short variable4 = 3558;
        System.out.println(variable4);
    float variable5 = 12.55856f;
        System.out.println(variable5);
    double variable6 = 12.558565d;
        System.out.println(variable6);
    char variable7 = 64;
        System.out.println(variable7);
    boolean variable8,variable9;
        variable8 = true;
        variable9 = false;
        if(variable8 == true || variable9 == false){
            System.out.println("variable8 su cumple la condicion  "  );

            String nombre = new String();

            // vectores
            String a[] ={"pp","oo","ii","tt","gg"};
            //asi se recore un vector
            System.out.println(a[0] + a[4]);

            // esta es otra forma de crear un vector
            String b[] = new String [9]; // aqui especificamos la cantidad de posiciones que tendra el vector
            b[0] ="avila";
            b[1]="rosa";
            b[2]="pep";
            b[3]="peti";
            System.out.println(b[0] +"\n "+ b[1] +"\n "+  b[2] + "\n "+ b[3] );
*/

            // tipos envoltorios
   /* int entero = 500;
     Integer Entero = new Integer(entero);
     Entero.intValue();
     System.out.println(Entero);

     String srt = "1000"; //aqui hacemos de cierta manera una convercion de String a int
      int x = Integer.parseInt(srt);
        System.out.println(x);



*/
    /*------------------------------------------------------------------------------------------------------
      taller de shopos
        // ejercico 1
        Scanner nt = new Scanner(System.in) ;
        int variableE = 2029;
        double variableD = 12.249758d;
        char variableC = 64;


        // ejercicio 2
        int nota,nota2,nota3,nota4,nota5,nota6;
        System.out.println("ingrese las seis notas del alumno para calcular su promedio");
        System.out.println("Nota1");
        nota=nt.nextInt();
        System.out.println("Nota2");
        nota2=nt.nextInt();
        System.out.println("Nota3");
        nota3=nt.nextInt();
        System.out.println("Nota4");
        nota4=nt.nextInt();
        System.out.println("Nota5");
        nota5=nt.nextInt();
        System.out.println("Nota6");
        nota6=nt.nextInt();
        int suma = nota + nota2 + nota3 + nota4  + nota5 + nota6;
        System.out.println("la suma de las seis nota es :" + suma);
        int promedioNotas = suma/6;
        System.out.println("El promedio correspondiente al valor de las seis notos es: "+ promedioNotas);


     -------------------------------------------------------------------------------------------------------*/

      /*
        //casteo o convercion
        //casteo implicito
        byte miByte = 32;
        System.out.println(miByte);
        short miShort = miByte;
        System.out.println(miShort);
        int  miInt = miShort;
        System.out.println(miInt);
        long miLong = miInt;
        System.out.println(miLong);
        float miFloat = miInt;
        System.out.println(miFloat);
        double miDouble =miFloat;
        System.out.println(miDouble);

        //casteo explicito
        double mido = 2.9856;
        System.out.println(mido);
        float miFloat2 = (float) mido;
        System.out.println(miFloat2);
        long milong2 = (long) miFloat2;
        System.out.println(milong2);
        int miInt2 = (int) milong2;
        System.out.println(miInt2);
        short miShor = (short) miInt2;
        System.out.println(miShor);
        byte mibyte1 = (byte) miShor;
        System.out.println(mibyte1);

       */

       // taller de alumni  String
        String parafo1 = "HOLA MUNDO";
        String parafo2 = "si lo púdes lograr lo puedes progamar";
        String parafo3 = parafo1.toLowerCase();
        System.out.println(parafo3);
        String parafo4 = parafo2.toUpperCase();
        System.out.println(parafo4);
        System.out.println(parafo1 == parafo2);
        System.out.println(parafo3 +","+ parafo2);
    }


    }


