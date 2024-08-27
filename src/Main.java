import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Brayan David Cuitiva Umbarila
        //Código de suma y resta
        //Elkin Yamith Almonacid
        //Programa que permite escoger entre multiplicacion y division, pide dos numeros y realiza la operación.
        //Brayan Yair Mendez Rodriguez
        //El codigo realiza la potenciación y le pide al usuario tanto la base como el exponente
        //22-08-2024
        Scanner sc = new Scanner (System.in);
        int sum = 0, num = 0, res = 0, op = 0;
        int x, num1, num2, mult=0, div=0;
        int total=0;
        System.out.println("Que operacion desea hacer: ");
        System.out.println("1. Suma\n2. Resta\n3.Multiplicacion\n4.Division\n5.Potenciacion");
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
                System.out.println("El valor TOTAL de la resta es: " + res);
                break;
            case 3:
                System.out.println("Ingrese el primer numero:");
                num1=sc.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2=sc.nextInt();
                mult=num1*num2;
                System.out.println("El resultado es: "+mult);
                break;
            case 4:
                System.out.println("Ingrese el numero a dividir;");
                num1=sc.nextInt();
                System.out.println("Ingrese el numero que divide:");
                num2=sc.nextInt();
                div=num1/num2;
                System.out.println("El resultado es: "+div);
                break;
            case 5:
                System.out.println("Ingrese el número base");
                int base = sc.nextInt();
                System.out.println("Ingrese el exponente");
                int exponente = sc.nextInt();
                total=base;
                for (int i=2; i<=exponente; i++) {
                    total= total*base;
                }
                System.out.println("Su operación es: " +base+"^"+exponente );
                System.out.println("RESULTADO: " +total);
                break;
        }
    }
}