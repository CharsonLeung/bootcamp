import java.util.Arrays;

public class ArrayTest {
  public static void main(String[] args) {
    int n = 7;
    int p = n * 50;
    int [] arr = new int[p];
    
      for (int i = 0; i < p; i++) {
    //print only multiples of n
        if (i % n == 0) {
        arr[i] = i;
        System.out.println(arr[i]);
    

      }
    }

    String[] strarr = new String[] {"a","b","c","d"};
      for (int i = 0; i < strarr.length; i++) {
        System.out.println(strarr[i]);
      }
    System.out.println("======================================");
    // a, b, c, d -> d, c, b, a
      for (int i = strarr.length - 1; i >= 0; i--) {
        System.out.println(strarr[i]);
      } 
    System.out.println("=======================================");
    
    String [] strName = new String[] {"January", "February", "March", "April", "May", "June"};
      char [] strName1 = new char[strName.length];
      char [] strName2 = new char[strName.length];
      char [] strName3 = new char[strName.length];
      // char [] strNameN = new char[strName.length];
      int [] strASCII = new int[strName.length];
        for (int i = 0; i < strName.length; i++) {
            strName1[i] = strName[i].charAt(0);
            strName2[i] = strName[i].charAt(1);
            strName3[i] = strName[i].charAt(2);
            strASCII[i] = strName1[i]; //.concat(strName3[i])); //hard-coding for first 3 letters
          //System.out.println(strName[i]);
          //System.out.println(strName1[i]);
          System.out.println(strName[i] + " = " + strASCII[i]); // lack of "dictionary" tool to do this?
        }
        System.out.println("============================");
    int box = 0;
       for (int i = 0; i < strName.length - 1; i++) {
          for (int j = 0; j < strName.length - 1 - i; j++) {
          if (strASCII[j] > strASCII[j + 1]) {
            box = strASCII[j];
            strASCII[j] = strASCII[j + 1];
            strASCII[j + 1] = box;
          }
        } 
       }
       System.out.println(Arrays.toString(strASCII));
       System.out.println("================================");
  String name = "Venturenix"; //Insert a name to sort.
  char nameArr [] = new char[name.length()];
  int nameASCII [] = new  int[name.length()]; 
      for (int i = 0; i < name.length(); i++) {
        
        nameArr[i] = name.charAt(i);
        nameASCII[i] = (char)name.charAt(i);
        if (nameASCII[i] <= (char)'Z') {
          nameASCII[i] += ((char)'a' - (char)'A');
        } else {}
         } 
      box = 0;
      for (int i = 0; i < nameASCII.length - 1; i++) {
        for (int j = 0; j < nameASCII.length - 1 - i; j++) {
          if (nameASCII[j] > nameASCII[j + 1]) {
            box = nameASCII[j];
            nameASCII[j] = nameASCII[j + 1];
            nameASCII[j + 1] = box;

          }
        }
      }
    System.out.println(Arrays.toString(nameArr));
    System.out.println(Arrays.toString(nameASCII));
    char [] nameSorted = new char[nameArr.length];
    for (int i = 0; i < nameASCII.length; i++) {
      nameSorted[i] = (char)nameASCII[i];
    }
    System.out.println(Arrays.toString(nameSorted));
    
      }
  }
