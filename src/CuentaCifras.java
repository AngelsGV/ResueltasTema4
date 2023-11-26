//Pedir num positivo  y que una función diga cuantas cifras tiene dicho num.
import java.util.Scanner; // Importamos libreria porque necesitamos introducir un valor.
public class CuentaCifras {
    public static void main(String[] args){ //Principal
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número entero positivo: ");
    int num = 0;
    do{
        cuentaCifras(num);
    }while (num % 2 == 0); //Cuando sea positivo se producira la lectura de la función que cuanta las cifras del num.
} static void cuentaCifras(int n){
        while (n > 0) { //Para abrir el bucle debe ser positivo.
            int digito = n % 10;
            // Se utiliza para obtener el dígito más a la derecha de un número entero.
            System.out.println(digito);
            n /= 10;
            //para eliminar el dígito más a la derecha de un número
            //y preparar el número para el próximo ciclo del bucle.
        }
    }

}
