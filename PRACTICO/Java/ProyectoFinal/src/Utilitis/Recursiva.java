package Utilitis;

public class Recursiva {
    public int factorial(int n){

        if (n==0) {
            return 1;
            
        }
        else{
            
            return n*(factorial(n-1));
        }
    }
    public int sumaEnteros(int num){
        if (num==0) {
            return(0);
        }else{
            return(sumaEnteros(num-1)+num);
        }
    }
    public int potencia(int base, int exponente){
        if (exponente==0) {
            return(1);
        }else{
            return(potencia(base, exponente-1)*base);
        }
    }
    public void conteoRegresivo(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            conteoRegresivo(n - 1);
        }
    }
    public int producto(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + producto(a, b - 1);
        }
    }
    public void imprimirInverso(int[] arr, int index) {
        if (index >= 0) {
            System.out.print(arr[index] + " ");
            imprimirInverso(arr, index - 1);
        }
    }
    public int contarUnosBinarios(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 2) + contarUnosBinarios(n / 2);
        }
    }
}
