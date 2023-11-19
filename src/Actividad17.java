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
    public static boolean numerosAmigos(int num1, int num2, int suma) {
        suma = 1;  // Inicializamos con 1 ya que 1 es divisor propio de todos los números
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) { // Comprueba si i es divisor de num1.
                suma += i;
                if (i != num1 / i) {
                    suma += num1 / i;
                }
            }
        }
        for (int i = 1; i < num1; i++) {
            if (num2 % i == 0) { // Comprueba si i es divisor de num1.
                suma += i;
                if (i != num2 / i) {
                    suma += num2 / i;
                }
            }
        }

        return (suma);
    }
}