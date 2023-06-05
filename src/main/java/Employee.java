public class Employee {
    private String id;
    private String dob;
    private String firstName;
    private String lastName;
    private String gender;
    private String startDate;

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
