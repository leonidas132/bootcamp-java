package semana1;
import jdk.swing.interop.SwingInterOpUtils;

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

        /*    // ejercicio switch

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



        /* Dado el siguiente código:
            int a = 10, b=-2, c=5;
            hay 2 números positivos y 1 negativo
            Informar la multiplicación de los dos
            números positivos. */



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


       /* // declarar las variables
        float precioInicial = 50f;
        float precioFinal = 0;
        float inflacion = 0.5f; // 0.005 15.75 0.1575
        float precioTope = 200;
        float inflacionAuxiliar = inflacion / 100;
        int cantidadMenses = 0;

        // precioFinal = precioInicial;

        /*
         * for (precioFinal = precioInicial; precioFinal <= precioTope;
         * cantidadMenses++) { precioFinal += (precioFinal * inflacionAuxiliar); }
         */

        /*while (precioFinal <= precioTope) {
            float aumento = (precioFinal * inflacionAuxiliar);
            precioFinal += aumento;
            cantidadMenses++;
        }*/
/*
        System.out.println(String.format("El producto paso de %.2f a %.2f", precioInicial, precioFinal) + " en "
                + cantidadMenses + (cantidadMenses == 1 ? " mes" : " meses"));
        */

        // diseñar un algoritmo que permita ingresar por teclado el nombre, edad y ciudad de una persona,
         //los resultados deben mostrarse en panatalla

         Scanner teclado2 = new Scanner (System.in);
         System.out.println("ingrese sus datos");
         String nombre,apellido,edad,ciudad;
         System.out.println("ingrese el nombre");
         nombre = teclado2.nextLine();
         System.out.println("ingrese el apellido");
         apellido = teclado2.nextLine();
         System.out.println("ingrese la edad ");
         edad = teclado2.nextLine();
         System.out.println("ingresa ciudad");
         ciudad = teclado2.nextLine();

        System.out.println("tu nombre es " + nombre +", tu apellido " +apellido+ " tu edad es " + edad+ " tu ciudad es "+ciudad  );


        // Diseñar un algoritmo que permita calcular el salario de un trabajador teniendo en cuenta
        // los dias que trabajo y el valor de cada dia float


        float valorDia = 39000;
        float diasTrabajados = 30;
        float salario;
        salario = diasTrabajados * valorDia;
        System.out.println("Dias trabajados :" +diasTrabajados);
        System.out.println("Valor de dia : " + valorDia);
        System.out.println("El salario correspondiente para el trabajador es :" + salario);

        // diseñar un algoritmo que permita calcular las operaciones artmreticas
        Scanner tec = new Scanner(System.in);
        int valor1;
        int valor2;
        System.out.println("ingrese los valores para las operaciones  ");
        System.out.println("ingrese el primer valor");
        valor1 = tec.nextInt();
        System.out.println("ingrese el segundo valor");
        valor2 = tec.nextInt();
        int suma = valor1 + valor2;
        int resta = valor1 - valor2;
        int multiplicacion = valor1 * valor2;
        System.out.println("el valor de la suma es :"+suma);
        System.out.println("el valor de la resta es : "+resta);
        System.out.println("el valoir de la multiplicacion es :"+multiplicacion);

        //Diseñar un algoritmo que permita aplicar un descuento en el supermercado
        // de tal forma permita visualizar el monto a pagar después de aplicar dicho procedimiento.
        Scanner cap = new Scanner (System.in);
        float descuento= 0.2f ; //20%
        float producto1,producto2,producto3;
        System.out.println("Systemas de descuentos ");
        System.out.println("ingrese el valor primer producto");
        producto1 = cap.nextFloat();
        System.out.println("ingrese el valor segundo producto");
        producto2 = cap.nextFloat();
        System.out.println("ingrese el valor tercer prodcuto");
        producto3 = cap.nextFloat();
        float totalSinDescuento = producto1 + producto2 + producto3;
        float tolalConDescuento = totalSinDescuento * descuento;
        float total1 = totalSinDescuento - tolalConDescuento;
        System.out.println("valor productos" +","+ producto1+","+producto2 +","+producto3);
        System.out.println("total sin descuento "+ totalSinDescuento);
        System.out.println("total total con descuento: "+total1);

        //diseñe un algoritmo que lea dos numeros por teclado en la cual al efectuar la suma de ambos numeros
        // debe visualizarse los numero ingresados y el resultado final solo si el resultado no es negativo


        Scanner capNumero = new Scanner (System.in);
        int primerNumero,segundoNumero;
        System.out.println("ingrese el primer numero");
        primerNumero = capNumero.nextInt();
        System.out.println("ingrese el segundo numero");
        segundoNumero = capNumero.nextInt();
        if( primerNumero > 0 && segundoNumero > 0){
            int suma1 = primerNumero + segundoNumero;
            System.out.println("primer valor : "+primerNumero);
            System.out.println("segundo numero: "+segundoNumero);
            System.out.println("la suma es :"+ suma1);
        } else
            System.out.println("los valores ingresado son negativos ");

        //diseñar el algoritmo que al ingresar  la edad de un usuario , y si es mayor de edad debe aparecer un
        // mensaje

       /* int edad = 10 ;
        if (edad >= 18){
            System.out.println("es mayor de edad");
        }else
            System.out.println("no es mayor");*/

       Scanner captura3 = new Scanner(System.in);
        String nombre1, nombreCurso;
        int notaDefinitiva;
        float numeroClaseSemestre;
        float numeroClaseAusente;
        System.out.println("ingrese Nombre");
        nombre1 = captura3.nextLine();
        System.out.println("ingrese nombre del curso");
        nombreCurso = captura3.nextLine();
        System.out.println("ingrese nota definitiva");
        notaDefinitiva = captura3.nextInt();
        System.out.println("ingrese numero clases del semestre");
        numeroClaseSemestre = captura3.nextFloat();
        System.out.println("ingrese el numero clases ausente");
        numeroClaseAusente = captura3.nextFloat();

        float porcentageInacistencia = (numeroClaseAusente / numeroClaseSemestre);
        System.out.println(porcentageInacistencia);
        if (porcentageInacistencia > 0.20) {
            System.out.println("tiene que recuperar el semestr");

        } else
            System.out.println("felicidades choski, ganaste el semestre ");



         // leer dos numeros y determinar si son posaitivos
        int nume1, nume2 ;
        Scanner mn = new Scanner(System.in) ;
        System.out.println("validar si los dos numeros son positivos");
        System.out.println("ingresar numero 1");
        nume1 = mn.nextInt();
        System.out.println("ingresar numero 2");
        nume2 = mn.nextInt();
         if(nume1 > 0 && nume2 > 0){
             System.out.println("los dos nuemros son positivos");
         }
        /*
        Diseñar un algoritmo que lea el nombre de un empleado, su salario básico por hora,
         el nro. de horas trabajadas en un mes. Nos pide lo siguiente:
         */
         Scanner datos = new Scanner (System.in);

         String nombreEmpleado ;
         float  salarioMinimoHora = 4.167f;
         float horasTrabajadasMes ;
         float subsidioTransporte = 100.000f;

         System.out.println("calcular salario del empleado");
         System.out.println("ingrese el nombre del empleado");
         nombreEmpleado = datos.nextLine();
         System.out.println("ingrese horas trabajadas en el mes ");
         horasTrabajadasMes = datos.nextFloat();

        float salarioSinTransporte = (horasTrabajadasMes *salarioMinimoHora) ;
        float salarioTransporte = salarioSinTransporte + subsidioTransporte;

        if (salarioSinTransporte > (700.000)){
            System.out.println(nombreEmpleado);
            System.out.println("Horas trabajadas :"+horasTrabajadasMes );
            System.out.println("Valor horas trabajadas :" + salarioMinimoHora);
            System.out.println("salario optenido por las horas trabajadas: "+salarioSinTransporte);
            System.out.println("Salario con subsidio de tranporte: "+ salarioTransporte);


        }else {
            System.out.println("Se le informa a " + nombreEmpleado + " que  no alcanzo el salari minimo");
            System.out.println("horas trabajadas  :" + horasTrabajadasMes);
            System.out.println("Salario con transporte :" + salarioTransporte);

        }
       /* Scanner capEdad = new Scanner (System.in);
        int edadServicio ;
        String genero ;
        System.out.println("registro para el servicio Militar");
        System.out.println("ingrese el edad ");
        edadServicio = capEdad.nextInt();
        System.out.println("ingrese genero");
        genero = capEdad.nextLine();

        if ((edadServicio >= 18 && edadServicio <=25 )){
            if(genero.equals("masculino"))
                System.out.println("la persona es propisia para prestar el servicio");

        }else
            System.out.println("la persona no cumple conm los requisitos");
            */

        /*
        * Crear un programa que lea números enteros (Positivos y
        Negativos) del teclado y muestre la suma de dichos
        números ingresados, el programa se detendrá cuando el
        usuario indique el número 0.
        Utilizar bucle while
        * */
        Scanner capVal = new Scanner(System.in);
        int val1, val2,val3, sum,exi = 1 ;
        int cont=1 ;
        System.out.println("sistemas de sumas repetitivo");

        while(cont > 0 ) {

            System.out.println("ingrse valor");
            val1 = capVal.nextInt();
            System.out.println("ingrese  valor");
            val2 = capVal.nextInt();
            System.out.println("ingrese  valor");
            val3 = capVal.nextInt();
            sum = val1 + val2 + val3;
            System.out.println("la suma es :" + sum);
            System.out.println("ingrese uno para continar, '0' para salir");
            cont =capVal.nextInt();
            if(cont == 0){
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

        while(i <= container){
            if (i!= 2  && i != 5 && i != 9)
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
        while (x <= n){
            if (x <= 10 || x >=20) // 1-2....9..10..20..
                System.out.println(x);


            x++;
        }
        // Imprimir la suma de los números del 1 al 10
        int j = 1,number1 = 10;
        int sum1=0 ;

        while(j <=  number1){
            sum1 = j + j ;
            System.out.println("la suma es : "+j+"+"+j+"="+ sum1 );

            j++;

        }



    }

}



