import java.util.Scanner;
public class Resuelta4_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular fibonacci (n)");
        System.out.print("Introduzca n: ");
        int num = sc.nextInt();
        int resultado = fibo(num);
        System.out.println("\nfibonacci(" + num + ") = "+ resultado);
    }
    static int fibo(int num){
        int res;
        if (num==0||num==1){
            res=1;
        }else{
            res = fibo(num-1) + fibo(num-2);
        }
        return (res);
    }
}
