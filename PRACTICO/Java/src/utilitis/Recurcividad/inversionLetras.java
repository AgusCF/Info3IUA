package utilitis.Recurcividad;

public class InversionLetras {
    public String invertir(String palabra) {
        // Caso base: si la cadena es nula o tiene una longitud de 0 o 1, devolverla tal cual
        if (palabra == null || palabra.length() <= 1) {
            return palabra;
        } else {
            // Tomar el último carácter y añadirlo al resultado de invertir el resto de la cadena
            return invertir(palabra.substring(1)) + palabra.charAt(0);
        }
    }
}