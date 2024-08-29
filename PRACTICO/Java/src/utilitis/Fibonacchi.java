package utilitis;

public class Fibonacchi {
    public int fibonacchi(int num){
        if (num==0) {
            return(0);
        }else if(num==1){
            return(1);
        }else{
            return(fibonacchi(num-2)+fibonacchi(num-1));
        }
    }
}
