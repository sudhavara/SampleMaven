package JavainterviewPractice;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Emter one number : ");
        int a =scan.nextInt();
        System.out.println("Number is : " + a);


        if(a%2 ==0){
            System.out.println("number"+a+" is even");
        }else{
            System.out.println("Entered number" +a +" is Odd");
        }

    }
}
