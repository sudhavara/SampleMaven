package JavainterviewPractice.TrainingPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args){
        //declare ayyalist

        ArrayList al = new ArrayList();
        ArrayList<String> stringal = new ArrayList<String>();
        ArrayList<Integer> intal = new ArrayList<Integer>();
        List list = new ArrayList();
        al.add("Sudha");
        al.add("102");
        al.add("0.5");
        al.add(true);

        System.out.println("array list data is "+al);
        System.out.println("array list data size is "+al.size());
        al.remove("Sudha");
        System.out.println("remove sudha from  list data is "+al);
        al.add(2,"Sudha Rani");
        System.out.println("Add sudha Rani from  list data is "+al);
        System.out.println(al.get(3));
        al.set(0,"1987");
        System.out.println("After adding 1987 list is "+ al );

        for(int i=0;i<al.size();i++){
            System.out.println("data is "+al.get(i));


        }

        for(Object o:al){
            System.out.println("Object data is "+o);

        }

        //jusing iterator

        Iterator it =al.iterator();
        while(it.hasNext()){
            System.out.println("next data is "+it.next());
        }

    }
}
