package JavainterviewPractice;

public class StarTrainglePattern {

    public static void main(String[] args){



        for(int i=0;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("_____________________");

        for(int i=0;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("_____________________");

        for(int i=0;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=4;i++){
            for(int j=4;j>i;j--){
                System.out.print("*");

            }
            System.out.println();
        }



    }
}
