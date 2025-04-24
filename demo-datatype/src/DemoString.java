public class DemoString {
  public static void main(String[] args) {
    //String is NOT primitive, which consist of a set of char values
    String s = "John";
    String s2 = "Dear Sir,";

    // 8 Primitives -> store values ONLY
    // String -> Store values + functions
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3); // Vincent

    // Function 1: equals()
    System.out.println(s3.equals("Vincent")); // true
    System.out.println(s3.equals("vincent")); // false, case sensitive


    // Function 2: length()
    System.out.println(s3.length()); // 7

    // Function 3: charAt()
    // index starts with 0
    // index range 0-6, length=7
    s3 = "Vincent";
    System.out.println(s3.charAt(2)); // 'n', the char at position 3
    // System.out.println(s3.charAt(7)); // ! out of range
    // System.out.println(s3.charAt(-1)); // out of range

    // Question
    // print the last character of s3
    s3 = "Michael";
    System.out.println(s3.charAt(s3.length() - 1));
    // print the first character of s3
    System.out.println(s3.charAt(0));
    // Find the middle character of name
    // Joey -> e / o
    // Vincent -> c / n
    String name1 = "Joey";
    String name2 = "Vincent";
    System.out.println(name1.charAt(name1.length() / 2));
    System.out.println(name1.charAt(name1.length() / 2 - 1));
    System.out.println(name2.charAt(name2.length() / 2));
    System.out.println(name2.charAt(name2.length() / 2 - 1));

    //Function 4: indexOf(), lastIndexOf()
    String s4 = "Sally";
    s4.indexOf('a');
    System.out.println(s4.indexOf('a')); // 1
    System.out.println(s4.indexOf('b')); // -1 (not found)
    System.out.println(s4.indexOf('l')); // 2 (the first character of found)
    System.out.println(s4.lastIndexOf("ll")); // 2 

    // Function 5: contains()
    String s5 = "Hallo"; 
    s5.contains("ll");
    System.out.println(s5.contains("ll")); // contains "ll"
    System.out.println(s5.contains("lll")); // does not contain "lll"
    System.out.println(s5.contains("Sally"));

    String ts5 = "aly";
    if (s5.contains(ts5)) {System.out.println(s5 + " contains " + ts5);}
    else {System.out.println(s5 + " does not contain " + ts5);}

    // Function 6: stratsWith(), endsWith()
    System.out.println(s4.startsWith("Sa")); // true
    System.out.println(s4.startsWith("Sar")); // false
    System.out.println(s4.endsWith("lly")); // true
    System.out.println(s4.endsWith("llly")); // false
    System.out.println(s4.endsWith("Sally")); // true
    System.out.println(s4.startsWith("Sally")); // true

    if (s4.startsWith("Sa")) {System.out.println("hello");} 
      else {System.out.println("Goodbye");}

    // Function 7: isEmpty
    s5 = ""; // Empty String
    System.out.println(s5.isEmpty()); // true
    System.out.println(s4.isEmpty()); // false

    if (s5.isEmpty()) {
      System.out.println("s5 is really an empty String.");
    } else {
      System.out.println("s5 is not an empty String.");
    }

    // Function 8: concat
    String s6 = "abc";
    System.out.println(s6.concat("def")); // abcdef
    System.out.println(s6); // abc
    System.out.println(s4.concat(" Yip"));

    //Function 9: replace
    String s7 = "hellXllXllXly";
    System.out.println(s7.replace("l","x")); //hexxo
    System.out.println(s7.replace("ll","abc")); //heabco
    System.out.println(s7); //hello (remains unchanged)

    // Function 10: substring()
    String s8 = "hello Kitty";
    s8.substring(4, s8.length()); // o, end-index - 1, therefore, 7 -> w.
    System.out.println(s8.substring(3, s8.length()));

    // Function 11: toLowerCase(), toUpperCase()
    String s9 = "Hello";
    System.out.println(s9.toUpperCase());
    System.out.println(s9.toLowerCase());

    // Function 12: valueOf() -> Conversation
    int x = 3;
    String ss = String.valueOf(x); //e.g. double.valueOf(x) // 3
    System.out.println(ss);
    String ss2 = String.valueOf(3.3);

    //char[] chs = "Jacky".toCharArray():

    double d1 = Double.valueOf("3.3");
    System.out.println(d1); // 3.3
    


  }
  
}
