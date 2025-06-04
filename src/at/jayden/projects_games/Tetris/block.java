package at.jayden.projects_games.Tetris;

import org.newdawn.slick.*;

public class block extends BasicGame {

    private Image blockImage;
    public enum DIRECTION{LEFT,RIGHT,UP,DOWN}
    private DIRECTION direction;
    private float x;
    private float y;
    private boolean keyPressed;
    private float timer;



    public block() throws SlickException {
        super("Tetris");
        Image tmp = new Image ("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Tetris\\Images\\Block.png");
        this.blockImage = tmp.getScaledCopy(280, 147);
        this.x = 75;
        this.y = -10;
    }



    public block(String title,DIRECTION direction) {
        super(title);
        this.direction = direction;

    }



    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        if (!keyPressed) {
            if (gameContainer.getInput().isKeyPressed(Input.KEY_D)) {
                this.direction = DIRECTION.RIGHT;
                System.out.println("Right");
                keyPressed = true;
            }
        }

        if (keyPressed) {
            timer += (float) delta;
            if (timer > 10) {
                keyPressed = false;
                timer = 0;
                System.out.println("Raider raiden raider wenn raider raider raiden raiden raider raider");
                this.direction = null;
            }

    }






    if(this.direction == DIRECTION.RIGHT){
        this.x = 1000;
        this.x += (float)delta/10;
    }

    }




    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
    graphics.drawImage(blockImage, this.x, this.y);
    }
}
