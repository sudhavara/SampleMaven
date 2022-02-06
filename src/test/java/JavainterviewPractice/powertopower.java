package JavainterviewPractice;

public class powertopower {

    public static void main(String[] args){
        int base = 5;
        int exp =3;
        int result =1;

        for( int i=1;i<=exp;i++){
            result = result*base;

        }
        System.out.println("result is "+result);


    }
}
