package utilitis.Ordenamiento;

public class Pedido {
    private int tiempo; // Tiempo en minutos
    private String nombreCliente;
    private int pedido;
    private float precio;

    void Pedido(int tiempo, String nombreCliente, int pedido,float precio) {
        setNombreCliente(nombreCliente);
        setPedido(pedido);
        setTiempo(tiempo);
        setPrecio(precio);
    }
    void Pedido(){
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
        return ("Pedido [Tiempo= " + tiempo + ", NombreCliente= " + nombreCliente + ", Pedido=" + pedido + ", Precio= "+ precio + "]");
    }
    
}
