package Day3.BufferReader;

import java.io.*;  

public class FileReaderDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("data.txt"); 
        BufferedReader br = new BufferedReader(fr);
        
        String content ;
        while((content = br.readLine())!=null) {
            System.out.println(content);
        }
        br.close(); 
        fr.close();
    }
}
