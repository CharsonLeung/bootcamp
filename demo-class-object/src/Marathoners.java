import java.time.LocalDate;

public class Marathoners {
  private String name;
  private String country;
  private LocalDate birthDay;
  private String personalRecord;
  private int recordYear;
  private int recordAge;

  public void setName(String name) {
    this.name = name;
  }
  public void setBirthDay(LocalDate birthDay) {
    this.birthDay = birthDay;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public void setPersonalRecord(String personalRecord) {
    this.personalRecord = personalRecord;
  }
  public void setRecordYear(int recordYear) {
    this.recordYear = recordYear;
  }
  public void setRecordAge(int recordAge) {
    this.recordAge = recordAge;
  }
  public void setAllInput(String name, String country, LocalDate birthDay, String personalRecord, int recordYear,
  int recordAge) {
    this.name = name;
    this.country = country;
    this.birthDay = birthDay;
    this.personalRecord = personalRecord;
    this.recordYear = recordYear;
    this.recordAge = recordAge;
  }
  public String getName() {
    return this.name;
  }
  public String getCountry() {
    return this.country;
  }
  public LocalDate getBirthDay() {
    return this.birthDay;
  }
  public String getPersonalRecord() {
    return this.personalRecord;
  }
  public int getRecordYear() {
    return this.recordYear;
  }
  public int getRecordAge() {
    return this.recordAge;
  }
  public static void main(String[] args) {

  Marathoners m1 = new Marathoners();
  m1.setName("Haile Gebrselassie");
  m1.setCountry("Ethiopia");
  m1.setBirthDay(LocalDate.of(1973, 4, 18));
  m1.setPersonalRecord("2:03:59");
  m1.setRecordYear(2009);

  Marathoners m2 = new Marathoners();
  m2.setName("Sohn Kee-chung");
  m2.setCountry("Japan(Korea)");
  m2.setBirthDay(LocalDate.of(1912, 8, 29));
  m2.setPersonalRecord("2:26:42");
  m2.setRecordYear(1935);

  Marathoners m3 = new Marathoners();
  m3.setName("Samuel Wanjiru");
  m3.setCountry("Kenya");
  m3.setBirthDay(LocalDate.of(1986, 11, 10));
  m3.setPersonalRecord("2:05:10");
  m3.setRecordYear(2009);

  Marathoners m4 = new Marathoners();
  m4.setName("Eliud Kipchoge");
  m4.setCountry("Kenya");
  m4.setBirthDay(LocalDate.of(1984, 11, 05));
  m4.setPersonalRecord("2:01:09");
  m4.setRecordYear(2022);

  Marathoners m5 = new Marathoners();
  m5.setName("Kenenisa Bekele");
  m5.setCountry("Ethiopia");
  m5.setBirthDay(LocalDate.of(1982, 6, 13));
  m5.setPersonalRecord("2:01:41");
  m5.setRecordYear(2019);

  Marathoners m6 = new Marathoners();
  m6.setAllInput("Charson Leung", "Hong Kong", LocalDate.of(1989, 11, 17), "2:53:44",2024, 34);


  // String q = m1;
System.out.println("Name: " + m2.getName() + 
                   ", Country: " + m2.getCountry() + 
                   ", Date of Birth: " + m2.getBirthDay() + 
                   ", Personal Record: " + m2.getPersonalRecord() +
                   ", Year of Record: " + m2.getRecordYear());
System.out.println("Name: " + m6.getName() + 
", Country: " + m6.getCountry() + 
", Date of Birth: " + m6.getBirthDay() + 
", Personal Record: " + m6.getPersonalRecord() +
", Year of Record: " + m6.getRecordYear());
  }
}
