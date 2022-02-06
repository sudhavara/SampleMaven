package JavainterviewPractice;

public class Palindrome {

    public static void main(String[] args){

        int num =1331;
        int rev =0;
        int actualnum = num;
        while(num>0){
            int reminder = num%10;
            rev = rev*10+reminder;
            num = num/10;

        }

        System.out.println("reverse number is "+rev);
        if(rev==actualnum){
            System.out.println("palindrome");

        }else{
            System.out.println("not palindroome");
        }

    }
}
