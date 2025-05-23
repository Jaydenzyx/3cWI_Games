package at.jayden.projects_games.Objects;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Rectangle implements Actor{

    private enum DIRECTION{RIGHT,LEFT,UP,DOWN};
    private float x;
    private float y;
    private float speed;

    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render (Graphics graphics){

        graphics.drawRect(this.x,this.y,100,100);
    }

    public void update(GameContainer gamecontainer, int delta){

        this.x += (float) (delta/this.speed);
        if(this.x > 600){
            this.x = 0;
        }
    }

}
