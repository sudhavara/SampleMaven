package JavainterviewPractice;

public class PrimeNumber {

    public static void main(String[] args){
        int num =11;
        boolean bprime = false;
        for(int i=2;i<=num/2;i++){
            if(num%2==0){
                                bprime = false;
                break;
            }else{

                bprime = true;
            }

        }

        if(bprime){
            System.out.println(" a prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
}
