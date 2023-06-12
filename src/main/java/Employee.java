public class Employee {
    private String id;
    private String dob;
    private String firstName;
    private String lastName;
    private String gender;
    private String startDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    public Employee(String id, String dob, String firstName, String lastName, String gender, String startDate) {
        this.id = id;
        this.dob = dob;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.startDate = startDate;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", dob='" + dob + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}
