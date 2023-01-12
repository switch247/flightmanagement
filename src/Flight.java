
// maintain information about a flight. The maintained information are
//  *           the flight number, departure date,departure airport,
//  *           destination airport, departure time, arrival time and the flight sections.
public class Flight {// flight->plane->person
    // Plane flights[];
    int passsengers;
    String flightId;
    String departureAirport = "";
    String destinationAirport = "";
    String departureTime = "";
    String arrivalTime = "";
    Seat[] seats = { new Seat(), new Seat(), new Seat(), new Seat(), new Seat() };
    Person p;

    public Flight() {
        this.passsengers = 0;
        // this.seats = { new Seat(), new Seat(), new Seat(), new Seat(), new Seat(),
    };

    public Flight(String flightId,
            String departureAirport,
            String destinationAirport,
            String departureTime,
            String arrivalTime) {

        this.flightId = flightId;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        // this.seats = seats[10];

    }

    public static void main(String[] args) {
        Seat[] seats = { new Seat("213", new Person("fname", "lname", 23, 'F')) };
        // seats.append(new Seat);
        // Flight plane_1 = new Flight();
        // setPerson
        System.out.println("Hello World! " + seats[0].getId());
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    // @Override
    public String toString(int z) {
        // TODO Auto-generated method stub
        return flightId + " " + departureAirport + " " +
                destinationAirport + " " + departureTime + " " + arrivalTime
                + " " + seats[z].toString();
    }

}