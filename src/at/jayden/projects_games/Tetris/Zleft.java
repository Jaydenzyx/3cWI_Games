package at.jayden.projects_games.Tetris;

import org.newdawn.slick.*;

public class Zleft extends BasicGame {

    private Image zleftImage;

    public Zleft() throws SlickException {
        super("Zleft");
        Image tmp = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Tetris\\Images\\Zlinks.png");
        this.zleftImage = tmp.getScaledCopy(280, 147);
    }

    public Zleft(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawImage(zleftImage, 200, 200);
    }
}
