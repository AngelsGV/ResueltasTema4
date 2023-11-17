import java.util.Scanner;
// Tendremos que introducir datos, para ello debemos importar está librería.
public class Actividad14 {
    static int calculadoraSedundos (int d, int h, int min) {
        //Se crea la función.

        int segD = d * 86400; //Conversión de días a segundos. (24(H de un dia)*60(min de 1 hora)*60(s de un min)
        int segH = h * 3600;// Conversión de horas a segundos.
        int segMin = min * 60; // Conversión de minutos a segundos.
        int SUMA = segD + segH + segMin; // Total de segundos en datos introducidos.
        return (SUMA);
    }
    static int Rango(int i, int rangoInicio, int rangoFin) {
        if (i < rangoInicio) {
            //Si el valor intoducido es menor que 0:
            return rangoInicio;
        } else if (i > rangoFin) {
            //Si el valor introducido es mayor que el límite:
            return rangoFin;
        } else { //Si cumple el rango, se usa el valor.
            return i;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Pediremos números enteros porque el tiempo no se da en decimales.
        System.out.println("Introduce los días: ");
        int d = Rango(sc.nextInt(),0,364);
        System.out.println("Introduce las horas: ");
        int h = Rango(sc.nextInt(),0,23);
        System.out.println("Introduce los minutos:");
        int min = Rango(sc.nextInt(),0,59);
        System.out.println("El número de segundos es: " + calculadoraSedundos(d,h,min) + " s.");
        //Se añade la función calculada en el resultado que se mostrará en pantalla.
    }
}
