package at.jayden.projects_games.Flappy_Bird;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;

public class Background {
    private Image backgroundImage;

    public Background() throws SlickException {
        this.backgroundImage = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Flappy_Bird\\Images\\Background.png");
    }

    public void render(Graphics graphics) {
        graphics.drawImage(backgroundImage, 0, 0);
    }
}