package mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utilitis.Ordenamiento.CargDeFun;
import utilitis.Ordenamiento.Incercion;
import utilitis.Ordenamiento.MenuRes;
import utilitis.Ordenamiento.Pedido;



public class Proyecto_2_Ordenamiento {
    public static void main(String[] args) throws Exception {
        MenuRes menu = new MenuRes();
        CargDeFun funcion = new CargDeFun();
        Incercion incercion= new Incercion();

        Scanner entrada = new Scanner(System.in);
        int eleccion = 0;
        int eleccionInterna = 0;

        List<Pedido> listaDePedidos = new ArrayList<Pedido>();

        do {
            menu.mostrarMenu();
            eleccion = entrada.nextInt();
            switch (eleccion) {
                case 1:
                    funcion.cargagrPedido(listaDePedidos);
                    funcion.mostrarListado(listaDePedidos);
                    break;
                case 2:
                    System.out.println("Seleccione tipo de Insercion:");
                    System.out.println("1-IncersionV1(Version armada por estudiantes)");
                    System.out.println("2-IncersionV2Version optimizada");
                    System.out.print("\nOpcion:");
                    eleccionInterna = entrada.nextInt();
                    switch (eleccionInterna) {
                        case 1:
                            incercion.incercionV1(listaDePedidos);
                            funcion.mostrarListado(listaDePedidos);
                            break;
                        case 2:
                            incercion.incercionV2(listaDePedidos);
                            funcion.mostrarListado(listaDePedidos);
                            break;
                        default:
                            System.out.println("El numero que ingreso no corresponde a ningun ordenamiento");
                            break;
                    }
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    break;
            }

        } while (eleccion!=5);
        entrada.close();
    }
}
