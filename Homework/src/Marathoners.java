import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Marathoners {
  private String name;
  private char gender;
  private String country;
  private LocalDate birthDay;
  private String personalRecord;
  private Integer personalRecordHour;
  private Integer personalRecordMinute;
  private Integer personalRecordSec;
  private String recordPacing;
  private int recordYear;
  private int recordAge;


  public void setName(String name) {
    this.name = name;
  }
  public void setGender(char gender) {
    this.gender = gender;
  }
  public void setBirthDay(LocalDate birthDay) {
    this.birthDay = birthDay;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public void setPersonalRecord(Integer personalRecordHour, Integer personalRecordMinute, Integer personalRecordSec) {
    this.personalRecordHour = personalRecordHour;
    this.personalRecordMinute = personalRecordMinute;
    this.personalRecordSec = personalRecordSec;

  }
  public void setRecordPacing(String recordPacing) {
    this.recordPacing = recordPacing;
  }
  public void setRecordYear(int recordYear) {
    this.recordYear = recordYear;
  }
  public void setRecordAge(int recordAge) {
    this.recordAge = recordAge;
  }
  public void setAllInput(String name,
                          char gender, 
                          String country, 
                          LocalDate birthDay, 
                          Integer personalRecordHour,
                          Integer personalRecordMinute,
                          Integer personalRecordSec, 
                          int recordYear) {
    this.name = name;
    this.gender = gender;
    this.country = country;
    this.birthDay = birthDay;
    this.personalRecordHour = personalRecordHour;
    this.personalRecordMinute = personalRecordMinute;
    this.personalRecordSec = personalRecordSec;
    this.recordYear = recordYear;
  }
  public String getName() {
    return this.name;
  }
  public char getGender() {
    return this.gender;
  }
  public String getCountry() {
    return this.country;
  }
  public LocalDate getBirthDay() {
    return this.birthDay;
  }
  public String getPersonalRecord() {
    return this.personalRecord = personalRecordHour.toString()
                                  .concat(" hours ")
                                  .concat(personalRecordMinute.toString()
                                  .concat(" minutes ")
                                  .concat(personalRecordSec.toString().concat(" seconds")));
  }
  public String getRecordPacing() {
    int pRH = this.personalRecordHour;
    int pRM = this.personalRecordMinute;
    int pRS = this.personalRecordSec;
    Double pMin = (BigDecimal.valueOf(pRH * 3600 + pRM * 60 + pRS)
                  .divide(BigDecimal.valueOf(42.195), 3, RoundingMode.HALF_UP).doubleValue());
    Double pMin1 = BigDecimal.valueOf(pMin).divide(BigDecimal.valueOf(60), 3, RoundingMode.DOWN).doubleValue();
    Double pMinInt = BigDecimal.valueOf(pMin).divide(BigDecimal.valueOf(60), 0, RoundingMode.DOWN).doubleValue();
    Integer pMinInt1 = pMinInt.intValue();
    Double pSec = BigDecimal.valueOf(pMin1 - pMinInt).multiply(BigDecimal.valueOf(60)).setScale(0, RoundingMode.HALF_UP).doubleValue();
    Integer pSecI = pSec.intValue();
    if (pSecI > 10) {
    return this.recordPacing = pMinInt1.toString().concat(":").concat(pSecI.toString().concat(" / km."));
  } else {
    return this.recordPacing = pMinInt1.toString().concat(":0").concat(pSecI.toString().concat(" / km."));
  }
  }
  public int getRecordYear() {
    return this.recordYear;
  }
  public int getRecordAge() {
    return this.recordYear - this.birthDay.getYear();
  }

  public static void main(String[] args) {

  
  Marathoners [] runner = new Marathoners[7]; 
  
  Marathoners m1 = new Marathoners();
  runner[0] = m1;
  m1.setName("Haile Gebrselassie");
  m1.setGender('M');
  m1.setCountry("Ethiopia");
  m1.setBirthDay(LocalDate.of(1973, 4, 18));
  m1.setPersonalRecord(2,03,59);
  m1.setRecordYear(2009);

  Marathoners m2 = new Marathoners();
  runner[1] = m2;
  m2.setName("Sohn Kee-chung");
  m2.setGender('M');
  m2.setCountry("Japan(Korea)");
  m2.setBirthDay(LocalDate.of(1912, 8, 29));
  m2.setPersonalRecord(2,26,42);
  m2.setRecordYear(1935);

  Marathoners m3 = new Marathoners();
  runner[2] = m3;
  m3.setName("Samuel Wanjiru");
  m3.setGender('M');
  m3.setCountry("Kenya");
  m3.setBirthDay(LocalDate.of(1986, 11, 10));
  m3.setPersonalRecord(2,05,10);
  m3.setRecordYear(2009);

  Marathoners m4 = new Marathoners();
  runner[3] = m4;
  m4.setName("Eliud Kipchoge");
  m4.setGender('M');
  m4.setCountry("Kenya");
  m4.setBirthDay(LocalDate.of(1984, 11, 05));
  m4.setPersonalRecord(2,01,9);
  m4.setRecordYear(2022);

  Marathoners m5 = new Marathoners();
  runner[4] = m5;
  m5.setName("Kenenisa Bekele");
  m5.setGender('M');
  m5.setCountry("Ethiopia");
  m5.setBirthDay(LocalDate.of(1982, 6, 13));
  m5.setPersonalRecord(2,01,41);
  m5.setRecordYear(2019);

  Marathoners m6 = new Marathoners();
  runner[5] = m6;
  m6.setAllInput("Abebe Bikila", 'M', "Ethiopia", LocalDate.of(1932, 8, 7), 2, 12, 11, 1964);

  Marathoners m7 = new Marathoners();
  runner[6] = m7;
  m7.setAllInput("Wong Wan Chun", 'M', "Hong Kong", LocalDate.of(1996, 2, 13), 2, 15, 26, 2024);


int q = 2;
System.out.println("Name: " + runner[q].getName());
System.out.println("Gender: " + runner[q].getGender());
System.out.println("Country: " + runner[q].getCountry()); 
System.out.println("Date of Birth: " + runner[q].getBirthDay()); 
System.out.println("Personal Record: " + runner[q].getPersonalRecord());
System.out.println("Average pacing: " + runner[q].getRecordPacing());
System.out.println("Year of Record: " + runner[q].getRecordYear());
System.out.println("Age when Record made: " + runner[q].getRecordAge());

q = 3;
System.out.println("Name: " + runner[q].getName() + 
", Gender: " + runner[q].getGender() +
", Country: " + runner[q].getCountry() + 
", Date of Birth: " + runner[q].getBirthDay() + 
", Personal Record: " + runner[q].getPersonalRecord() +
", Average Pacing: " + runner[q].getRecordPacing() +
", Year of Record: " + runner[q].getRecordYear() +
", Age when Record made: " + runner[q].getRecordAge());

// Print all in once.
for (int i = 0; i < runner.length; i++) {
  System.out.println("Name: " + runner[i].getName());
  System.out.println("Gender: " + runner[i].getGender());
  System.out.println("Country: " + runner[i].getCountry()); 
  System.out.println("Date of Birth: " + runner[i].getBirthDay()); 
  System.out.println("Personal Record: " + runner[i].getPersonalRecord());
  System.out.println("Average pacing: " + runner[i].getRecordPacing());
  System.out.println("Year of Record: " + runner[i].getRecordYear());
  System.out.println("Age when Record made: " + runner[i].getRecordAge());
  System.out.println("=========================================================");
}
  }
}
