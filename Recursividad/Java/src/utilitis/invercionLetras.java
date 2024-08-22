package utilitis;

public class invercionLetras {
    public String inver(String l){
        if (l == null) {
            return ("Esta vacios");
        }
        else{
            return inver(l.substring(1)+l.charAt(0));
        }
    }
}
