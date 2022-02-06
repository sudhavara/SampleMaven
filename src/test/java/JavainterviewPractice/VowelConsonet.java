package JavainterviewPractice;

import java.util.Scanner;

public class VowelConsonet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a char : ");
        String s = scan.next();
        if(s.equalsIgnoreCase("a")|s.equalsIgnoreCase("e")|s.equalsIgnoreCase("i")|s.equalsIgnoreCase("o")|s.equalsIgnoreCase("u")){
            System.out.println("given string " +s+" is a vowel");

        }else{
            System.out.println("given string "+s+" is a consonent");
        }

        char ch = 'd' ;
        if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u'){
            System.out.println("char is vowel");

        }

        switch(ch) {
            case  'a' :
            case  'e' :
            case  'i' :
            case  'o':
            case  'u':
                System.out.println("is vowel");

            break;
            default:
                System.out.println("consoent ");
                break;
        }


    }


}
