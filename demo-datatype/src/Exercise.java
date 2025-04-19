public class Exercise {
  public static void main(String[] args) {
    System.out.println("Exercise!");

    double distKm = 42.195 * 100; // ! change distaince here
    System.out.println("Distance to run: " + distKm / 100 + "km");
    //System.out.println(distKm / 100);
    int paceMin = 3 * 10; // ! change minutes here
    //System.out.println("pace in minutes:");
    //System.out.println(paceMin / 10);
    double paceSec = 7; // ! change seconds here
    //System.out.println("pace in seconds:");
    //System.out.println(paceSec);
    System.out.println("Your pace: " + paceMin / 10 + " minutes " + paceSec + " seconds");
    double lengthMin = 6;
    double paceSecDeci;
    paceSecDeci = (paceSec / lengthMin);
    //System.out.println(paceSecDeci);
    double pace = paceMin + paceSecDeci;
    //System.out.println(pace);
    //System.out.println("your pace:");
    //System.out.println(paceMin / 10);
    //System.out.println("minute(s)");
    //System.out.println(paceSec);
    //System.out.println("second(s)");
    double time = (distKm * pace) / 1000;
    
    //System.out.println(distKm / 100);
    //System.out.println("is as follow:");
    //System.out.println(time);
    
    int timeMin = (int)time;
    //System.out.println(timeMin);
    //System.out.println("minutes");
    double timeSec = time * 10 - timeMin * 10;
    //System.out.println(timeSec);
    double timeSecR = timeSec * 6;
    //System.out.println((int)timeSecR);
    //System.out.println("seconds.");
    System.out.println("Your finishing time for " + distKm / 100 + "km is:");
    if (timeMin < 60) {
    System.out.println(timeMin + " minutes " + (int)timeSecR + " seconds.");}
    else {
      System.out.println(timeMin / 60 + " hours " + timeMin % 60 + " minutes " + (int)timeSecR + " seconds. ");
    }
    
    if ((distKm / 100 == 42.195) && ((timeMin * 60 + timeSecR) <= (3600 * 3))) 
      {System.out.println("****You could do a sub-3 marathon!");} else {}
  }
}
