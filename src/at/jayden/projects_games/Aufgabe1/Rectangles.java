package at.jayden.projects_games.Aufgabe1;

import org.newdawn.slick.Graphics;

public class Rectangles {

    public enum DIRECTION{RIGHT,LEFT};
    private DIRECTION direction;
    private float x;
    private float y;

    public Rectangles(int x, int y, DIRECTION direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;


    }

    public void render (Graphics graphics){


        graphics.drawRect(this.x,this.y,10,10);

    }

    public void update(int delta) {

        if(this.direction == DIRECTION.RIGHT) {
            this.x += (float)delta / 10;
        }
        else if(this.direction == DIRECTION.LEFT){
            this.x -= (float)delta / 10;
        }

    }
}
