package AndOrExaple;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        int temp;
        System.out.println("tempuratre ?");
        Scanner input=new Scanner(System.in);
        temp=input.nextInt();

        if(temp>30 && temp<50){
            System.out.println("Go swim");
        } else if (temp>0 && temp<30) {
            System.out.println("go walk pls");
        } else if (temp<0) {
            System.out.println("go sky");
        }else {
            System.out.println("bu sarkilar da olmazsa");
        }
    }
}
