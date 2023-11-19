import java.util.Scanner; // Se piden datos a usuario.
public class Actividad17 {
    public static void main(String[] args){
        // Principal. Primero pido números y esclarezco que hacer con la función.
        Scanner sc = new Scanner(System.in);
        int num1, num2; // Vamos a trabajar con números enteros para sacar los divisores.


        do {
            System.out.println("Escribe un número: ");
            num1 = sc.nextInt();
            if (num1 <= 0 ){ //Si el num1 es menor o igual a 0 da mensaje de error y volvera a pedirlo.
                System.out.println("Error. Los números tienen que ser positivos.");
            }
        }while(num1 <= 0);
        //Bucle 1 para pedir número y que sea positivo. Para no tener que volver a pedir los dos.


        do{
            System.out.println("Escribe otro número: ");
            num2 = sc.nextInt();
            if (num2 <= 0){//Si el num2 es menor o igual a 0 da mensaje de error y volvera a pedirlo.
                System.out.println("Error. Los números tienen que ser positivos.");
            }
        }while(  num2 <= 0);
        //Bucle 2 para pedir número y que sea positivo. Para no tener que volver a pedir los dos.


        if (numerosAmigos(num1,num2)){
            System.out.println("Los números " + num1 + " y " + num2 + " son amigos.");
        }else{
            System.out.println("Los números no son amigos.");
        }
    }


    public static boolean numerosAmigos(int num1, int num2) {
        //Boolean porque el ejercicio nos pide una respuesta no númerica.
        int suma1 = 0; //Empezamos los sumatorios por 0.
        int suma2 = 0;
        boolean respuesta = false;
        // Damos este valor inicial para que luego podamos poner que
        // si se cumplen las condiciones, la respuesta será verdadera.


        for (int i = 1; i < num1; i++) {
            // Empezamos con i en 1, acaba cuando i llega a num1.
            // El mismo número no lo vamos a contar como divisor como nos dice en el enunciado.

            if (num1 % i == 0) {
                // Comprueba si i es divisor de num1. Si el resto es igual a 0, es divisor.
                suma1 += i; // Suma los divisores posibles sin contar el mismo número.
            }

        }
        for (int i = 1; i < num2; i++) { // Empezamos con i en 1, acaba cuando i llega a num2.
            // El mismo número no lo vamos a contar como divisor como nos dice en el enunciado.
            if (num2 % i == 0) {
                // Comprueba si i es divisor de num1. Si el resto es igual a 0, es divisor.
                suma2 += i; // Suma los divisores posibles sin contar el mismo número.
            }
        }

        if (suma2 == num1 && suma1 == num2) {
            respuesta = true;
            //Si la suma de divisores de a es igual al número introducido b,
            //y la suma de divisores de b es igual al número en a, los números serán amigos.
        }
        System.out.println("La suma de divisores de a es: " + suma1);
        System.out.println("La suma de divisores de b es: " + suma2);
        return (respuesta);
        //Les pongo en la respuesta a pantalla a y b porque he leido después en el enunciado que así las nombraba el ejercicio.
    }
}