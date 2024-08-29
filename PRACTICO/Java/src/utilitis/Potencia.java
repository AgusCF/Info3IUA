package utilitis;
public class Potencia {
    public int potenca(int a, int b){
        if (b==0) {
            return(1);
        }else{
            return(potenca(a, b-1)*a);
        }
    }
}

