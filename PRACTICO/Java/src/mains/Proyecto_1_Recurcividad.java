package mains;

import utilitis.*;

public class Proyecto_1_Recurcividad {
    public static void main(String[] args) throws Exception {
        //--------------------------------EJE 1
        factorial facti = new factorial();
        int resu = 0; 
        resu = facti.facto(5);
        System.out.println("El resultado es " + resu);
        //--------------------------------EJE 2
        SumaNumNaturales sumNatural=new SumaNumNaturales();
        resu=sumNatural.sum(5);
        System.out.println("La suma da:"+resu);
        //--------------------------------EJE 3
        Fibonacchi fibo = new Fibonacchi();
        resu=fibo.fibonacchi(11);
        System.out.println("La secuencia de fibonacchi es:"+resu);
        //--------------------------------EJE 4
        inversionLetras invertir = new inversionLetras();
        String palabra = null;
        palabra = invertir.invertir("hola");
        System.out.println("La palabra invertida es: " + palabra );
        //--------------------------------EJE 5
        Potencia pot = new Potencia();
        resu=pot.potenca(2,3);
        System.out.println("La potencia da:"+resu);
        



    }
}
