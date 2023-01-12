import java.util.Scanner;
// import java.util.Vector;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    Flight[] flightList = { new Flight() };

    public static void main(String[] args) throws Exception {
        String airports[] = { "s", "s" };
        Flight flight = new Flight();
        flight.setDepartureAirport(airports[0]);
        System.out.println("Hello, World!" + flight.getDepartureAirport());

        // Flight[] flightList = { new Flight(), new Flight()};
        // for (Flight f : flightList) {
        // continue;
        // }

        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter username");
            String userName = myObj.nextLine(); // cin

            System.out.println("Username is: " + userName);
        }
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        // System.out.println("Before formatting: " + myDateObj);
        System.out.println(formattedDate);

        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("1:veiw available flights ");
            System.out.println("2:book flight ");
            System.out.println("3:add flight ");
            System.out.println("4:exit ");
            String c = myObj.nextLine(); // cin
            System.out.println("you choose: " + c);
            switch (c) {
                case "1":
                    System.exit(0);
                    break;
                case "2":
                    System.exit(0);
                    break;
                case "3":
                    System.exit(0);
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
        // end of main
    }

    public static void displayflights(Flight[] flightList) {
        for (Flight f : flightList) {// means for f in flightlist
            System.out.println(f.toString());
        }
    }

    public static void book() {
        Person p = new Person();
        try (Scanner myObj = new Scanner(System.in)) {

            System.out.println("Enter first name");
            String firstName = myObj.nextLine(); // cin
            p.setFirstName(firstName);

            System.out.println("Enter last name");
            String lastName = myObj.nextLine(); // cin
            p.setLastName(lastName);
            char gender;
            a:{
            System.out.println("Enter Gender/n ");
            String c = myObj.nextLine();
            switch (c) {
                case "male":
                    gender = 'm';
                    break;
                case "female":
                    gender = 'f';
                    break;
                default:
                    goto a;
                    break;
            }
        }
            // if c[0]
            // cin
            // p.setGender(gender);

            System.out.println("Enter age");
            int age = myObj.nextInt(); // cin
            p.setAge(age);

            System.out.println("name is: " + lastName);
        }
    }

    public static void addflights(Flight[] flightList) {
        for (Flight f : flightList) {// means for f in flightlist
            System.out.println(f.toString());
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
