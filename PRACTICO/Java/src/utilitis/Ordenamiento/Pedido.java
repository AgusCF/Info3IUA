package utilitis.Ordenamiento;

import java.lang.reflect.Field;

public class Pedido implements ComparableCustom<Pedido, String> {
    private int tiempo; // Tiempo en minutos
    private String nombreCliente;
    private int pedido;
    private float precio;

    public Pedido(int tiempo, String nombreCliente, int pedido, float precio) {
        this.nombreCliente=nombreCliente;
        this.pedido=pedido;
        this.tiempo=tiempo;
        this.precio=precio;
    }

    public Pedido() {
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public String toString() {
        return ("Pedido [Tiempo: " + tiempo + ", NombreCliente: " + nombreCliente + ", Pedido: " + pedido
                + ", Precio: " + precio + "]");
    }

    // Implementación del método compareTo de la interfaz Comparable
    // @Override
    // public int compareTo(Pedido otroPedido, String orderBy) {
    //     // Ordenar por nombre del cliente

    //     switch (orderBy) {
    //         case "nombreCliente":
    //             return this.nombreCliente.compareTo(otroPedido.getNombreCliente());        
    //         case "precio":
    //             return Float.compare(this.precio, otroPedido.getPrecio());
    //         default:
    //             System.out.println("Method is not implement");
    //             return 0;
    //     }
        
    // }

    @Override
    public int compareTo(Pedido otroPedido, String orderBy) {
        try {
            // Usamos reflection para obtener el atributo basado en el nombre
            Field field = Pedido.class.getDeclaredField(orderBy);
            field.setAccessible(true); // Acceso a campos privados

            // Obtenemos los valores de los atributos de ambos objetos
            Object valorThis = field.get(this);
            Object valorOtro = field.get(otroPedido);

            // Comparamos según el tipo de dato
            if (valorThis instanceof String) {
                return ((String) valorThis).compareTo((String) valorOtro);
            } else if (valorThis instanceof Float) {
                return Float.compare((Float) valorThis, (Float) valorOtro);
            } else if (valorThis instanceof Integer) {
                return Integer.compare((Integer) valorThis, (Integer) valorOtro);
            } else {
                System.out.println("Unsupported attribute type for comparison.");
                return 0;
            }

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Field not found or inaccessible: " + orderBy);
            return 0;
        }
    }

}