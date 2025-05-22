package at.jayden.projects_games.Tetris;

import org.newdawn.slick.*;

public class background extends BasicGame {

    private Image backgroundImage;


    public background()throws SlickException {
        super  ("Tetris");
        Image tmp = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Tetris\\Images\\background tetris2.png");
        this.backgroundImage = tmp.getScaledCopy(350, 600);
    }

    public background(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawImage(backgroundImage, 180, 0);
    }
}
