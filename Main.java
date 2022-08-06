package AndOrExaple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String k_adi,paralo;
        System.out.println("Kulanici adi giriniz: ");
        k_adi=scan.nextLine();
        System.out.println("parlo adi giriniz: ");
        paralo=scan.nextLine();

        if(k_adi.equals("java")&& (paralo.equals("123"))){
            System.out.println("basarili girdiniz ");
            
        } else{
            System.out.println("kullanici adi veyua parloniz yalns");
            
        }


    }

}
