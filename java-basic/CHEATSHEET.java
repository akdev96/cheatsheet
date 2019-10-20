/************
     * SET THE PATH         : path = C:\Programe Files\java\jdk7.0\bin
     * WORKING DIRECTORY    : C:/JAVA
     * SOURCE CODE          : example.java
     * CLASS FILE           : class_name
     * OPEN CMD AND GOTO THE DIRECTORY : cd C:/JAVA
     * COMPILE THE SOURCE CODE         : javac example.java
     * RUN THE PROGRAM	    : java class_name
************/
package cheatsheet;         //package declaration, 'import pkg.class;' to import classes from other packages, 
                            //package must match the directory structure, import.folder1.two.pkg.*; import pkg.*; to import all classes

import java.util.Objects;
import java.util.Scanner;   //import scanner class
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Collections;
//import java.util.Iterator;      // Scanner class inherited from Iterator
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
/************
    * @author lucifer
    * 
 ************/

public class CHEATSHEET {
    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[]args) {         //starting point of a programme only one exists/ 'args' can replace with any identifier
        System.out.println("Starting CHEATSHEET");
        System.out.println("Calling Unit methods");
        System.out.println("Unit 01 Starting");
        unit01.IO();                                //calling the method 'IO' in class'unit01'
        unit01.variables();
        unit02.loops();
        unit03 u3 = new unit03();                   //create 'u3' object to access 'arrays' non static method of 'unit03' class
        u3.arrays();                                //accesss method 'arrays' via 'u3' object
        unit04.methods();
        System.gc();                                //garbage collection
        System.exit(0);                             //exit the programme
    }
    
}

class unit01{
    
    static void variables(){                        // declaring a method
        System.out.println("Variables");
        /*
        NAMING IDENTIFIERS #######
        NO KEYWORD
        NO LIMITS
        NO SPACES
        CASE-SENSITIVE
        <first_character><any_combination>
        <char,$,_ valid - numbers are invalid><any_combination>
        
        
        NAMING METHODS/CLASSES/PACKAGES ########
        * package sample;
        * class FirstSecond{}
        * methodName(){}
        
        JAVA KEYWORDS 50 ################################################
        abstract        boolean     break       byte        case
        catch           char        class       const       continue
        default         do          double      else        extends
        final           finally     float       for         goto
        if              implements  import      instanceof  int
        interface       long        native      new         package
        private         protected   public      return      short
        static          strictfp    super       switch      synchronized
        this            throw       throws      transient   try
        void            volatile    while       assert      enum
        ################################################################
        
        * VARIABLE TYPES        DEFAULT VALUE   EXAMPLE
        * static variables          0 , null    static <variable_name>;
        * Instance variable         0 , null    should access via object
        * Method local variable     no          owns to a method
        * Block variables           no          variable used in blocks such as loops
        
        PRIMITIVES###############
        INTEGERS=================
        TYPE        BITS        BYTES       RANGE
        byte        8           1           -2^7  to 2^7-1
        short       16          2           -2^15 to 2^15-1
        int         32          4           -2^31 to 2^31-1
        long        64          8           -2^63 to 2^63-1
        
        FLOATING POINTS==========
        float       32          4
        double      64          8
        
        CHARACTERS===============
        char        8           1
        
        BOOLEAN==================
        boolean     1
        
        REFERENCE VAR ##################
        String
        Arrays
        objects
        
        CREATING VARIABLE
        * <type> <identifier> = <value>;
        * -------------------------------------
        * <type> <identifier1> ,<identifier2>;
        * <identifier1> = <val1>;
        * <identifier2> = <val2>;
        */
        int     iit  = 0;
        byte    byt  = 0;       // range -  128 to 127
        short   srt  = 0;       // range -32768 to 32767
        long    lng  = 0;       // range -65526 to 65525
        float   flt  = 0.00f;   // f,F,  (float)0.00
        double  dbl  = 0.00d;   // d,D, (double)0.00
        boolean bool = true;    // true, false
        char    chr  = 'Z';     // a-Z
        String  str  = "null";  //
        String fName, lName;
        fName = "neo";
        lName = " lucifer";
        
        //INCREMENT AND DECREMENT ###################
        int x = 24;
        int y;
        //increment
        y = ++x;        //prefix    > x = y =25
        System.out.println(x +" "+ y);
        int r = 10;
        int z ;
        z = r++;        //postfix   > r = 11, z = 10
        System.out.println(r +" "+ z);
        //decrement
        y = --x;
        y = x--;
        
        /*
         * OPERATOR PROCEDUNCE ###########
         * **,*,/,%,+,-
         * 
         * IN PLACE OPERATOR #############
         * val1 += 2; 
         * val1 = val1+2; same for the /*%+-
         * 
         */
        
    }
    
    static void IO(){
        System.out.println("inputs and\t outputs \nz\bmethod");    //tab > \t, newline > \n, backspace > \b
        System.out.println("34\r5678");                 //carriage return > \r
        System.out.println("12345\f67890");             //Enter+tab or new para > \f
        //ESCAPE CHARACTERS  \"  \\ \n  \t  \b  \r  \f 
        
        System.out.print("Enter something : ");         //input field details for same line 'print'
        Scanner sc  = new Scanner(System.in);           //access the scanner via 'sc' object
        String bar = sc.nextLine();                     //reads next line and assigned value to 'bar'
        /*
        sc.next(); next word
        sc.nextLine(); reads next line
        sc.next<Int>(); <Byte,Short,Int,Long,Float,Double,Boolean> reads next variable
        */
        System.out.println("you Entered "+bar);         //print output in new line
    }
}

class unit02{
    static void loops(){
        System.out.println("Loops");
        /**
         * COMPARISON OPERATORS ==========
         * <    less than
         * >    greater than
         * !=   not equal to
         * ==   equal to
         * <=   less than or equal to
         * >=   greater than or equal to
         * 
         * LOGICAL STATEMENTS ============
         * &&   AND
         * ||   OR
         * !()  NOT
         * 
        */
        //IF STATEMENT ####################################
        int x = 0;              //if(condition){}
        if (x==0){              // if the condition is true executes the statesments in the 'if' block
            System.out.println("The condition is true");
            if(!(3==3)){
            //nested if
            }
            else{
            //blank
            }
        }
        else if(5>6||false){
            //blank
        }
        else{       //should include if there is an 'else if' block
            //blank
        }
        
        //SWITCH STATEMENT ################################
        int r = 0;
        switch(r){
            case 0:
                //statement
                break;
            case 1:
                //
                break;
            default:
                //      
        }
        int s = 0;
        while(s>6){         //
            //
            if(s==3){
                break;      //terminate the loop
            }
            if(s==2){
                continue;   //skip the current value and continue the loop
            }
            
            s++;
        }
        
        //FOR LOOP ########################################
        int cond =5;
        for(int ini =0;ini>cond;ini+=2){        //for(initialization; condition; increment/decrement){}
            //
        }
        
        //DO WHILE LOOP ###################################
        int c = 0;
        do{                                     //runs at least one time
            //
            c++;
        }
        while(!true);
        
        //ENHANCED FOR LOOP ##############################
        /* FOR EACH LOOP
        int[] primes = {2,3,5,7};
        for(int t:primes){          //for each loop
            //print t
        }
        */
        
    }
}

class unit03{
    void arrays(){
        int arry[]      = new int[3];     //or
        int[] arr       = new int[5];                         // declare an array with 5 values / zero indexed based (0,1,2,3,4)
        arr[2]          = 42;                                 // assign value via arrays index
        String[] names  = {"neo","spam","foo","bar"};          //'arrray literal' for arrays of primitive types and strings
        int lngth       = names.length;                       // arrays length
        String dome     = names[1];
        
        int[] primes    = {2,3,5,7};
        for(int t:primes){          //for each loop
            //print t
        }
        
        int [][] samp   = {{1,2,3},{4,5,6},};              // multidimentional arrays
        int d = samp[1][2];                                // samp[row_index][column_index]
    }
}

/**
 * OOPC ###################################
 * close to real world
 * each object has three dimensions;
 *      identity    >car    >identifier
 *      attributes  >red    
 *      behavior    >moves  >methods
 *
 */
class Car{
            int speed   = 0;              //attributes of class 'Car'
    private int wheels  = 4;
            String color= "red";
    private double fuel = 100d;
    
    void horn(){
        System.out.println("Beeeep");    
    }
    
    public int getWheels(){             //getter
        return wheels;                 //
    }
    
    public void setFuel(double dd){     //setter
        this.fuel= dd;                  //'this' reffers current object/ 'fuel' attribute of current object
    }
    
}

class Foo{
    private String bar = "monty";
    Foo(){
        bar = "java";
    }
    Foo(String spam){
        this.bar = spam;
    }
}

class unit04{
    public static final double PI = 3.14;   //constant can be change onece assigned, attempt to change will cause an error
                                            //also methods and classes can be marked as final, final classes cant be overridden and can't made sub classes
    static int COUNT;               //static variables & methods are belongs to class rather than specific instance
                        // can access like object.COUNT or class.COUNT
                        // static methods can be access without creating a object //class.method();
    unit04(){                       //unit04 's constructor
        COUNT++;
    }
    
    /**
     * ACCESS MODIFIRES (LEVEL OF ACCESS) ======================
     * public       accessible to any classes
     * default      accessible by classes in same package
     * protected    accessible by classes in same package/ same as default.
     * private      accessible only within declared class itself/ can accessible via 'get' & 'set' method
     * 
     * @param name
     * @param sur
     * @return 
     */
    static int classes(int name,int sur){       //taking the parameter to the variable 'name' of type String
        
        Car c1 = new Car();                     //create new 'Car' object named 'c1'
        c1.speed = 450;                         //assign value to the attribute 'speed' via object 'c1'
        c1.horn();
        c1.setFuel(234);                        //set a value
        System.out.println(c1.getWheels());     //get a value
        Foo f1 = new Foo();                     //java automatically provides default constructor/ all class have constructor if defined or not
        Foo f2 = new Foo("eggs");               //invoke the constructor and parsing value while creating an object
        return name+sur;                        //return a value
    }
    
    static void methods(){                      //code reuse, defines behaviors
    //<non_access_modifier> <return_type> [method_signature(parameter_list)]{}
        System.out.println("methods");
        
        //classes(12,13);                       //passing parameter
        int spam = classes(12,13);              //value = method(1,2) < taking returned value
        System.out.println(spam);
        
        //classes(23,42);
        int eggs = classes(23,42);
        System.out.println(eggs);
        
    }
    
    void valuesReferenceTypes(){
        /** VALUES AND REFERENCE TYPES
         * parsing value takes variable's value rather than variable itself,
         * parsing reference type affect the variable itself, just like in constructors
         */
        //MATH CLASS =====================================================================
        int a = Math.abs(-20);              //absolute value
        double b = Math.ceil(7.342);        //up to the nearest integer in double's format
        double c = Math.floor(7.342);       //down to the nearest int
        int d = Math.min(3,5);              //Math class is a static, no need to import and also the main
        int e = Math.max(3,5);
        double f = Math.pow(2,5);           //sqrt(), sin(), cos(), tan() etc
        
        
    }

}

class Encap{
    /** Encapsulation ## Data Hiding ##############################
     * Implementation data are not visible to the user, variables of one class will be hidden from the other classes,
     * accessible only through the method of the current class, to achieve this,
     * declare the class variables 'private' and provide setter and getter methods to modify and view variable's val
     * 
    */
    Encap(){
        //constructor is called when sub class is initiated,
        //constructors are not member methods,also not inherited by subclasss
    }
    private double balance = 0;
    protected int accounts = 10;
    public void deposite(int x){
        if (x>0){
            balance += x;
        }
    
    }
}

class Inher extends Encap{          
    
    void bank(){
        accounts = 12;
        super.accounts = 44;        //access the variable from Encap super class
    }

}

class Animal{
    public void makeSound(){
        System.out.println("Grr...");
    }
}
class Cat extends Animal{
    @Override public void makeSound(){
        System.out.println("Meow..");
    }
}

class Dog extends Animal{                   // Inher > derived/sub/child class    Encap > base/super/parent class
   @Override public void makeSound(){                // inherits all Encap's non private variables and methods to class 'Inher'
        System.out.println("Bark..");
    }                                
    /** Inheritance ###############################################
     * recall the 'protected' access modifier, makes the members visible only to the sub classes
     */
}
class Polymorp{                             //having many forms,  also known as 'Runtime Polymorphism'
    public static void Polymorp(){          //very useful when you have multiple subclasses of the superclass
        Animal a = new Dog();
        Animal b = new Cat();
        a.makeSound();
        b.makeSound();
    }    
}

class Overloading{
    /** OVERLOADING === Compile-time Polymorphism   ===========
     *      method have same name with different parameters
     *      
     */
}
/** ABSTRACTION
 *      essential qualities rather than specific characteristics of one particular example
 *      achieved using > abstract classes and interfaces
 *      cannot be instantiated, can't create object of that type
 *      to use, have to inherit abstract class from another class
 *      any class contains abstract method should be defined as abstract
 * 
 */

abstract class Abs{                         //abstract class
    int legs = 0;
    abstract void makeSound();              //abstract method

}

class Tract extends Abs{
    @Override public void makeSound(){
        System.out.println("Baaam");
    }
}

interface intrfc{
    public void eat();
    public void makeSound();
    /** INTERFACE is completely an abstract class that contains only abstract methods
     * may contain only static final variables
     * cannot contain a constructor bcoz interfaces cannot be instantiated
     * interfaces can extend other interfaces
     * a class can implements any number of interfaces
     * 
     * PROPERTIES OF INTERFACES:
     * implicitly abstract, abstract keyword is not needed
     * methods in a interface are implicitly public
     * class can inherits from just one superclass, but can implement from multiple interfaces 
     * #### When implements an interface , need to override all of it's methods
     */
} 

abstract class Bull implements intrfc{
    @Override public void makeSound(){
        System.out.println("Meoww"); 
    }
    @Override public void eat(){
        System.out.println("omnomnom");
    }

}

class Casting{
    static void downCasting(){
        int a = (int)3.14;          //float to int > 3
        double d = 42.571;
        int b = (int)d;             // >42 double to int
        //java supports automatic tpe casting of int > floatings, since there is loss of precision
        //on the other hand, type casting is mandatory when assigning floating point values to int variable
    }
    static void upCasting(){
        /*
        for classes there are two types of casting
        #### Up Casting
        casting instance of superclass to it's sub class
        
        #### Down Casting
        casting an object of a superclass to it's subclass
        
        #### Up Casting automatic ? Downcasting manual?
        upcasting can never fail. but if u have a group of different animals and want to downcast them all to a 
        Cat, then there's a chance that some of these Animals are actually Dogs, so the process fails
        
        */
        Animal a = new Cat();       //automatic upcasting Cat to Animal
        Animal b = new Animal();
        ((Cat)b).makeSound();       //downcasting Animal to Cat
    }
}

class Anon{                 // extend the exiting classes on the fly
    public void start(){
        System.out.println("Start...");
    }
    Anon an = new Anon(){                   // start of Anon class
        @Override public void start(){      // when creating Anon obj. we can change start method on the fly
            System.out.println("Boooo");
        }
    };                                      // semiocolon; at the end of the anon class
    //an.start();
    /* ## after the constructor call, we have opened the curly braces and have overridden the 'start' 
          method's implemetation on the fly
       ## the modification only applicable onty to the current object, and not the class itsel. so if we create 
          another object of that class, the start method's implementation will be the one defined in the class.
    */
}

class Inner{
    /* Java supors nesting classes
    #   a class can be a member of another class
    #   just write a class within a class
    #   unlike classes, inner class can be private, once declared an inner class 
       'private' it cannot be accessible from an object outside the class
    #   the inner class can access all of the member variables and methods of it's outer class,
        but it cannot be accessed from any other class.
    */
    int id;
    Inner(int i){                   // constructor
        id = i;
        Brain b = new Brain();
        b.think();
    }
    
    private class Brain{            // the inner class
        public void think(){
            System.out.println(id + " is thinking");
        }
    }
}

class unit05{
    /** OOPC    ===============================================
     * There are 4 concepts in OOP
     *  Encapsulation
     *  Inheritance
     *  Polymorphism
     *  Abstraction
     * 
     * properties > methods and variables
     * 
     * OVERRIDING AND OVERLOADING =====================
     * Rules:
     *      should have the same return type and argument
     *      access level cannot be more restrictive than the overridden method's access level
     *      superclass = public / subclass cannot be = private, protected
     *      method declared final or static cannot be overridden
     *      if a method cannot be inherited, it cannot be overridden
     *      constructors cannot be overridden
     */
    String s;
    unit05(String s){
        String name = s;
    }
    // Generated hashCode > equals
    @Override
    public int hashCode(){
        final int primes = 31;
        int result = 1;
        result = primes*result+((s==null)?0:s.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final unit05 other = (unit05) obj;
        if (!Objects.equals(this.s, other.s)) {
            return false;
        }
        return true;
    }
    
    void equal(){ 
        unit05 u1 = new unit05("foo");
        unit05 u2 = new unit05("foo");
        boolean anz = u1.equals(u2);            // using equals method to compare objects and memory location rather than corresponding value
    }
    
    enum Rank{              //Collection of constants,MEMBERS OF THE FIXED SET
    SOLDIER,
    SERGEANT,
    CAPTAIN
    }
    
    void lol(){
    Rank a = Rank.SOLDIER;      // Reffering constant in enum
    
    switch(a){
        case SOLDIER:
            System.out.println("hi");
            break;
        case SERGEANT:
            System.out.println("hey, Soldier");
            break;
        case CAPTAIN:
            System.out.println("at ease");
            break;
        default:
            System.out.println("Let's move");
    }
            
        
    }
}

class unit06{
    // Excaptions, Lists, Threads and Files
    /*
    IndexOutOfBoundsException
    IllegalArgumentException
    ArithmeticException
    IOException
    #####################################################
    # 2 Types of Exceptions     ######
        *CHECKED(compile time) EXCEPTIONS
            /wont compile unless it handled
            /checked in compile time
        *UNCHECKED(run time) EXCEPTIONS
            /will compile if unhandled but
            /checked in runtime
    */
    void exhand(){          // Exceptions cause abnormaltermination of the programe
        try{
        
        }
        catch(ArithmeticException err){
        
        }
        catch(Exception iae){
            
        }
        
    }
    //throw > manually generate exception for the method
    int div(int a, int b) throws ArithmeticException, IllegalArgumentException{     //throws mltiple exceptions
        if (b == 0){
            throw new ArithmeticException("Divided by Zero");       // customized exception with msg
        }
        else{
            return a/b;
        }
    }
}

 //Threds

class threads extends Thread{                   //extend the thread class
    @Override public void run(){                //Overrides it's run method
        System.out.println("Hello Friend");     //write the funcionality of the thread in run method
    }
}
class mine{
    mine(){
        threads thr = new threads();    //creating new object for access the thread
        thr.start();                    //run mrthod execute on a different method
        thr.setPriority(5);             // 1-10 ; default is 5
    }
    void teas(){
        Thread th = new Thread(new thread2());
        th.start();
        try{
            Thread.sleep(1000);             //pause thread for 1000msec. / 1sec.
        }
        catch (InterruptedException inex){
            //sleep methods throws Inturrupted exception so it need to be catched
        }
    }
}

//Prefferd way to use Threads because it enables way to extends from another class as wel
class thread2 implements Runnable{                      //implemets Runnable interface
    @Override public void run(){                                  //override it's run method then call start method from another method
        System.out.println("Implemented Runnable");
    }
    //from here mine.teas(); method
}

// import java.util.ArrayList;
// import java.util.Collection;
class ArrayLists{
    public void arlist(){
        //ArrayList colors = new ArrayList();
        //optionally can specify 'capacity' and 'type' of the ArrayList
        ArrayList<String> colors = new ArrayList<String>(10);   // use class types instead of variable types. just like <Integer> <Double> <String> & so on
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.remove("Red");
        Collections.sort(colors);           // sorting elements in the 'colors' ArrayList
        /*
        Collections.max(Collection c);
        Collections.min(Collection c);
        Collections.reverse(List list);
        Collections.shuffle(List list);
        */
        System.out.print(colors);
        /*
        add()       - add new objects to the array list
        remove()    - remove objects from array list
        contains()  - returns true if the list contains the element
        get(int index)       - return the object in the specified position / starts from 0 indexing
        size()      - return the number of elements in the array list
        clear()     - remove the all elements in the ArrayList
        */
    }
}

/* ####### LINKED LISTS Vs ARRAY LISTS
                  way they store objects:
# ArrayLists :    better for storing and accessing data, similar to normal arrays
                  USE WHRN NEEDED TO RAPID ACCESSS TO DATA

# LinkedLists:    better for manipulating data, making numerous inserts and deletes,
                  Inaddition to storing object LinkedLists stores the memory address or link of the element that follows it.
                  each element contains to a link to the neighbouring element.
                  USE WHEN NEEDED TO MAKE LARGE NUMBER OF INSERTS AND/OR DELETES
*/

/*
SIMILAR TO the ArrayList
can easily change an ArrayList to a LinkedList by changing the object type
## cannot specify an initial capacty if the LinkedList
*/
//import java.util.LinkedList;
class LinkedLists{
    public void linklist(){
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Green");
        c.add("Blue");
        c.add("Yellow");
        c.clear();
        System.out.println(c);
    }
}

//import java.util.HashMap;
/* 
### HASHMAPs ######################################
# Use for storing data collections as key, value pairs. one object is used as a Key(index) to another object(the value)
# HashMap cannot have duplicate keys, adding new item with exiting key overwrites the old element
#       containsKey("Key");   determine the presence of specified key
#       containsValue(value); determine the presence of specified value
# Trying to get a value that is not preset in the map returns 'null' (type that represents the absence of a value)

*/
class HashMaps{
    public void hashMap(){
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Amy",155);
        points.put("Dave",42);
        points.put("Rob",733);                      //hashmap.put("key",vlue); add vlaues to hashmap
        points.remove("Amy");                       //hashmap.remove("key"); remove value from hashmap
        System.out.println(points.get("Dave"));     //hashmap.get("key"); get values from hashmap
    }
}

// import java.util.HashSet;
/*
Set cannot contain duplicate elements. Models the mathematical set abstraction. One of implementation is HashSet class.
Does not automatically retain the order of the elements as they added

*/
class HashSets{
    void hashSet(){
         HashSet<String> set = new HashSet<String>();
         set.add("A");
         set.add("B");
         set.add("C");              // add elements to the set
         set.size();                // returnes the number of elements in the set
         System.out.println(set);
    }
}

//import java.util.LinkedHashSet;
/*
To order the elements use a LinkedHashSet, which maintains a linked list of the set's e;ements in the orderin which they were inserted

######## HASHING ########################################
# A hash table stores information through a mechanism called hashing, in which a key's informational content is used to deterine a unique value called hash codes.
# so basically, each element in the HashSet is associated with its unique hash code.

*/
class LinkedHashSets{
    void linkedhashset(){
        LinkedHashSet<String> lin = new LinkedHashSet<String>();
        lin.add("One");        
    }
}

/*
# Object that eneble to cycle through collection, obtain or remove elements.
*/

//import java.util.LinkedList;
//import java.util.Iterator;
class Iterator{
    void iter(){
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        
        //Iterator<String> itr = animals.iterator();
        //String value = itr.next();
        //System.out.println(value);
    }
}

//import java.io.File;
//import java.util.Scanner;
class Files{
    void files(){
        File file = new File("C:\\solo.txt");
        if(file.exists()){
            System.out.println(file.getName()+" exists!");
        }
        else{
            System.out.println("File Doesn't Exists!");
        }
    }
    void readFiles(){
        //METHOD 1
        try{
            File x = new File("C:\\test.txt");
            Scanner sc = new Scanner(x);
            //System.out.println(sc.next());
        }
        catch(FileNotFoundException err){
            System.out.println("File Not Found!");
        }
        
        // METHOD 2
        try{
            File zz = new File("C:\\samp.txt");
            Scanner sc = new Scanner(zz);
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch(Exception er){
            System.out.println("Error!");
        }
    }
}

// import java.util.Formatter;
class WriteFiles{
    void writeFile(){
        try{
            Formatter f = new Formatter("C:\\Solo\\boo.txt");
            f.format("%s %s %s", "1","John","Smith \r\n");
            f.format("%s %s %s", "2","Amy","Brown");
            f.close();
        }
        catch(Exception ern){
            System.out.println("Error!");
        }
    }
}