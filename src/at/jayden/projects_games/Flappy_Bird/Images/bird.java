package at.jayden.projects_games.Flappy_Bird.Images;

import org.newdawn.slick.*;

public class bird extends BasicGame {

    private Image Bird;
    private float x,y;
    private float velocity;
    private float gravity = 0.001f;
    private boolean isJumping = false;
    private int widht = 70;
    private int height = 70;

    public bird() throws SlickException {
        super("Flappy Bird");
        Image tmp = new Image("C:\\Users\\Acer\\OneDrive - HTL Dornbirn\\SWP_1\\Games\\src\\at\\jayden\\projects_games\\Flappy_Bird\\Images\\Bird.png");
        this.Bird = tmp.getScaledCopy(widht, height);
        this.y = 100;
        this.x = 100;
        this.velocity = 0.45f;
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.y += this.velocity;
        this.velocity += this.gravity;

        if(this.isJumping) {
            System.out.println("Jumping");
            this.velocity = -0.35f;
            this.isJumping = false;
        }

    }



    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        Bird.draw(this.x,this.y);

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public boolean isJumping() {
        return isJumping;
    }

    public void setJumping(boolean jumping) {
        isJumping = jumping;
    }

    public Image getBird() {
        return Bird;
    }

    public int getWidht() {
        return widht;
    }

    public int getHeight() {
        return height;
    }
}
