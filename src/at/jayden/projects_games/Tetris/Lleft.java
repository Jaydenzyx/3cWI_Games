package at.jayden.projects_games.Tetris;

import org.newdawn.slick.*;

public class Lleft extends BasicGame {

    private Image lleftImage;

    public Lleft() throws SlickException {
        super("Lleft");
        Image tmp = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Tetris\\Images\\Llinks.png");
        this.lleftImage = tmp.getScaledCopy(280, 147);
    }


    public Lleft(String title) {
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
    graphics.drawImage(lleftImage, 85, 100);
    }
}
