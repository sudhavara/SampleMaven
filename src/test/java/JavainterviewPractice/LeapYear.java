package JavainterviewPractice;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        boolean bleapflag = false;
        if (year % 4 == 0) {
            if(year%100==0) {

                if ((year % 400) == 0) {
                    bleapflag = true;

                }
                bleapflag = false;
            }
            bleapflag = true;
        }else{
            bleapflag = false;
        }

        if(bleapflag == true){
            System.out.println("year "+ year + " is a leap year");
        }else{
            System.out.println("year "+ year + " is not a leap year");
        }
    }
}
