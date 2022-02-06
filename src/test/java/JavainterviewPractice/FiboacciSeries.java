package JavainterviewPractice;

public class FiboacciSeries {
    public static void main(String[] args) {

        int f1=0;
        int f2 =1;
        int f3 =0;

        for(int i =0;i<=10;i++){
            System.out.println(f1);
            f3 = f1+f2;

            f1=f2;
            f2=f3;
            System.out.println("Series is "+ f1 +" " + f2+ " "+f3);
        }



    }
}
