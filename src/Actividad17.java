import java.util.Scanner;
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
        int suma = 1;  // Inicializamos con 1 ya que 1 es divisor propio de todos los números
        boolean respuesta = false;
        for (int i = 1; i < num1; i++) { // Empezamos con i en 1, acaba cuando i llega a num1.
            if (num1 % i == 0) {
                // Comprueba si i es divisor de num1. Si el resto es igual a 0, es divisor.
                suma += i; // Se suma 1
            }
        }
        if (suma == num2){
            //Si la suma de los divisores es igual al num2, son números amigos.
            respuesta = true;
        }
        for (int i = 1; i < num2; i++) { // Empezamos con i en 1, acaba cuando i llega a num2.
            if (num2 % i == 0) {
                // Comprueba si i es divisor de num1. Si el resto es igual a 0, es divisor.
                suma += i; // Se suma 1
            }
        }
        if (suma == num1){
            //Si la suma de los divisores es igual al num1, son números amigos.
            respuesta = true;
        }

        return (respuesta);
    }
}