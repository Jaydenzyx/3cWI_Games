package at.jayden.projects_games.test28052025.GUI;

import at.jayden.projects_games.test28052025.Library.Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {

    List<Library> mediaList = new ArrayList<>();

    public LibraryManager(List<Library> mediaList) {
        this.mediaList = mediaList;
    }

    public void getallMedia(){
        for(Library media : mediaList) {
            System.out.println(media.getdescription() + media.getprice() + media.getid() + media.gettitle());
        }
    }

    public void calculateTotalmediavaue(){
        int totalValue = 0;
        for(Library media : mediaList) {
            totalValue += media.getprice();
        }
        System.out.println(totalValue);
    }

}
