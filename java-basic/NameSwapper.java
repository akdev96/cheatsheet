// todo, instance of in if and else if rather than equals
package cheatsheet;

import java.util.Scanner;

public class NameSwapper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name to swap : ");
        String name = input.nextLine();
        String[] vou = {"A","E","I","O","U","a","e","i","o","u"};
        String fname, lname, sfname, slname;
        int spacePos = name.indexOf(" ");
        fname  = name.substring(0,spacePos);
        lname  = name.substring(spacePos+1);
        
        if(fname.substring(0,1).equals(vou)){
            sfname = lname.substring(0,2) + fname.substring(1);
            slname = fname.substring(0,1) + lname.substring(2);
        }
        else if(lname.substring(0,1).equals(vou)){
            sfname = lname.substring(0,1) + fname.substring(2);
            slname = fname.substring(0,2) + lname.substring(1);
        }
        else{
            sfname = lname.substring(0,2) + fname.substring(2);
            slname = fname.substring(0,2) + lname.substring(2);
        }
        System.out.println(sfname +" " +slname);
    } 
}