package at.jayden.projects_games.Tetris;

import org.newdawn.slick.*;

public class LRight extends BasicGame {

    private Image lrightImage;

    public LRight() throws SlickException {
        super("LRight");
        Image tmp = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Tetris\\Images\\LRight.png");
        this.lrightImage = tmp.getScaledCopy(280, 147);
    }

    public LRight(String title) {
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
        graphics.drawImage(lrightImage, 85, 300);
    }
}
