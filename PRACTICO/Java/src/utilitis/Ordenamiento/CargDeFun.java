package utilitis.Ordenamiento;
import java.util.List;
import java.util.Scanner;
public class CargDeFun {
    int idSum = 1;
    Scanner entrada = new Scanner(System.in);
    public void cargagrPedido(List<Pedido> listaDePedidos){
        Pedido newPedido = new Pedido();
        System.out.println("Ingresa los datos a continuacion:");
        System.out.print("\nCliente (Nombre): ");
        if (idSum!=1) {
            entrada.nextLine();    
        }
        newPedido.setNombreCliente(entrada.nextLine());
        
        System.out.print("\nIngresa el tiempo de preparacion(minutos): ");
        newPedido.setTiempo(entrada.nextInt());
        
        System.out.print("\nIngresa el precio: ");
        newPedido.setPrecio(entrada.nextFloat());
        
        newPedido.setPedido(idSum++);
        listaDePedidos.add(newPedido);
    }

    public void mostrarListado(List<Pedido> listaDePedidos){
        listaDePedidos.forEach((pedido) -> {
            System.out.println(pedido);
        });
    }

}
