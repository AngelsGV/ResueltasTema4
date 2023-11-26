//Función --> reciba un número y muestre tabla de multiplicar, los números impares.

import java.util.Scanner; // Se ha de introducir el parámetro del cual será la tabla.

public class TablaDeMultiplicar {

    public static void main(String[] args) {
        //Función principal donde se llamara a la función que nos interesa crar en este ejercicio.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 10: ");
        int n = sc.nextInt();
        impares(n); // Función impares
    }

    static void impares(int j) {
        // La n introducida en la otra función ahora se lee como j.
        // Queremos iniciar en 1, ir de 2 en dos para mostrar los impares y acabar en 10.

        for (int i=1; i<=9; i+=2) { // Iniciamos en 1, acabamos en 2 y vamos de 2 en 2 para solo obtener los impares.
            int impar = j * i;
            System.out.println(j + " x " + i + " = " + impar);


           // for (int i=1; i<=10; i++) { // Iniciamos en 1, acabamos en 10 y vamos de 1 en 1 hasta 10.
               // int impar = j * i; //Multiplicamos el número introducido en consola por el rango de 1 a 10.
               // if (impar % 2 != 0) {
                    // Mostraremos el resultado en consola solo si el resto de la multiplicación anterior NO es 0.
                    //Si no es 0, es impar! (Me ha costado pensar este bucle... )
                    // Problema de este bucle, que si el valor introducido es par, no saca valor.
                    //System.out.println(j + " x " + i + " = " + impar);
                }
        }
    }




