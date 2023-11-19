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
    }
    static int numerosAmigos(int num1,int num2){
    return(numerosAmigos(num1,num2));
    }
}
