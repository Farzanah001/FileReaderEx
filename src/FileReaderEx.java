import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderEx {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader
                    (new FileReader("C:\\Users\\i5\\IdeaProjects\\FileReaderEx\\src\\txtexcerpt.txt"));
            String readFile;
            int charCount = 0, wordCount = 0, lineCount = 0, paraCount = 1;
            while ((readFile = br.readLine()) != null) {
                System.out.println(readFile);//readFile=current line

                if (readFile.equals("")) {     //if the current line is blank
                    paraCount++;                //paragraph found
                } else {
                    lineCount++; //line count
                    String[] words = readFile.split(" "); //no of words in current line
                    wordCount = wordCount + words.length; //adding word count
                    for (String wc : words) { //iterating the words to calculate character count
                        charCount = charCount + words.length;  //calculating character count
                    }
                    readFile = br.readLine();  //assigning the next line as current line
                }
            }
//            while ((readFile = br.readLine()) != null) {
//
//            }


//            String currentLine=br.readLine();
//            while(currentLine!=null){
//
//            }
            System.out.println();
            System.out.println("Number of Characters: "+charCount);
            System.out.println("Number of Words: "+wordCount);
            System.out.println("Number of Lines: "+lineCount);
            System.out.println("Number of Paragraphs: "+paraCount);
            br.close();
        }catch (Exception e){
            System.out.println("File Error!");
        }
    }
}