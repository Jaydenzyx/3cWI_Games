package at.jayden.projects_games.Tetris;

import org.newdawn.slick.*;

public class block extends BasicGame {

    private Image blockImage;

    public block() throws SlickException {
        super("Tetris");
        Image tmp = new Image ("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Tetris\\Images\\Block.png");
        this.blockImage = tmp.getScaledCopy(280, 147);
    }

    public block(String title) {
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
    graphics.drawImage(blockImage, 75, -10);
    }
}
