package utilitis.Recurcividad;
public class Potencia {
    public int potencia(int base, int exponente){
        if (exponente==0) {
            return(1);
        }else{
            return(potencia(base, exponente-1)*base);
        }
    }
}

