package utilitis;

public class SumaNumNaturales {
    public int sum(int num){
        if (num==0) {
            return(0);
        }else{
            return(sum(num-1)+num);
        }
    }
}
