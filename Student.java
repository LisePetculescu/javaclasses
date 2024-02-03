public class Student extends Person {

  private int schoolYear;

  public Student(String fullName) {
    setFullName(fullName);
    // s.setMiddleName("James");
    // s.getFullName();
    // s.setSchoolYear(3);
    // s.getSchoolYear();
  }

  public Student(
    int schoolYear,
    String firstName,
    String middleName,
    String lastName
  ) {
    // this.schoolYear = schoolYear;
    // this.firstName = firstName;
    // this.middleName = middleName;
    // this.lastName = lastName;
    super(firstName, middleName, lastName);
    this.schoolYear = schoolYear;
  }

  public void setSchoolYear(int schoolYear) {
    this.schoolYear = schoolYear;
  }

  public int getSchoolYear() {
    return schoolYear;
  }
}
