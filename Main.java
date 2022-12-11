import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int boyut, eleman;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dizinizin boyutunu giriniz : ");
        boyut = input.nextInt();
        int[] list = new int[boyut];
        System.out.println("Lütfen dizinizin elemanlarını giriniz : ");
        for (int i = 0; i < boyut ; i++){
            System.out.print(i + " . Eleman : ");
            list[i]=input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Küçükten büyüğe: "+ Arrays.toString(list));

    }
}