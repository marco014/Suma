package Suma;

import Suma.models.Operaciones;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Elija una opcion");
            System.out.println("1. Agregar numeros");
            System.out.println("2. Mostrar arreglo de los numeros");
            System.out.println("3. Mostrar suma de los numeros");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite un numero: ");
                    int num = entrada.nextInt();
                    operaciones.añadir(num);
                    break;
                case 2:
                    operaciones.vizualizar();
                    break;
                case 3:
                    operaciones.suma();
                    operaciones = new Operaciones();
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
    }
}
