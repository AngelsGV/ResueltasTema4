//Función que calcule a^n. a entera/ n positiva.
import java.util.*;
public class Resuelta4_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Introduzca base (real): ");
        double a = sc.nextDouble();
        System.out.println("Introduzca el exponente: ");
        int exp = sc.nextInt();
        System.out.println("El resultado es: " + aElevadoN(a,exp));
    }
    static double aElevadoN(double a, int n){
        double res;
        if (n==0){
            res = 1;
        } else {
            res = a * aElevadoN(a,n-1);
        }
        return (res);
    }
}
