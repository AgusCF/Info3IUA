package utilitis.Ordenamiento;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CargDeFun {
    int idSum = 1;
    Scanner entrada = new Scanner(System.in);

    public void cargagrPedido(List<Pedido> listaDePedidos) {
        Pedido newPedido = new Pedido();
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
        listaDePedidos.add(newPedido);
    }

    public void mostrarListado(List<Pedido> listaDePedidos) {
        listaDePedidos.forEach((pedido) -> {
            System.out.println(pedido);
        });
    }

    public boolean itsEmpty(List<Pedido> listaDePedidos) {
        if (listaDePedidos.size() == 0) {
            return (true);
        }
        return (false);
    }

    public void borrarElmentoLista(List<Pedido> listaDePedidos) {
        System.out.println("Ingrese el nombre del cliente cuyo pedido desea eliminar:");
        System.out.print("Cliente a eliminar (Nombre): ");
        entrada.nextLine(); // Consumir la nueva línea pendiente
        String nombreCliente = entrada.nextLine();

        for (int i = 0; i < listaDePedidos.size(); i++) {
            if (listaDePedidos.get(i).getNombreCliente().equals(nombreCliente)) {
                listaDePedidos.remove(i);
                System.out.println("Pedido eliminado con éxito.");
                break;
            }
        }

        // listaDePedidos.removeIf(pedido -> pedido.getNombreCliente() ==
        // entrada.toString());
        // El comando removeIf solo funcion en verciones de java 8 o superiores
    }

    public void cargarDiespedisos(List<Pedido> listaDePedidos) {
        Random aleatorio = new Random();
        for (int i = 0; i < 10; i++) {
            Pedido newPedido = new Pedido();
            newPedido.setNombreCliente("Pureva-" + aleatorio.nextInt(100));

            newPedido.setTiempo(aleatorio.nextInt(30));

            newPedido.setPrecio(aleatorio.nextFloat(100));

            newPedido.setPedido(idSum++);
            listaDePedidos.add(newPedido);
        }
        mostrarListado(listaDePedidos);
    }
}
