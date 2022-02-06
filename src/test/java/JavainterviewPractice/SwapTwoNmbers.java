package JavainterviewPractice;

public class SwapTwoNmbers {

    public static void main(String[] args) {
        int a =5;
        int b=10;
        /*
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a value after swap " +a +" b value us " + b);*/
        a = a-b;
        b=a+b;
        a=b-a;


        System.out.println("swap after value is a "+ a);

        System.out.println("swap after value is b "+ b);


    }
}
