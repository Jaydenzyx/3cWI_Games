package at.jayden.projects_games.javauebung;

import java.util.ArrayList;
import java.util.List;

public class TrafficController {

    private List<Plane> planeList = new ArrayList<Plane>();

    public TrafficController() {

    }

    public void printallPlanes(){
        for(Plane plane : planeList){
            System.out.println(plane.getName());
        }
    }

    public void informPeopleOnAllplanes(){
        for (Plane plane : planeList){
            plane.informallPassangers();
        }
    }

    public void addPlane(Plane plane){
        planeList.add(plane);
    }

}
