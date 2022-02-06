package JavainterviewPractice;

public class SumofNaturalNumbers {

    public static void main(String[] args) {
        int i=0;
        int sum =0;
        int total =0;

        for ( i=1;i<=100;i++){
            sum =sum+i;

        }
        System.out.println("total sum is "+sum);

        int k =1;
        while(k<=100){
            total =total+k;
            k++;

        }
        System.out.println("total value is "+total);

    }
}
