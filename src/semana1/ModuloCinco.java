package semana1;
import java.util.Arrays;
import java.util.Scanner;
public class ModuloCinco {
    public static void main (String [] args){
        // Vectores o Arrays


      /*  int [] losValores  = new int[10];
        losValores [0]=1;
        losValores [1]=2;
        losValores [2]=3;
        losValores [3]=4;
        losValores [4]=5;

        for (int i = 0; i <losValores.length ; i++) {
            System.out.println("posición " + i + " valor "+losValores[i]);
        }

        int [] numero = {1,2,3}; // tambien podemos pasar datos a un array de esta manera
        System.out.println(numero[0]); */



        Scanner scne = new Scanner(System.in);

        int numeroElementos;
        System.out.println("ingrese el numero de elementos que tendra el array");
        numeroElementos = scne.nextInt();

        int [] numero1 = new int[numeroElementos]; // DEFINO EL ARREGLO

        System.out.println("digite los elementos a continuación ");
        for (int i = 0; i <numeroElementos ; i++) {
            System.out.println("digite un numero");
            numero1[i]=scne.nextInt();

        }
        System.out.println("los numeros son");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(numero1[i]);

        }
        // creacion del scanner
        Scanner scnOracion = new Scanner(System.in);
        String [] palabras;
        char [] letras;
        int cantidadRepeticiones = 1;
        String pababrasRepetidas = "";
        String oracion = "";
        // se utiliza el bucle do while hasta que el usuario introduzca una oración
        do{
            System.out.println("introdusca la oracion a evaluar ");
            oracion = scnOracion.nextLine();
        }while(oracion.length()==0);
        //el metodo split retorna un arreglo donde cada elemento esta dividido por el parametro indicado
        palabras =oracion.split(" "); //va a dividir cada vez que encuentre un espacio en blanco

        //el metodo replace remplaza un caracter por otro
        oracion = oracion.replace(" ","");
        //el metodo toCharArray retorna una arreglo de caracteres
        letras = oracion.toCharArray();

        //para ordenar arreglos se usa Arrays.sort
        Arrays.sort(palabras);
        Arrays.sort(letras);

        for (int i = 0; i < palabras.length; i++) {
            String palabraUxiliar = palabras [i];
            int contadorAuxiliar = 0;
            for (int j = 0; j < palabras.length ; j++) {
                if (palabras[j].equals(palabraUxiliar)){
                    contadorAuxiliar++;
                }
            }
            if (contadorAuxiliar > cantidadRepeticiones){
                cantidadRepeticiones = contadorAuxiliar;
                pababrasRepetidas = palabraUxiliar;
            }

        }
        System.out.println("cantidad de palabras que contiene la oracion es : " + palabras.length);
        System.out.println(cantidadRepeticiones > 1 ?("la palabra que se repite es [" + pababrasRepetidas +"] " + cantidadRepeticiones +" veces"): "ninguna se repite");
        System.out.println("palabras ordenadas ");
        System.out.println(Arrays.toString(palabras));
        System.out.println("letras Ordenadas");
        System.out.println(Arrays.toString(letras));
        scnOracion.close();

         /*
        * Para recorrer el array sería, por ejemplo:
        [code]

         for(i=0; i<losValores.length; i++)
         {System.out.println(losValores[i]);}

        [/code]

        Si quisiéramos recorrer el array de atrás hacia
        adelante sería de la siguiente manera:

        [code]

         for(i=losValores.length-1; i>=0; i--)
         {System.out.println(losValores[i]);

        [/code]*/


        //arrays leido de alante pera tras
        String [] ora = new String[4];
        ora [0]="h";
        ora [1]="o";
        ora [2]="l";
        ora [3]="a";
        for (int i = ora.length-1; i >=0 ; i--) {
            System.out.println(ora[i]);

        }
        // leido de de manera normal
        int [] edad = new int[10];
        for (int i = edad.length-1; i>=0 ; i--) {
            System.out.println(i);

        }
        //recoriendo areglos
        int [] losValores= new int[5];
        losValores[0]= 1;
        losValores[1]=2;
        losValores[2]=3;
        losValores[3]=3;
        losValores[4]=5;
        int suma= 0;
        for (int i = 0; i <losValores.length ; i++) {
            suma = suma + losValores[i];

        }
        System.out.println(suma);


        //para copiar los elementos de un arrays podemos crear un nuevo array y copiar los elementos uno a nuo

        int pares [] = {2,4,6,8,10};
        int [] datos = new int[pares.length];
        for (int i=0;i <pares.length;i++){
            datos[i]=pares[i];
            System.out.println(datos[i]);

        }
        // para ordenar Arrays usamos Arrays.sort(valor)
        int [] nms = {8,5,3,1,4,2};
        Arrays.sort(nms);
        for (int i = 0; i < nms.length; i++) {
            System.out.println(nms[i]);
        }
        // para separar una cadena de texto usamos la funcion split  y luego guardamos en un arreglo
        String[] palabra;
        String oracion1 = "hola mundo donde ";
        palabra = oracion1.split(" "); //para hacer uso de la funcion split tenemos que pasarle una cadena
        for (int i = 0; i <palabra.length ; i++) {
            // System.out.println(i);//aqui imprimimos los numeros de cada posición
            System.out.println(palabra[i]); //aqui imprimimos el contenido de cada indice
        }

        // para comparar dos arraglos usamos Arrays.equals(v1,v2);
        String cden = "hola pepe, hola jose";
        String cd1 = "hola pepe, hola jose";
        String [] compara;
        String [] cpm;
        cpm = cd1.split(" "); // separamos la cadena de texto indicando el caracter
        compara = cden.split(" ");
        // comparamos los vectores para saver si son iguales
        if( Arrays.equals(compara,cpm)){
            System.out.println("las vectores son iguales ");
        }else
            System.out.println("loa vectores no cinciden");

        //: devuelve una cadena
        // representa el contenido del vector con  Arrays.toString(v)
        String cde = "hola pepe, hola jose";
        String cd = "hola pepe, hola jose";
        String [] compra;
        String [] cm;
        cm = cd.split(" "); // separamos la cadena de texto indicando el caracter
        //compara = cden.split(" ");
        // devuelve una cadena
        //que representa el contenido del vector.
        String devuelve = Arrays.toString(cm);
        System.out.println(devuelve);


        //Búsqueda del número máximo y mínimo de un vector

        int [] vct1 = {10,5,8,20,5};

        int maximo =vct1 [0],minimo = vct1[0];

        // si solo voy a calcular el maximo y minimo puedo recorrer desde 1
        for (int i = 1; i <vct1.length ; i++) {
            if(vct1[i]>maximo)
                maximo = vct1[i];
            if(vct1[i]<minimo)
                minimo = vct1[i];
        }
        System.out.println("el maximo wa : "+maximo);
        System.out.println("el minimo es : " +minimo);








        // Contar cuántas veces aparece el número 10
        int [] areglo ={10,15,20,10,12};
        int contador = 0;
        for (int i = 0; i < areglo.length ; i++) {
            if(areglo[i]==10)
                contador++;

        }
        System.out.println("el numero 10 aparece :" +contador+ " veces ");

        // Contar cuántas veces aparece la letra 'a'
        String [] areglo1 ={"a","b","c","a","a"};
        int contador1 = 0;
        for (int i = 0; i < areglo1.length ; i++) {
            if(areglo1[i].equals("a"))
                contador1++;

        }
        System.out.println("el letra 'a' aparece :" +contador1+ " veces ");

        /*Totalizar un vector y calcular el promedio
        [code]
        int total=0;
        for(int a=0;a<vec.length;a++){
            total+=vec[a];
        }
        System.out.println("La suma total es:"+total);
        System.out.println("El promedio
                es:"+total/vec.length);
                [/code]*/
        short [] dato ={345,23,-34,872,1030,-32,18};
        float suma1 = 0;
        float totalpro = 0;
        for (int i = 0; i<dato.length;i++){
            suma1 +=dato[i];
            totalpro =(suma1/dato.length);
        }
        System.out.println("sumatoria : "+suma1);
        System.out.println("el promedio es :"+totalpro);
    }
}
