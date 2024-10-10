import Utilitis.ArbolAVL;
import Utilitis.Node;
import Utilitis.Funcion;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Node<Integer> root = null;
        @SuppressWarnings("rawtypes")
        ArbolAVL arbolAVL = new ArbolAVL();
        Scanner entrda = new Scanner(System.in);
        Funcion fun= new Funcion();

        int select = 0;
        int selectop=0;
        do {
            System.out.println();
            System.out.println("""
                        ##### Menu #####
                    1. Insertar elementos
                    2. Mostrar en orden
                    3. Cargcar valores por defecto 1
                    4. Cargcar valores por defecto 1
                    5. salir del programa""");
            System.out.print("\nOpcion: ");
            select = entrda.nextInt();
            
            //Algo extra---------------------------------------------------
            if(select==3 || select==4){
                System.out.println("Esta opcion reinciciara el arbol.");
                System.out.println("Si desea continuar ingrese 1");
                selectop = entrda.nextInt();
                if (selectop!=1) {
                    select =5;
                }
            }
            //--------------------------------------------------------------
            
            switch (select) {
                case 1:
                    root = fun.cargarAMano(arbolAVL,root);
                    break;
                case 2:
                    System.out.println("Árbol AVL con ramas:");//Imprime con ramitas "┌───" y "└───"
                    arbolAVL.imprimirArbolConRamas(root, "", false);
                    break;
                case 3:
                    root =null;
                    root =fun.precargaAVL1(arbolAVL,root);
                    break;
                case 4:
                    root =null;
                    root =fun.precargaAVL2(arbolAVL,root);
                    break;
                case 5:
                    System.out.println("Operacion cancelada con exito");
                    break;
                default:
                    break;
            }
        } while (select != 6);
        entrda.close();
    }
}
