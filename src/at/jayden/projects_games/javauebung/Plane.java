package at.jayden.projects_games.javauebung;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String name;
    private List<Passenger> passengerList = new ArrayList<Passenger>();
    private Position position;


    public Plane(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public void informallPassangers(){
        for(Passenger passenger : passengerList){
            passenger.inform();
        }
    }

    public void addPassenger(Passenger passenger){
        passengerList.add(passenger);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
