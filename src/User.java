import java.util.ArrayList;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String email;

    private String phoneNumber;


    public User(String firstname, String lastname, int age, String gender, String email, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public User(){

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String viewUser(){

      //  System.out.println(this);
       return "Name : " + firstname + "\nEmail : " + email +"\nAge : "+ this.age + "\nPhoneNumber : " + this.phoneNumber ;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + this.firstname + '\'' +
                ", lastname='" + this.lastname + '\'' +
                ", age=" + this.age +
                ", gender='" + this.gender + '\'' +
                ", email='" + this.email + '\'' +
                '}';
    }
}
