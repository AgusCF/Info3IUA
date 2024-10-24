import java.util.Scanner;
import Utilitis.RaB.ArbolRyB;
import Utilitis.RaB.NodeRyB;

public class mainRaB {
    public static void main(String[] args) {
        ArbolRyB<Integer> arbol = new ArbolRyB<>(); // Crear el árbol
        NodeRyB<Integer> root = null; // Inicializamos la raíz como null
        Scanner entrda = new Scanner(System.in);

        int select = 0;
        do {
            System.out.println();
            System.out.println("""
                        ##### Menu #####
                    1. Insertar elementos
                    2. Mostrar en orden
                    3. Cargcar valores por defecto 1
                    4. Cargcar valores por defecto 2
                    5. Eliminar un numero
                    6. Salir del programa""");
            System.out.print("\nOpcion: ");
            select = entrda.nextInt();

            switch (select) {
                case 1:
                    System.out.print("\nIngresa el numero: ");
                    int data = entrda.nextInt();
                    // Actualizar la raíz del árbol al insertar un nuevo número
                    root = arbol.insert(root, data);
                    break;
                case 2:
                    if (root != null) {
                        arbol.imprimirArbolConRamas(root, "", false);
                    } else {
                        System.out.println("El árbol está vacío.");
                    }
                    break;
                case 3:
                    // Lógica para cargar valores por defecto 1
                    break;
                case 4:
                    // Lógica para cargar valores por defecto 2
                    break;
                case 5:
                    // Lógica para eliminar un número
                    break;
                default:
                    break;
            }
        } while (select != 6);
        entrda.close();
    }
}
