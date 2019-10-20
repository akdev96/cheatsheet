/*
 * Programe Log Writer v1.0
 */
package cheatsheet;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author lucifer
 */
public class LogWriter {
    
    private String path;
    private boolean append_to_file = true;
    
    public LogWriter(String file_path){
        path = file_path;
    }
    
    public LogWriter(String file_path, boolean append_value){
        path = file_path;
        append_to_file = append_value;
    }
    
    public void writeToFile(String txtLine) throws IOException{
        
        try{
            String file_name = "E:/test.log";
            //WriteFile data = new WriteFile(file_name, true);
            this.writeToFile("whatevet this writes to a file \n also this line");
            //System.out.println("this is a sop ");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        
        FileWriter write = new FileWriter(path, append_to_file);
        PrintWriter print_line = new PrintWriter(write);
        
        print_line.printf("%s" + "%n", txtLine);
        
        print_line.close();
    }
}
