
import java.util.Scanner; //Kullanıcıdan veri almak istediğimizde muhakkak olmalı.

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a,b;

        System.out.print("a sayisini giriniz: ");
        a=input.nextInt();

        System.out.print("b sayisini giriniz: ");
        b=input.nextInt();

        System.out.println("a sayisi:" +a);
        System.out.println("b sayisi:" +b);

    }
}