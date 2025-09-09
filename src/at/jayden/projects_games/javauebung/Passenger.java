package at.jayden.projects_games.javauebung;

public class Passenger {

   private String firstName;
   private String Lastname;


    public Passenger(String firstName, String lastname) {
        this.firstName = firstName;
        Lastname = lastname;
    }

    public void inform(){
       System.out.println("Hallo");
   }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
