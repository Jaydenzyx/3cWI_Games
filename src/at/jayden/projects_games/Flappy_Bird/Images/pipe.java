package at.jayden.projects_games.Flappy_Bird.Images;

import org.newdawn.slick.*;

public class pipe extends BasicGame {
    private Image pipeImage;

    public pipe(String title) throws SlickException {
        super(".");
        Image tmp = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Flappy_Bird\\Images\\Pipe.png");
        this.pipeImage = tmp.getScaledCopy(100, 150);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        pipeImage.draw(600,500);

    }
}
