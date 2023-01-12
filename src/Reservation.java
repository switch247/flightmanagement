public class Reservation {
    private int reservationNumber;
    private int numberOfPersons;
    private Person[] Persons; // = new Person[numberOfPersons];
    private String flightNumber;
    private String departureDate;
    private Seat[] reservedSeats;

    public Reservation(){}
    
    public Reservation(int reservationNumber, int numberOfPersons, Person[] Persons, String flightNumber, String departureDate, Seat[] reservedSeats) {
        this.reservationNumber = reservationNumber;
        this.numberOfPersons = numberOfPersons;
        this.Persons = Persons;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.reservedSeats = reservedSeats;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public void setPersons(Person[] Persons) {
        this.Persons = Persons;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureDate(int year, int month, int day) {
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");     //Defines the date format needed
        Calendar calendar1 = new GregorianCalendar(year, month-1, day);   //creates a date from Calendar class   
        this.departureDate = sdf.format(calendar1.getTime());
    }   

    public void setReservedSeats(Seat[] reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void getPersons() {
        
        for(int i=0; i<Persons.length; i++){
            System.out.println(Persons[i]);
        }
        
    }

     public Person[] getPersonsArray() {
        
        return Persons;
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureDate() {
        return departureDate;
    }
    
   public String[] getReservedSeats(){
      String[] reservedSeatID = new String[this.getNumberOfPersons()];  
        for(int i=0; i<reservedSeatID.length; i++){
            reservedSeatID[i] = reservedSeats[i].getSeatID();
        }
        return reservedSeatID;
    } 

    @Override
    public String toString() {
        String array1 = Arrays.toString(Persons);
        String array2 = Arrays.toString(getReservedSeats());
        return reservationNumber + "*" + numberOfPersons + "*" + array1 + "*" + flightNumber + "*" + departureDate + "*" + array2 ;
    }
    
    
    
}