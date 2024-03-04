package AER542;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in;

    public static void casoDePrueba() {
        boolean sirve = true;

        int[] tamJug = {in.nextInt(), in.nextInt(), in.nextInt()};
        int[] tamCaj = {in.nextInt(), in.nextInt(), in.nextInt()};
        Arrays.sort(tamJug);
        Arrays.sort(tamCaj);
        for (int i = 0; i < tamJug.length; i++) {
            if (tamJug[i] >= tamCaj[i]) {
                sirve = false;
            }
        }
        if (!sirve) {
            System.out.println("NO SIRVE");
        } else {
            System.out.println("SIRVE");
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

    } // main
}