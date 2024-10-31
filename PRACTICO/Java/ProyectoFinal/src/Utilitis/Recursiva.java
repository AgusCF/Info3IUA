package Utilitis;

public class Recursiva {

    /**
     * Calcula el factorial de un número n de manera recursiva.
     * 
     * @param n El número del cual se quiere obtener el factorial.
     * @return El factorial de n.
     */
    public int factorial(int n) {
        if (n == 0) { // Caso base: el factorial de 0 es 1.
            return 1;
        } else { // Llamada recursiva para calcular n * factorial(n - 1).
            return n * factorial(n - 1);
        }
    }

    /**
     * Calcula la suma de todos los enteros desde 1 hasta num de forma recursiva.
     * 
     * @param num El número hasta el cual se quiere sumar.
     * @return La suma de todos los enteros desde 1 hasta num.
     */
    public int sumaEnteros(int num) {
        if (num == 0) { // Caso base: la suma de 0 es 0.
            return 0;
        } else { // Llamada recursiva para sumar num + sumaEnteros(num - 1).
            return sumaEnteros(num - 1) + num;
        }
    }

    /**
     * Calcula la potencia de una base elevada a un exponente de manera recursiva.
     * 
     * @param base      La base de la potencia.
     * @param exponente El exponente al que se eleva la base.
     * @return El resultado de base^exponente.
     */
    public int potencia(int base, int exponente) {
        if (exponente == 0) { // Caso base: cualquier número elevado a 0 es 1.
            return 1;
        } else { // Llamada recursiva para multiplicar base * potencia(base, exponente - 1).
            return potencia(base, exponente - 1) * base;
        }
    }

    /**
     * Imprime un conteo regresivo desde el número n hasta 1.
     * 
     * @param n El número desde el cual comenzar el conteo regresivo.
     */
    public void conteoRegresivo(int n) {
        if (n > 0) { // Caso base: detiene la recursión cuando n es menor o igual a 0.
            System.out.print(n + " ");
            conteoRegresivo(n - 1); // Llamada recursiva disminuyendo n.
        }
    }

    /**
     * Calcula el producto de dos números mediante sumas sucesivas recursivas.
     * 
     * @param a Primer número.
     * @param b Segundo número.
     * @return El producto de a y b.
     */
    public int producto(int a, int b) {
        if (b == 0) { // Caso base: cualquier número multiplicado por 0 es 0.
            return 0;
        } else { // Llamada recursiva sumando a en cada paso, decrementando b.
            return a + producto(a, b - 1);
        }
    }

    /**
     * Imprime los elementos de un arreglo en orden inverso usando recursión.
     * 
     * @param arr   El arreglo cuyos elementos se quieren imprimir en orden inverso.
     * @param index Índice actual desde el cual se imprime en orden inverso.
     */
    public void imprimirInverso(int[] arr, int index) {
        if (index >= 0) { // Caso base: detiene la recursión cuando el índice es negativo.
            System.out.print(arr[index] + " ");
            imprimirInverso(arr, index - 1); // Llamada recursiva con el índice decrementado.
        }
    }

    /**
     * Cuenta el número de unos en la representación binaria de un número.
     * 
     * @param n El número del cual se quiere contar los unos en binario.
     * @return La cantidad de unos en la representación binaria de n.
     */
    public int contarUnosBinarios(int n) {
        if (n == 0) { // Caso base: cuando n es 0, no hay unos.
            return 0;
        } else { // Llamada recursiva contando el último bit de n (n % 2) y dividiendo por 2.
            return (n % 2) + contarUnosBinarios(n / 2);
        }
    }
}
