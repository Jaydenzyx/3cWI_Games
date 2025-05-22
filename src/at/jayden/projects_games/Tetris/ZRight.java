package at.jayden.projects_games.Tetris;

import org.newdawn.slick.*;

public class ZRight extends BasicGame {

    private Image zrightImage;

    public ZRight() throws SlickException {
        super("ZRight");
        Image tmp = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Tetris\\Images\\Zrechts.png");
        this.zrightImage = tmp.getScaledCopy(280, 147);
    }

    public ZRight(String title) {
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
        graphics.drawImage(zrightImage, 85, 500);
    }
}
