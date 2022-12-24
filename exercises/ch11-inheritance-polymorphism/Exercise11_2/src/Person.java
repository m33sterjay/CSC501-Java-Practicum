import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Locale;

class Person {
    private String name = "";
    private String address = "";
    private String phoneNumber = "";
    private String email = "";
    public Person() {}
    public Person(String name, String address, String number, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = number;
        this.email = email;
    }
}
class Student extends Person {
    public final String status;
    public Student(String name, String address, String number, String email, String status) {
        super(name, address, number, email);
        this.status = status;
    }
}
class Employee extends Person {
    public int officeNumber = 0;
    public int salary = 0;
    public Employee() {
    }
    public Employee(String name, String address, String number, String email, int office, int salary) {
        super(name, address, number, email);
        this.officeNumber = office;
        this.salary = salary;
    }

}
class Faculty extends Employee {}
class Staff extends Employee {}
