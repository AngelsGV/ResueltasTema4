//Pedir num positivo  y que una función diga cuantas cifras tiene dicho num.
import java.util.Scanner; // Importamos libreria porque necesitamos introducir un valor.
public class CuentaCifras {
    public static void main(String[] args){ //Principal
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número entero positivo: ");
    int num =sc.nextInt();

if (num<0){ // Si no se introduce el núm positivo no se hace la función del programa.
    System.out.println("No has introducido un número positivo.");

}else{

    do{
       int cantidad = cuentaCifras(num);
        System.out.println("El número " + num + " tiene " + cantidad + " cifras.");
        break;//La unica forma de salir del bucle infinito que se producía.
    } while (num>0);
    //Cuando sea positivo se producira la lectura de la función que cuanta las cifras del num.
}
    }

static int cuentaCifras(int a){
        int cifras = 0;

        if (a<10) {

            cifras = 1; // El número 0 tiene una cifra.

        } else {

            while (a != 0) {
                a = a/ 10;
                cifras++;
            }
}return(cifras);

// PROBLEMAS SOLUCIONADOS: Cuando el num solo tiene 1 cifra no cierra el bucle. No cierra bucle



//VERSIÓN ANTERIOR A LA DEFINITIVA:


//static void cuentaCifras(int n){
       // while (n > 0) { //Para abrir el bucle debe ser positivo.
           // int digito = n % 10;
            // Se utiliza para obtener el dígito más a la derecha de un número entero.
            //System.out.println(digito);
            //n /= 10;
            //para eliminar el dígito más a la derecha de un número
            //y preparar el número para el próximo ciclo del bucle.
       // } Lo he intentado con static int i no sabia como hacerlo
    }
}


