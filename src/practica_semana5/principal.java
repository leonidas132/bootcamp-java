package practica_semana5;




import java.util.*;


public class principal {
    static ArrayList<Persona>lisPersona = new ArrayList<>();
    static  Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        Persona pe = new Persona();
        int contador ;
        String nombre ;
        String apellido;

        int cont=0;
        do {
            System.out.println("operaciones" +
                    "\n 1. add" +
                    "\n 2. size" +
                    "\n 3. remote" +
                    "\n 4. removeAll"+
                    "\n 5. mostrar datos" +
                    "\n 6. empty");
            System.out.println("ingrese la opcion");
            byte opc = teclado.nextByte();
            switch (opc){
                case 1:
                    System.out.println("numeros de personas");
                    contador = teclado.nextByte();
                    for (int i = 0; i < contador  ; i++) {
                        Persona persona = null;
                        teclado.nextLine();
                        System.out.println("nombre ["+ (i) +"]");
                        nombre = teclado.nextLine();
                        System.out.println("apellido");
                        apellido = teclado.nextLine();
                        persona = new Persona(nombre,apellido);
                        add(persona);
                    }
                    break;
                case 2:
                    // metodo size()
                    System.out.println("cantidad de personas guardadas "+ size(lisPersona));
                    break;
                case 3:
                    //metodo remover
                    remove(lisPersona);
                    break;
                case 4:
                    //remover all

                    removeAll(lisPersona);

                    break;
                case 5:
                    System.out.println("personas guardadas");
                    for (Persona p: lisPersona){
                        System.out.println(p);
                    }
                    break;
                case 6:
                    empty(lisPersona);
                     break;
            }

            System.out.println("desae continar 1 si  0 no");
            cont = teclado.nextInt();

        }while(cont != 0);
        }//main





    // metodo de agregar
    public static void add (Persona persona) {
        lisPersona.add(persona);
        System.out.println("datos agregados");
    }
    //metodo size--cantidad de elementos
    public static int size(ArrayList<Persona> tamano){
       return tamano.size();
    }
    //metodo remove--remueve un elemento por el index
    public static void remove(ArrayList<Persona> idex) {
        System.out.println("ingrese el numero de la perosna a remover");
        int numero = teclado.nextInt();
        idex.remove(numero);
        System.out.println("persona removida");

    }

    // metodo removeAll
    public static void removeAll(ArrayList<Persona> list){
        System.out.println("se eliminaron los datos");
        list.removeAll(lisPersona);


        for (Persona p:lisPersona){
            System.out.println(p);
            System.out.println("no hay nada");
        }
    }
    public static void empty (ArrayList<Persona> lista) {
        boolean v = false ;
        boolean r = lista.isEmpty();
        if (r == v){
            System.out.println("la lista contiene datos");
            
        }else
            System.out.println("la lista no contiene datos");

    }

}//clase



