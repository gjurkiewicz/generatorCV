package pl.akademiakodu.generate.CV.model;

public class Person {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private String email;
    private String fullName;


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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return firstName+" "+lastName;
    }

    public void setFullName(String firstName, String lastName) {
        this.fullName = firstName+" "+lastName;;
    }
}
