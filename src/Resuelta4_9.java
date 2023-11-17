//Actividad 4.4 calcule el máx de 3 números

import java.util.Scanner;

public class Resuelta4_9 {
    static int maximo(int a, int b, int c){
        int aux = maximo(a, b);
        return (maximo(aux, c));
    }
    static int maximo(int a, int b){
        return (Math.max(a, b));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int a = sc.nextInt();
        System.out.println("Escribe otro número: ");
        int b = sc.nextInt();
        System.out.println("Escribe otro número: ");
        int c = sc.nextInt();
        System.out.println("El número mayor es: " + maximo (a,b,c));
    }
}