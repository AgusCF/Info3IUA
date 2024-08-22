package mains;

import utilitis.factorial;

public class App {
    public static void main(String[] args) throws Exception {
        factorial facti = new factorial();
        int resu = 0; 
        resu = facti.facto(5);
        System.out.println("El resultado es " + resu);
        //--------------------------------
        int suma=0;
        SumaNumNaturales sumNatural=new SumaNumNaturales();
        suma=sumNatural.sum(5);
        System.out.println("La suma da:"+suma);
        SumaNumNaturales t = new SumaNumNaturales();

    }
}
