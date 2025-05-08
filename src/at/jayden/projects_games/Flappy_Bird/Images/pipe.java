package at.jayden.projects_games.Flappy_Bird.Images;

import org.newdawn.slick.*;

import java.util.Random;

public class pipe extends BasicGame {
    private Image pipeImage;
    private Image pipeImage2;
    private float x,y;
    private int width1 = 100;
    private int height1 = 300;
    private int width2 = 100;
    private int height2 = 250;
    private int pipegap;

    int miny2 = 30;
    int maxy2 = 70;



    Random random = new Random();
    int min = 350;
    int max = 400;
    int randomnumbery = random.nextInt((400-350)+1)+350;
    int randomnumbery2 = random.nextInt((maxy2-miny2)+1)+miny2;


    public pipe(String title) throws SlickException {
        super(".");
        Image tmp = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Flappy_Bird\\Images\\Pipe.png");
        Image tmp2 = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Flappy_Bird\\Images\\Pipeimage2.png");
        this.pipeImage = tmp.getScaledCopy(width1, height1);
        this.pipeImage2 = tmp2.getScaledCopy(width2, height2);
        this.x = 800;
        this.y = 0;
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.x -= 0.1f*delta;

        pipegap = randomnumbery - randomnumbery2;


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        pipeImage.draw(this.x,randomnumbery);
        pipeImage2.draw(this.x,-(randomnumbery2));

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRandomnumbery() {
        return randomnumbery;
    }

    public int getRandomnumbery2() {
        return randomnumbery2;
    }

    public int getWidth1() {
        return width1;
    }

    public int getHeight1() {
        return height1;
    }

    public int getWidth2() {
        return width2;
    }

    public int getHeight2() {
        return height2;
    }

    private boolean isScored = false;

    public boolean isScored() {
        return isScored;
    }

    public void setScored(boolean scored) {
        isScored = scored;
    }
}
