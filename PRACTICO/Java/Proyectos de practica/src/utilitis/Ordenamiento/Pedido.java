package utilitis.Ordenamiento;

public class Pedido implements Comparable<Pedido> {
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
    @Override
    public int compareTo(Pedido otroPedido) {
        // Ordenar por nombre del cliente
        return this.nombreCliente.compareTo(otroPedido.getNombreCliente());
    }
}