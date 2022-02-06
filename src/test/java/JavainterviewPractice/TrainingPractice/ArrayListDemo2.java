package JavainterviewPractice.TrainingPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("Sudha");
        al.add("rani");
        al.add("Venkat");
        al.add("Srivatsa");
        al.add("Pilaka");
        al.add("Shashank");
        ArrayList dummy = new ArrayList();
        dummy.addAll(al);
        System.out.println("dummy list is "+dummy);

        //sorting
        Collections.sort(al);
        System.out.println("collections sorted list is "+ al);

        Collections.sort(al,Collections.reverseOrder());

        System.out.println("collections reverse sorted list is "+ al);

        Collections.shuffle(al);
        System.out.println("after shuffled arryalist is "+al);



    }
}
