import Utilitis.ArbolAVL;
import Utilitis.Node;
import Utilitis.Funcion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Node<Integer> root = null;
        ArbolAVL arbolAVL = new ArbolAVL();
        Scanner entrda = new Scanner(System.in);
        Funcion fun= new Funcion();

        int select = 0;
        int dato = 0;
        do {
            System.out.println();
            System.out.println("""
                        ##### Menu #####
                    1. Insertar elemento
                    2. Mostrar en orden
                    3. Mostrar en desorden
                    4. salir del programa""");
            System.out.print("\nOpcion: ");
            select = entrda.nextInt();
            switch (select) {
                case 1:
                    root = fun.cargarAMano(arbolAVL,root);
                    break;
                case 2:
                    System.out.println("Árbol AVL con ramas:");//Imprime con ramitas "┌───" y "└───"
                    arbolAVL.imprimirArbolConRamas(root, "", false);
                    break;
                case 3:
                    root =fun.precargaAVL1(arbolAVL,root);
                    root =fun.precargaAVL2(arbolAVL,root);
                    
                    break;
                default:
                    break;
            }
        } while (select != 4);

    }
}
