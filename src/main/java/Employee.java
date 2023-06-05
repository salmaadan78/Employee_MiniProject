public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String startDate;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }

    public Employee(String id, String firstName, String lastName, String dob, String gender, String startDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.startDate = startDate;
    }


}
