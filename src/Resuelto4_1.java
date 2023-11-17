import java.util.Scanner;
public class Resuelto4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número:");
        int n = sc.nextInt();
        System.out.println("--Antes de llamar la función--");
        eco(n);
        System.out.println("--Después de llamar la función--");
    }static void eco(int a){
        for(int i = 0; i < a; i++){
            System.out.println("Eco..");
        }
    }
}
