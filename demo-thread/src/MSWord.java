import java.util.List;
import java.util.Stack;

// Stack

public class MSWord {
  private Stack<String> undoStack;
  private Stack<String> redoStack;

  // constructor
  public MSWord() {
    this.undoStack = new Stack<>();
    this.redoStack = new Stack<>();
  }

  public void undo() {
    if (undoStack.isEmpty()) {} else {
   String element = undoStack.pop();
   redoStack.push(element);
    }
  }

  public void redo() {
    if (redoStack.isEmpty()) {} else {   
    String element = redoStack.pop();
    undoStack.push(element);
    }
  }

  public void addWord(String word) {
    this.undoStack.push(word);
  }
  public List<String> getWords() {
    return this.undoStack;
  }
  
  public static void main(String[] args) {
    MSWord msword = new MSWord();
    msword.addWord("John");
    msword.addWord("Peter");
    System.out.println(msword.getWords());
    msword.undo();
    System.out.println(msword.getWords());
    msword.redo();
    System.out.println(msword.getWords());
    msword.undo();
    msword.undo();
    System.out.println(msword.getWords());
    msword.undo();
    System.out.println(msword.getWords());

  }
}
