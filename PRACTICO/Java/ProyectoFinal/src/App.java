import Utilitis.ArbolAVL;
import Utilitis.Node;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Node<Integer> root = null;
        ArbolAVL arbolAVL = new ArbolAVL();
        Scanner entrda = new Scanner(System.in);

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
                    System.out.print("\nIngrea el dato a gurdar: ");
                    dato = entrda.nextInt();
                    root = arbolAVL.insert(root, dato);
                    break;
                case 2:
                    arbolAVL.recorrerEnOrden(root);
                    break;
                default:
                    break;
            }
        } while (select != 4);

    }
}
