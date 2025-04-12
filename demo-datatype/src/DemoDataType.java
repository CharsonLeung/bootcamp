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

    }
}
