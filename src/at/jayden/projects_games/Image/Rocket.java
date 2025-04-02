package at.jayden.projects_games.Image;

import at.jayden.projects_games.Aufgabe1.Circles;
import at.jayden.projects_games.Objects.Actor;
import org.newdawn.slick.*;

public class Rocket implements Actor {
    private Image rocketImage;
    private float x,y;


    public Rocket() throws SlickException {
        Image tmp = new Image("testdata/rocket.png");
        this.rocketImage = tmp.getScaledCopy(100,100);
        this.x = 300;
        this.y = 500;
    }

    @Override
    public void render(Graphics graphics) {
        rocketImage.draw(this.x, this.y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        if(gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x ++;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x --;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_UP)){
            this.y --;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)){
            this.y ++;
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}