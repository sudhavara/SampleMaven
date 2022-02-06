package JavainterviewPractice;

public class StringsplitClass {

    public static void main(String[] args){
        String str = "java,testng,maven,jenkin,gradle";
        System.out.println("split data is "+str.split(",").length);
        String strinfdata[] =null;
        strinfdata = str.split(",");
        for(int i=0;i<strinfdata.length;i++){
            System.out.println("data is "+strinfdata[i]);
        }

    }
}
