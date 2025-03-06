package at.jayden.projects_games.firstgame;

import org.newdawn.slick.*;

public class Rectangles extends BasicGame {
    public Rectangles(String title) {
        super(title);
    }

    private float x;
    private float y;
    private float speed;

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    this.x = 100;
    this.speed = 10.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
    this.x += (float) delta/this.speed;
    this.y ++;



    if(this.x > 800){
        this.x = 0;
        this.y = 0;
    }else if(this.y>800){
        this.y = 0;
    }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
        graphics.drawString("Hello",130,130);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
