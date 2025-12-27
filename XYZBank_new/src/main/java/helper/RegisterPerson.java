package helper;

import com.github.javafaker.Faker;

public class RegisterPerson {
    Faker faker = new Faker();

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String streetAddress = faker.address().streetAddress();
    String city = faker.address().city();
    String state = faker.address().state();
    String zipCode = faker.address().zipCode();
    String phoneNumber = faker.phoneNumber().phoneNumber();
    String ssn = faker.idNumber().ssnValid();
    String userName = faker.name().username();
    String password = faker.internet().password();

    public Faker getFaker() {
        return faker;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
