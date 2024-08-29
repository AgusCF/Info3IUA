package utilitis.Recurcividad;

public class inversionLetras {
    public String invertir(String l) {
        // Caso base: si la cadena es nula o tiene una longitud de 0 o 1, devolverla tal cual
        if (l == null || l.length() <= 1) {
            return l;
        } else {
            // Tomar el último carácter y añadirlo al resultado de invertir el resto de la cadena
            return invertir(l.substring(1)) + l.charAt(0);
        }
    }
}