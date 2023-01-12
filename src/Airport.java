public class Airport {
    String Name;
    String City;

    public Airport(String Name, String City) {
        this.Name = Name;
        this.City = City;
    }

    public void setname(String Name) {
        this.Name = Name;
    }

    public void setcity(String City) {
        this.City = City;
    }

    public String getName() {
        return this.Name;
    }

    public String getcity() {
        return this.City;
    }

}
