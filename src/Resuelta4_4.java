import java.util.Scanner;
public class Resuelta4_4 {
    static int maximo(int a, int b){
        return (Math.max(a, b));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int a = sc.nextInt();
        System.out.println("Escribe otro número: ");
        int b = sc.nextInt();
        System.out.println("El número mayor es: " + maximo (a,b));
    }
}
