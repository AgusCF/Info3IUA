package utilitis.PilaYColaConLista;

import java.util.Scanner;
import utilitis.Ordenamiento.Pedido;

public class CargarDatos {
        Scanner entrada = new Scanner(System.in);
        private int idSum = 1;
        
        public void cargarDatos(Pedido newPedido){
        System.out.println("Ingresa los datos a continuacion:");
        System.out.print("\nCliente (Nombre): ");
        if (idSum != 1) {
            entrada.nextLine();
        }
        newPedido.setNombreCliente(entrada.nextLine());

        System.out.print("\nIngresa el tiempo de preparacion(minutos): ");
        newPedido.setTiempo(entrada.nextInt());

        System.out.print("\nIngresa el precio: ");
        newPedido.setPrecio(entrada.nextFloat());

        newPedido.setPedido(idSum++);
    }
}
