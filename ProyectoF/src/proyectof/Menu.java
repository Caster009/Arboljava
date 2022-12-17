package proyectof;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {

    private static int genero;
    private static String nombre;
    
      public static void main(String[] args) {
        Scanner linea = new Scanner(System.in);
        Arbol ab = new Arbol();
        
       
        System.out.println("--------------------------Carlos------------------------------ \n"
                + "-----------------Maria ------------------Luis-------------\n"
                + "------------ Ana------Jorge--------Alicia----Andres-------------\n"
                + "--Inorden: Ana, Maria, Jorge, Carlos, Alicia, Luis, Andres------------\n"
                + "--Postorden: Ana, Jorge, Maria, Alicia, Andres, Luis, Carlos-----------\n"
                + "--Preorden: Carlos, Maria, Ana,Jorge, Luis, Alicia, Andres--------------");

        int op;
        boolean h = true;
        while (h) {
            System.out.println("OPCIONES");
            System.out.println("1. Insertar persona");
            System.out.println("2. Salir");

            op = linea.nextInt();
            switch (op) {

                case 1:
                    try {
                         System.out.println("Digite el nombre de la persona");
                    nombre = linea.next();
                    System.out.println("Digite el genero de la persona");
                    try {
                        genero = linea.nextInt();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("no es una letra es un numero ingresalo de nuevo ");
                        linea = new Scanner(System.in);
                        genero = linea.nextInt();
                    }
                    
                case 2:
                    h = false;
                    break;

                default:
                    System.out.println("Error no existe la opcion");
                    break;

            }}}}}
