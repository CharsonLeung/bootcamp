public class DemoDataType {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Data type: Primitives (rawest types) 
        // 1. (Store integers) : byte, short, int, long,
        // 2. (Store number with decimal) : float, double
        // 3. (Store Single Character) : char
        // 4. (Store true or false) boolean
        // variable 變量
        // !int
        // Integer (+ve - -ve)

        //x and y are variables

        // "=" -> assignment
        // from right to left
        int x = 3;
        // put 7 into y
        int y = 7;

        System.out.println("x");
        System.out.println(x); // 3
        System.out.println(y);
        
        // Re-assign value 10 into variable x
        x = 10;
        System.out.println(x); // 10

        // Re-assign value 100 into variable y
        y = 100;
        // shortcut: sysout -> System.out.println();
        System.out.println(y);
        
        int age = 65;
        int salary = 20000;

        //variable name convention
        //1. Must be started with a-z
        //2. Camel Case ()
        int w1 = 2;

        // 
        int tutorFirstName = 3;
        System.out.println(tutorFirstName);

        // Declaration for variable type (聲明變量類型)
        int a;

        // Same variable name can be declared once only (Cannot change from int to others)
        // Assignment
        a = 4;
        System.out.println(a);

        // Declaration and assignment
        int w = 10;
        System.out.println(w);

        // ! double (store 小數點 max.80 d.c., do not repeatedly use former variables)
        double d1 = 4.4;
        double d2 = 5.468;
        
        System.out.println(d2);

        double d3;
        d3 = 10.4;
        System.out.println(d3);

        // +, -, *, /
        int x2 = 6 + 1;
        System.out.println(x2);
        int x3 = 9;

        // ! put x3 value into variable x2
        x2 = x3;
        System.out.println(x2);
        System.out.println(x3);

        int x4 = 10;
        x2 = 7 + x4;
        System.out.println(x2);

        // ! add 3 to itself
        x2 = x2 + 8;
        System.out.println(x2);
        
        //byte, short, int, long,(Store integer)
        byte b1 = 3;
        short s1 = 32767;
        int i1 = 3;
        long l1 = 3;

        // byte {-128 - 127}
        // short {-32768 ; 32767} (2^15)
        // int {-21 億.x - 21 億.x} ()
        // long {-2^63}
        // float 

        //s1 = 32767;
        //s1 = s1 + 1;

        i1 = 2_147_483_647; //in JAVA uses _ instead of ,
        //int + int -> int (overflow)
        i1 = i1 + 1; //cycle begins another end.
        System.out.println(i1); // overflow -2,147,483,648

        // 0. Prepare a long value 2.2 billion (RHS)
        // 1. you intend to write an int value 2.2 billion in a long variable. (RHS)
        // 2. assign a value into long variable. (LHS)
        // l1 = 2_200_000_000 // !system error (you cannot prepare an int value 2.2 billion.)
        
        l1 = 2_200_000_000L;
        
        //long + int = long

        l1 = l1 + 3L;
        System.out.println(l1);
        l1 = l1 + 2_200_000_000L;
        System.out.println(l1);

        // long + int -> long + long -> long (有大食大)
        long l2 = 2_200_000_000L + 5;
        System.out.println(l2);

        //
        int i8 = 9; // int variable -> unsafe for byte.
        //byte b9 = i8; //i8 could be <<-128 or >>127 //what is the type of i8? ooo... it is int, sorry not OK (not safe for byte.)
        byte b10 = 3; //direct value -> safe
        //byte, short could be put direct value.
        //short s11 = i8; //unsafe. (bigger range of variables cannot be put into variables of smaller range.)
        
        // ! the range of int value should solve the majority of the problem in system.
        // to save resource, we won't use long as a default type of variable for storing integer.

        // boolean (either true or false) (one bit to store one value)
        boolean b9 = true;
        b9 = false;

        int result = 5;
        // "result % 2 == 1" -> true
        boolean isResultIsOddNumber = result % 2 == 1; // "==" -> checking if equal to
        System.out.println(isResultIsOddNumber); // true

    // float (Store decimal number)
    // 3.14159 is a double value(64 bits), bigger range than float(32 bits).
    // so it is unsafe (assign double value to float variable)
    float f1 = 3.14159f;
    //long l15 = 3L; //small l looks like 1.
    f1 = 0.3f + 0.4f;
    System.out.println(f1); // 0.70000005
    }
}
