package JavainterviewPractice;

public class StringReverse {

    public static void main(String[] args){
        String str1 = "SUDHA";
        char ch ;
        String reverse ="";
        String[] back=null;
        for(int i=str1.length()-1;i>=0;i--){
            ch = str1.charAt(i);
            System.out.println("char is "+ch);
            
            reverse = reverse+ch;

            
        }


        System.out.println("Reverse string is "+reverse);

        StringBuffer sb = new StringBuffer(str1);

        System.out.println(sb.reverse());
    }
}
