package at.jayden.projects_games.Objects;

import at.jayden.projects_games.Image.Rocket;
import at.jayden.projects_games.firstgame.Rectangles;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Objects extends BasicGame {
    public Objects(String title) {
        super(title);
    }

    private List<Actor> actors;

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Random random = new Random();
        for(int a = 0 ; a <10;a++){
            Rectangle rectangle = new Rectangle(random.nextInt(650),random.nextInt(600),random.nextInt(10));
            this.actors.add(rectangle);
        }

        for (int a = 0; a < 10; a++){
            Circle circle = new Circle();
            this.actors.add(circle);
        }

        for(int a = 0; a < 10; a++){
            Ellipse ellipse = new Ellipse(random.nextInt(650),random.nextInt(600));
            this.actors.add(ellipse);
        }

        Rocket rocket = new Rocket();
        this.actors.add(rocket);

    }



    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (Actor actor : this.actors) {
            actor.update(delta);
        }
    }

    @Override
    public void keyPressed(int key, char c) {
        System.out.println("pressed");
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

            for (Actor actor : this.actors) {
                actor.render(graphics);
            }

        }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Objects("Objects"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
