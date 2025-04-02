package at.jayden.projects_games.Flappy_Bird;

import org.newdawn.slick.SlickException;

import java.awt.*;

public class Bird {
    private float x,y;
    private Image BirdImage;

    public Bird() throws SlickException {
    this.BirdImage = new Image();
    }

    public void render(Graphics graphics) {
        graphics.drawImage(BirdImage, x, y);
    }

}
