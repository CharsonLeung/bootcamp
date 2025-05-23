import java.util.ArrayList;
import java.util.List;

public class StringArrayList {
  private String[] strings; // ! underlying data structures of StringArrayList

  public StringArrayList() {
    this.strings = new String[0];
  }

  public List<String> reversed() {
    List<String> newStrings = new ArrayList<>();
      for (int i = 0; i < this.strings.length; i--) {
        newStrings.add(this.strings[i]);
      }
      return newStrings;
    
  }
  //public void reversed2() {
  //  List<String> newStrings = new ArrayList<>();
  //  for (int i = this.strings.length - 1; i >= 0; i-- ) {
  //    newStrings.add(this,strings[i]);
  // }
  //  this.strings = newStrings;
  // }

  public void add(String string) {
    String[] newStrings = new String[this.strings.length + 1];
    for (int i = 0; i < this.strings.length; i++) {
      newStrings[i] = this.strings[i];
    }
    newStrings[newStrings.length - 1] = string;
    this.strings = newStrings;
  }

  public void remove(String string) {
    // find
    boolean found = false;
    int idx = -1;
    for (int i = 0; i < this.strings.length; i++) {
      if (this.strings[i].equals(string)) {
        found = true;
        idx = i;
        break;
      }
    }
    if (found) { // remove and resize
      String[] newStrings = new String[this.strings.length - 1];
      int count = 0;
      for (int i = 0; i < this.strings.length; i++) {
        if (i == idx)
        continue;
        newStrings[count++] = this.strings[i];
      }
    // remove
    // resize
        this.strings = newStrings;
    }
  }

  public int size() {
    return strings.length;
  }
  
}
