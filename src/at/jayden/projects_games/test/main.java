package at.jayden.projects_games.test;
import at.jayden.projects_games.test.GUIs.GUI1;
import at.jayden.projects_games.test.GUIs.GUI;
import at.jayden.projects_games.test.Products.Phone;
import at.jayden.projects_games.test.Products.Turnschuhe;

import java.awt.*;

public class main {


    public static void main(String[] args) {

        GUI gui = new GUI1();


        gui.addProduct(new Turnschuhe(Color.RED, 1, "Nike Air Max"));
        gui.addProduct(new Phone(2, "Iphone" ));

        gui.start();

    }

}
