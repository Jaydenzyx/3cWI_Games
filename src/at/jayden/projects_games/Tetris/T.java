package at.jayden.projects_games.Tetris;

import org.newdawn.slick.*;

public class T extends BasicGame {

    private Image Timage;

    public T() throws SlickException {
        super("T");
        Image tmp = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Tetris\\Images\\T.png");
        this.Timage = tmp.getScaledCopy(280, 147);
    }

    public T(String title) {
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
        graphics.drawImage(Timage, 85, 400);
    }
}
