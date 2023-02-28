import java.util.Scanner;

public class exponentiation {
    public static int exponentiation(int base,int power){
        if(power==0){
            return 1;
        } else if (base==1) {
            return 1;
        }
        else
        {
            return base*exponentiation(base,power-1);
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println();
            Scanner scan = new Scanner(System.in);
            System.out.print("Tabanı Giriniz: ");
            int base = scan.nextInt();
            System.out.print("Üssü Giriniz: ");
            int power = scan.nextInt();
            System.out.println(base + " üzeri " + power + " işleminin sonucu : " + exponentiation(base, power));
        }
    }
}
