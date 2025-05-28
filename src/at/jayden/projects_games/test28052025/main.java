package at.jayden.projects_games.test28052025;

import at.jayden.projects_games.test28052025.GUI.GUI1;
import at.jayden.projects_games.test28052025.GUI.LibraryManager;
import at.jayden.projects_games.test28052025.Library.Library;
import at.jayden.projects_games.test28052025.Library.Roman;
import at.jayden.projects_games.test28052025.Library.audiobook;

import java.util.List;

public class main {

    public static void main(String[] args) {



        GUI1 gui = new GUI1();

        gui.addMedia(new Roman(1, "Der Prozess", 10, "Franz Kafka","action"));
        gui.addMedia(new audiobook(2, "wg", 20, "..."));

        gui.start();

    }

}
