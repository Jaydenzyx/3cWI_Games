package at.jayden.projects_games.Flappy_Bird.Images;

import org.newdawn.slick.*;

public class background extends BasicGame {

    private Image backgroundImage;

    public background() throws SlickException {
        super("Flappy Bird");
        Image tmp = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Flappy_Bird\\Images\\Background.png");
        this.backgroundImage = tmp.getScaledCopy(800, 650);
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
        graphics.drawImage(backgroundImage, 0, 0);
        }
    }

