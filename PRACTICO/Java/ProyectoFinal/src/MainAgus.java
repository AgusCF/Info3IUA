import Utilitis.MonticuloBin;
import java.util.Scanner;
import java.util.Random;
public class MainAgus {
    public static void main(String[] args) {
        Scanner entrda = new Scanner(System.in);
        Random random = new Random();
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
                    2. Cargar monticulo con un numero random
                    3. Imprimir monticulo como arbol
                    4. Imprimir monticulo como arreglo
                    5. Eliminar un minimo del monticulo
                    6. Ver el minimo
                    7. Cargar todo el monticulo de manera automatico y aleatoria
                    8. Salir del programa""");
            System.out.print("\nOpcion: ");
            op = entrda.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese valor ");
                    num = entrda.nextInt();
                    monticulo.insert(num);
                    break;
                case 7:
                    System.out.println("Cargando el monticulo de manera automatico y aleatoria");
                    for(int i=0;i<tam;i++){
                        num = random.nextInt(100);
                        monticulo.insert(num);
                        if(monticulo.isfull()==true){
                            break;
                        }
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
                case 2:
                    num = random.nextInt(100);
                    monticulo.insert(num);
                    break;
                case 8:
                    
                    break;
                default:
                    System.out.println("La opcion ingresada no existe, porfavor intente de nuevo");
                    break;
            }
        } while (op!=8);
        entrda.close();
    }
}
