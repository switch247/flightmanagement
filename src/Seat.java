public class Seat {
    String id;
    Person person;
    // boolean taken;

    // public Seat(String id, Person person) {
    // this.id = id;
    // this.person = person;
    // }
    public Seat() {

    }

    public Seat(String id, Person person) {
        this.id = id;
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " " + person.toString();
    }
}