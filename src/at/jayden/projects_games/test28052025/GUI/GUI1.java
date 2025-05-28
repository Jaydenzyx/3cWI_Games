package at.jayden.projects_games.test28052025.GUI;

import at.jayden.projects_games.test28052025.Library.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI1 implements GUI{

    private LibraryManager libraryManager;

    List<Library> mediaList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);


    @Override
    public void start() {
        while (true) {
            System.out.println("1 Show all products");
            System.out.println("2 Get price of all Products");

            int selection = scanner.nextInt();

            if (selection == 1) {
                libraryManager.getallMedia();
            } else if (selection == 2) {
                libraryManager.calculateTotalmediavaue();
            }

        }
    }

    @Override
    public void addMedia(Library Media){
        this.mediaList.add(Media);
    }

}
