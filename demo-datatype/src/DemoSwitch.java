public class DemoSwitch {
  public static void main(String[] args) {
    // loop + if

    // Alternative of "if" -> switch
    int score = 85;
    char grade = ' ';
    // ! range checking
    if (score >= 90) {
      grade = 'A';
  } else if (score >= 80) {
      grade = 'B';
  } else {
    grade = 'F';
  }

  switch (score) {
    case 90:
    grade ='A';
    case 91:
    grade = 'A';
   }

   // from Direction to degree
   Direction d1 = Direction.SOUTH;
   int degree  = -1;
   switch (d1) {
    case NORTH:
     degree = 360;
     break; // break the switch
    case EAST:
     degree = 90;
     break;
    case SOUTH:
     degree = 180;
     break;
    case WEST:
     degree = 270;
     break;
     default:
      //degree = -1;
  }
   System.out.println("The degree is " + degree);
  }
  
}
