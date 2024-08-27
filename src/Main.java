import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Brayan David Cuitiva Umbarila
        //Código de suma y resta
        //22-08-2024
        Scanner sc = new Scanner (System.in);
        int sum = 0, num = 0, res = 0, op = 0;
        System.out.println("Que operacion desea hacer: ");
        System.out.println("1. Suma\n2. Resta");
        op = sc.nextInt();
        switch(op){
            case 1:
                System.out.println("SUMA");
                System.out.println("Ingrese el primer numero:");
                num = sc.nextInt();
                sum = sum + num;
                System.out.println("Ingrese el segundo numero:");
                num = sc.nextInt();
                sum = sum + num;
                System.out.println("El valor total de la suma es: " + sum);
                break;
            case 2:
                System.out.println("RESTA");
                System.out.println("Ingrese el primer numero:");
                num = sc.nextInt();
                res = num - res;
                System.out.println("Ingrese el segundo numero:");
                num = sc.nextInt();
                res = res - num;
                System.out.println("El valor total de la resta es: " + res);
                break;
        }
    }
}