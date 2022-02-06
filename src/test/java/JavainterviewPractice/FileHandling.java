package JavainterviewPractice;

import com.comcast.pantry.FileUtil;

import java.io.File;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Shashank\\Vocab1.pdf");
        File tgt = new File("D:\\indiaTaxFiling\\Vocab1Tmp.pdf");
        FileUtil.copy(file,tgt);
    }
}
