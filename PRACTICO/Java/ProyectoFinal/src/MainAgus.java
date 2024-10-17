import Utilitis.MonticuloBin;
import java.util.Scanner;
public class MainAgus {
    public static void main(String[] args) {
        Scanner entrda = new Scanner(System.in);
        int op=0;
        int num,tam;
        System.out.println("Ingrese la capacidad del Monticulo");
        System.out.print("\nTamanio: ");
        tam= entrda.nextInt();
        MonticuloBin<Integer> monticulo = new MonticuloBin<>(tam);
        do {
            System.out.println();
            System.out.println("""
                    ##### Menu #####
                    1. Cargar monticulo a mano
                    2. Cargar monticulo automatico
                    3. Imprimir monticulo como arbol
                    4. Imprimir monticulo como arreglo
                    5. Eliminar un minimo del monticulo
                    6.Ver el minimo
                    7. Salir del programa""");
            System.out.print("\nOpcion: ");
            op = entrda.nextInt();
            switch (op) {
                case 1:
                    for(int i=0;i<tam;i++){
                        System.out.print("Ingrese valor "+i+" de "+ tam);
                        num = entrda.nextInt();
                        monticulo.insert(num);
                    }
                    break;
                case 2:
                    for(int i=0;i<tam;i++){
                        monticulo.insert(num);
                    }
                    break;
                case 3:
                    System.out.println("Montículo impreso como árbol:");
                    monticulo.imprimirMonticuloConRamas(0, "", false);
                    break;
                case 4:
                    System.out.println("\nMontículo impreso como arreglo:");
                    monticulo.imprimirComoArreglo();
                    break;
                case 5:
                    System.out.println("\nEliminando el valor más alto del montículo (raíz):");
                    monticulo.remove();
                    break;
                case 6:
                    System.out.println("Minimo del monticulo: "+monticulo.peek());
                    break;
                default:
                    System.out.println("La opcion ingresada no existe, porfavor intente de nuevo");
                    break;
            }
        } while (op!=7);
        
    }
}
