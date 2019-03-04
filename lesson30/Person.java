package lesson30;

/**
 * Created by Kuba on 04/03/2019.
 */
public class Person {
    String firstName, lastName;
    int age;

    public String getFirstName(String firstName) {
        return firstName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }

    }

    public boolean isTeen() {
        if (getAge() > 12 || getAge() < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (getFirstName(firstName).isEmpty()) {
            if (getLastName(lastName).isEmpty()) {

            }
            return lastName;
        } else {
            if (getLastName(lastName).isEmpty()) {
                return firstName;
            } else {
                return firstName + " " + lastName;
            }
        }


    }


}

