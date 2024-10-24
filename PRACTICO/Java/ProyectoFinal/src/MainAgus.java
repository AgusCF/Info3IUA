import Utilitis.MonticuloBin;
import Utilitis.Recursiva;

import java.util.Scanner;
import java.util.Random;
public class MainAgus {
    public static void main(String[] args) {
        men1();
    }
    public void men(){//MonticuloBinario
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
    public static void men1(){//Recursividad
        Scanner entrda = new Scanner(System.in);
        Random random = new Random();
        int op=0;
        int num,tam;
        Recursiva rec = new Recursiva();
        //Generar un arreglo random
        tam = random.nextInt(11) + 5;
        int[] arreglo=new int[tam];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(201) - 100;
        }
        do {
            System.out.println();
            System.out.println("""
                    ##### Menu #####
                    1. Factorial.
                    2. Suma de los primeros n enteros.
                    3. Potencia de un número.
                    4. Conteo regresivo.
                    5. Producto de dos números.
                    6. Arreglo en orden inverso.
                    7. Numero de unos en representación binaria.
                    8. Salir del programa""");
                //Para la opcion 7 se tiene que cargar un arreglo

            System.out.print("\nOpcion: ");
            op = entrda.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese valor para hacer el factorial: ");
                    num = entrda.nextInt();
                    System.out.println("El factorial de "+ num + " es "+rec.factorial(num));
                    break;
                case 2:
                    System.out.print("Ingrese valor para hacer la suma: ");
                    num = entrda.nextInt();
                    System.out.println("La suma para "+num+ " es "+ rec.sumaEnteros(num));
                    break;
                case 3:
                    System.out.println("Ingrese los valores para hacer la potencia: ");
                    System.out.print("Base: ");
                    num = entrda.nextInt();
                    System.out.print("Exponente: ");
                    tam = entrda.nextInt();//Deveria crear dos variables aparte... Y no reciclar tam
                    System.out.println("La potencia de "+num+"^"+tam+" es "+rec.potencia(num, tam) );
                    break;
                case 4:
                    System.out.print("Ingrese valor para hacer el conteo regresivo: ");
                    num = entrda.nextInt();
                    System.out.println("El conteo regrecivo es:");
                    rec.conteoRegresivo(num);
                    break;
                case 5:
                    System.out.print("Ingrese los valores para hacer el producto: ");
                    System.out.print("Primer valor: ");
                    num = entrda.nextInt();
                    System.out.print("Segundo Valor: ");
                    tam = entrda.nextInt();//Deveria crear dos variables aparte... Y no reciclar tam
                    System.out.println("El producto entre "+num+" y "+tam+" es "+rec.producto(num, tam));
                    break;
                case 6:
                    System.out.println("La inversion del arreglo da:");
                    rec.imprimirInverso(arreglo, arreglo.length-1);
                    break;
                case 7:
                    System.out.print("Ingrese valor para ver el número de unos en su representación binaria: ");
                    num = entrda.nextInt();
                    System.out.println("el número de unos en la representación binaria de "+num+" es "+rec.contarUnosBinarios(num));
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
