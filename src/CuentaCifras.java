//Pedir num positivo  y que una función diga cuantas cifras tiene dicho num.
import java.util.Scanner; // Importamos libreria porque necesitamos introducir un valor.
public class CuentaCifras {
    public static void main(String[] args){ //Principal
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número entero positivo: ");
    int num =sc.nextInt();

    do{
       int cantidad = cuentaCifras(num) - 1;
        System.out.println("El número " + num + " tiene " + cantidad + " cifras.");
    } while (num>0); //Cuando sea positivo se producira la lectura de la función que cuanta las cifras del num.
}

static int cuentaCifras(int a){
        int cifras = 1;

        if (a == 0 && a<10) {

            cifras = 1; // El número 0 tiene una cifra, pero no lo contamos como positivo

        } else {

            while (a != 0) {
                a = a/ 10;
                cifras++;
            }
}return(cifras);


        // Cuando el num solo tiene 1 cifra no cierra el bucle. No cierra bucle






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


