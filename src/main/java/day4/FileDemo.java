package day4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        Date d1 = new Date();
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyy");
        String todayDateStr = fmt.format(d1);
        File fl  = new File("/Users/vaibhavsingh/Desktop/teche-apps/merv/ey-automation-testing/files/"+todayDateStr+"/demo1.txt");
       // fl.mkdir();
       // fl.createNewFile();

        FileWriter fw = new FileWriter(fl, true);
        fw.write("Hello this demo text1\n");
        fw.write("Hello this demo text2\n");
        fw.write("Hello this demo text3\n");
        fw.close();



    }
}
