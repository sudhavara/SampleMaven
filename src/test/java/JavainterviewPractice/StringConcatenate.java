package JavainterviewPractice;

public class StringConcatenate {

    public static void main(String[] args){
        String str1 = "sidha";
        String str2 ="Rani";
        String str3 = "Varanasi";
        String finaldata = str1+str2+str3;
        System.out.println("finldata is "+finaldata);
        String strFinaldata = str1.concat(str2).concat(str3);

        System.out.println("strFinaldata is "+strFinaldata);

    }
}
