package at.jayden.projects_games.javauebung;

public class main {

    public static void main(String[] args) {

        Position p1 = new Position(48,16);
        Position p2 = new Position(40,32);

        Passenger pas1 = new Passenger("Leon","raider");
        Passenger pas2 = new Passenger("Luca","Andreas.2");

        Plane plane1 = new Plane("A320",p1);
        Plane plane2 = new Plane("Boeing777",p2);

        TrafficController tc = new TrafficController();

        tc.addPlane(plane1);
        tc.addPlane(plane2);
        plane1.addPassenger(pas1);
        plane1.addPassenger(pas2);
        plane2.addPassenger(pas1);
        plane2.addPassenger(pas2);
        tc.printallPlanes();
        tc.informPeopleOnAllplanes();
        plane1.informallPassangers();

        pas1.inform();




    }

}
