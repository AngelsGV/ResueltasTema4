import java.util.Scanner;
public class Actividad17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("Escribe un número: ");
            num1 = sc.nextInt();
            System.out.println("Escribe otro número: ");
            num2 = sc.nextInt();
            if (num1 <= 0 || num2 <= 0){
                System.out.println("Error. Los números tienen que ser positivos.");
            }
        }while(num1 <= 0 || num2 <= 0);

    }
}
