package utilitis.Recurcividad;

public class Factorial {
    public int facto(int n){

        if (n==0) {
            return 1;
            
        }
        else{
            
            return n*(facto(n-1));
        }
    }
    
}
