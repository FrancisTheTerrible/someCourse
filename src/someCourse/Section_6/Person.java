package Section_6;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age <= 100 && age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else if (this.firstName.isEmpty() && !this.lastName.isEmpty()) {
            return this.getLastName();
        } else if (this.lastName.isEmpty() && !this.firstName.isEmpty()) {
            return this.getFirstName();
        } else {
            String var10000 = this.getFirstName();
            return var10000 + " " + this.getLastName();
        }
    }
}
