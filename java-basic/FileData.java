package cheatsheet;

import java.io.IOException;

public class FileData {
    public static void main(String[] args) throws IOException{
        String file_name = "E:/test.txt";
        try{
           ReadFile file = new ReadFile(file_name);
           String[] aryLines = file.OpenFile();
           
           int i;
           for(i=0; i<aryLines.length; i++){
               System.out.println(aryLines[i]);
           }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        //=========================
        //  WRITE TO FILE
        //=========================
        try{
            WriteFile data = new WriteFile(file_name, true);
            data.writeToFile("whatevet < this writes to a file \n also this line");
            System.out.println("this is a sop ");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
