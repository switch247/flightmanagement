public class Person {
    String firstName;
    String lastName;
    int age;
    char gender;

    public Person() {

        //
    }

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        //
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return firstName + " " + lastName + " " + gender + " " + age;
    }

}
