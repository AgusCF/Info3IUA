package utilitis;

public class factorial {
    public int facto(int n){

        if (n==0) {
            return 1;
            
        }
        else{
            
            return n*(facto(n-1));
        }
    }
    
}
