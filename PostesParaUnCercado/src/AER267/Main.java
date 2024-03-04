package AER267;

import java.util.Scanner;

public class Main {

    static Scanner in;

    public static boolean casoDePrueba() {
        double largo = in.nextInt();
        double ancho = in.nextInt();
        double limite = in.nextInt();
        int numPostes = 4;
        if (largo == 0 && ancho == 0 && limite == 0) {
            return false;
        } else {
            if (largo > limite) {
                numPostes += (largo / limite)*2;
            }
            if (ancho > limite) {
                numPostes += (largo / limite)*2;
            }
            System.out.println(numPostes);
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while (casoDePrueba());

    } // main
}