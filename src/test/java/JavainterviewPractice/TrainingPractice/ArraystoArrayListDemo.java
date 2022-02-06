package JavainterviewPractice.TrainingPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraystoArrayListDemo {

    public static void main(String[] args){

        String[] arr = new String[5];

        arr[0]="Sudha";
        arr[1]="dog";
        arr[2]="cat";
        arr[3]="horse";
        arr[4]="pig";
        ArrayList al = new ArrayList();
        for(String value:arr){
            System.out.println("array data is "+value);
            al.add(value);
            System.out.println("Array list data is "+al);
        }
        ArrayList al1 = new ArrayList(Arrays.asList(arr));
        System.out.println("Array list1 data is "+al1);







    }
}
