import java.util.Scanner;
// Tendremos que introducir datos, para ello debemos importar está librería.
public class Actividad14 {
    static int calculadoraSedundos (int d, int h, int min) {
        //Se crea la función.
        int SUMA; // Se inicialzará en 0.
        int segD = d * 86400; //Conversión de días a segundos. (24(H de un dia)*60(min de 1 hora)*60(s de un min)
        int segH = h * 3600;// Conversión de horas a segundos.
        int segMin = min * 60; // Conversión de minutos a segundos.
        SUMA = segD + segH + segMin; // Total de segundos en datos introducidos.
        return (SUMA);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Pediremos números enteros porque el tiempo no se da en decimales.
        System.out.println("Introduce los días: ");
        int d = sc.nextInt();
        System.out.println("Introduce las horas: ");
        int h = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int min = sc.nextInt();
        System.out.println("El número de segundos es: " + calculadoraSedundos(d,h,min) + " s.");
        //Se añade la función calculada en el resultado que se mostrará en pantalla.
    }
}
