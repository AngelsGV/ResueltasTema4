//Área o Volumen
import java.util.Scanner;
public class Resuelta4_3 {
    static void AreaVolumen (double R, double altura, int opcion){
        double volumen, area;
        switch (opcion){
            case 1 -> {
                volumen = Math.PI*Math.pow(R,2)*altura;
                System.out.println("El Volumen es de: " + volumen + " cm^3");
            }
            case 2 ->{
                area = (2*Math.PI)*R*(altura+R);
                System.out.println("La Área es de : " + area + " cm^2");
            }
            default -> System.out.println("Indicador del cálculo erróneo.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio en cm:");
        double R = sc.nextDouble();
        System.out.println("Introduzca la altura en cm:");
        double altura = sc.nextDouble();
        System.out.println("¿Qué desea calcular 1.Volumen/2.Área?:");
        int eleccion =sc.nextInt();
        AreaVolumen(R,altura,eleccion);
    }
}
