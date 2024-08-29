package mains;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import utilitis.Ordenamiento.MenuRes;
import utilitis.Ordenamiento.Pedido;



public class Proyecto_2_Ordenamiento {
    public static void main(String[] args) throws Exception {
        MenuRes menu = new MenuRes();
        Scanner entrada = new Scanner(System.in);
        int eleccion = 0;
        List<Pedido> listaDePedidos = new ArrayList<Pedido>();
        
        do {
            menu.mostrarMenu();
            eleccion = entrada.nextInt();
            switch (eleccion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    break;
            }

        } while (eleccion!=5);
        
    }
}
