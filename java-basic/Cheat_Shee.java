/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheatsheet;

import javax.swing.JOptionPane;
/**
 *
 * @author Neo
 */
public class Cheat_Shee {
    public static void main(String[] args){
        OptionPanes op = new OptionPanes();
        //op.inputDialog();
        op.strings();
        System.gc();                        // garbage collection
        System.exit(0);                     // removing created objects and exit the program
    }
}

class OptionPanes{
    void inputDialog(){
        String first_name = JOptionPane.showInputDialog("First Name", "Enter your first name"); // title, placeholder,
        String sur_name   = JOptionPane.showInputDialog("Family Name");
        String full_name  = first_name +" "+ sur_name;
        JOptionPane.showMessageDialog(null, full_name);                 // null > not associated with anything else, msg
        // args(Associated with, message, title, type)
        JOptionPane.showMessageDialog(null,"Hey you are "+full_name, "Information", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hey you are "+full_name, "Error", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hey you are "+full_name, "Plain", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hey you are "+full_name, "Question", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hey you are "+full_name, "Warning", JOptionPane.WARNING_MESSAGE);
        
        String r;
        r = JOptionPane.showInputDialog("Radius ");
        Double area = Math.PI*Math.pow(Double.parseDouble(r),2);        // converting string to double
        JOptionPane.showMessageDialog(null, "Area is "+area, "Area", JOptionPane.INFORMATION_MESSAGE);
        
        if(r.equals("0")){          // compare with string value
            System.out.println("Zero Equals here");
        }
        
    }

    void strings(){
        String word1, word2;
        word1 = "Ape";
        word2 = "App";
        String temp = "String variable";
        System.out.println(temp);
        String result;
        
        // Change case
        result = temp.toUpperCase();
        result = temp.toLowerCase();
        
        // compareTo
        int res = word1.compareTo(word2);   //-11 word1 is less than word2        
        int rez = word1.compareToIgnoreCase(word2);
        System.out.println(result+"\t "+res+"\t "+rez);
        
        char amp = '@';                     // or String varible like ".com"
        String dotcom = ".com";
        String mail = "sample@tes.com";
        
        // indexOf
        int anz        = mail.indexOf(amp);        // absence of charcter returns -1
        System.out.println("Ampersand is at position "+anz);
        int atpos      = mail.indexOf(amp);
        int rezult     = mail.indexOf(dotcom, atpos);   //Args(string to index, starting position) / starts searching from given position in the arg. returns the original index.
        System.out.println("dotcom is at position "+rezult);
        boolean ends   = mail.endsWith(dotcom);
        boolean starts = mail.startsWith(dotcom);
        
        //Substring
        String name     = "Bill Gates";
        String filtered = "";
               filtered = name.substring(0,2);     // args(start_position, items to grab)
               filtered = name.substring(2);        // args(start point for print continuously)
        String spam     = name.substring(1,name.length()-1);
        
        // equals
        boolean boolbool = name.equals("Bill Gates");
        int boo = 123;
        Integer bae = new Integer(boo);             // comparing int objects
        boolbool = bae.equals(boo);
        
        // charAt
        char aChar = name.charAt(5);
        
        // replace
        String whtever = name.replace("Bill", "Hell");      // args(find,replace with)
        whtever = name.replace('i','u');
        // Trim whitespaces at the begining and the end
        String luck = "  quick brown fox ";
        whtever = luck.trim();
        
        // formatted text
        System.out.printf("%-15s %15s %n", "String1", "String2");
        /*
            "%n"    - new line
        String formatting ----------------
            "%s"    - format a string with as many chatavters as are needed
            "%15s"  - format a string with specified number of characters, and right justified
            "%-15s" - format a string with specified number of characters, and left justified
        Integer formatting ---------------
            "%d"    - format a string with as many numbers as needed
            "%4d"   - format a string with specified number of Integers. will pad with spaces to the left if not enought integers
            "%04d"  - format a string with specified number of Integers. will pad with zeros to the left if not enought integers
        Floating Point Numbers formatting-
            "%f"    - format a string with as many numbers as are needed. will always give 6 decimal places
            "%.2f"  - format a string with as many numbers as are needed. gives 2 decimal places
            "%10.2f"- format to 2 decimal places, but whole string occupies 10 characters. If there is not enough numbers then spaces are used to the left of the numbers
        */   
    }
}
class Errors{
    void whatever(){
        try{
            int d = 12/0;
        }
        catch(Exception er){
            System.out.print("er.getMessage()");
        }
    }
    
    /*
    * ======== Stack Trace ===========================
    * at (in blue) package_name.class_name.method_name("")
    * 
    * ======== Logical Errors ========================
    * set break point 
    * debug < debug file
    * debug < new watch ..>set the variable to watch
    * F7 to step into
    */
}