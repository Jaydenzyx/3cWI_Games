package at.jayden.projects_games.Aufgabe1;

import org.newdawn.slick.BasicGame;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class main extends BasicGame {

    public main(String title) {
        super(title);
    }

    private List<Rectangles> rectangles;
    private List<Eclipsen> eclipsens;
    private List<Circles> circles;

    @Override
    public void init(org.newdawn.slick.GameContainer gameContainer) throws org.newdawn.slick.SlickException {

        this.rectangles = new ArrayList<>();
        this.eclipsens = new ArrayList<>();
        this.circles = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            Rectangles rectangle = new Rectangles(100 * i, 100, Rectangles.DIRECTION.LEFT);
            this.rectangles.add(rectangle);
        }

        for (int i = 0; i <= 10; i++) {
            Eclipsen eclipsen = new Eclipsen(100 * i, 200, 100);
            this.eclipsens.add(eclipsen);
        }

        for (int i = 0; i <= 10; i++) {
            Circles circle = new Circles(100*i , 300, Circles.DIRECTION.RIGHT);
            this.circles.add(circle);
        }

    }

    @Override
    public void update(org.newdawn.slick.GameContainer gameContainer, int delta) throws org.newdawn.slick.SlickException {

      for (Rectangles rectangle : this.rectangles){
          rectangle.update(delta);
      }

      for (Eclipsen eclipsen : this.eclipsens){
          eclipsen.update(delta);
      }

      for (Circles circle : this.circles){
          circle.update(delta);
      }

    }

    @Override
    public void render(org.newdawn.slick.GameContainer gameContainer, org.newdawn.slick.Graphics graphics) throws org.newdawn.slick.SlickException {

        for (Rectangles rectangle : this.rectangles){
            rectangle.render(graphics);
        }

        for (Eclipsen eclipsen : this.eclipsens){
            eclipsen.render(graphics);
        }

        for (Circles circle : this.circles){
            circle.render(graphics);
        }

    }

    public static void main(String[] argv) {
        try {
            org.newdawn.slick.AppGameContainer container = new org.newdawn.slick.AppGameContainer(new main("."));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (org.newdawn.slick.SlickException e) {
            e.printStackTrace();
        }
    }
}