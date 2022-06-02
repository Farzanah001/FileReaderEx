import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWriterEx {


    public static void main(String[] args) {
        try {
            //File file = new File();
            BufferedWriter bw = new BufferedWriter
                    (new FileWriter("C:\\Users\\i5\\IdeaProjects\\FileReaderEx\\src\\txtwriter.txt"));
            bw.write("Treat People With Kindness!");
            bw.close();
        }catch (Exception e){
            System.out.println("File Error!");
        }

    }
}
