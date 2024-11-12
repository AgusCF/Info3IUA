package Utilitis.PilaYCola.PilaYColaConLista;

import java.util.Scanner;

import Utilitis.PilaYCola.NodeDato;

public class CargarDatos {
    Scanner entrada = new Scanner(System.in);

    public void cargarDatos(NodeDato newDato) {
        System.out.print("\nIngresa los datos a continuacion:");

        newDato.setDato(entrada.nextInt());

    }
}
