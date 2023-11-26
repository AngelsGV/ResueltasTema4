//Función --> reciba un número y muestre tabla de multiplicar, los números impares.
import java.util.Scanner;
public class TablaDeMultiplicar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para que le muestre los impares de las tablas de multiplicar: ");
        int n = sc.nextInt();
        impares(n);
    }
    static void impares(int n){
        for (int tabla = 1; tabla <= 10 ; tabla += 2){
            System.out.println("\n\nTabla del " + tabla);
            for (n = 1; n <= 10; n+=2){
                System.out.println(tabla + " x " + n + " = " + tabla*(n));
            }
        }
    }
}

