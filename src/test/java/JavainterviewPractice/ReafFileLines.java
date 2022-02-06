package JavainterviewPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReafFileLines {

    public  static void  main(String[] args) throws IOException {

        BufferedReader br;

         br= new BufferedReader(new FileReader("D:\\indiaTaxFiling\\Vocab1Tmp.pdf"));


        String line = br.readLine();
        while(line!=null){
            System.out.println(line);
            line = br.readLine();

        }

        br.close();

    }
}
