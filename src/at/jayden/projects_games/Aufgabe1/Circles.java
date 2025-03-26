package at.jayden.projects_games.Aufgabe1;

import org.newdawn.slick.Graphics;

public class Circles {

    public enum DIRECTION{RIGHT,LEFT};
    private DIRECTION direction;
    private float x;
    private float y;
    private float diameter;

    public Circles (int x, int y, DIRECTION direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.diameter = 30;
    }

    public void render (Graphics graphics){


        graphics.drawOval(this.x,this.y,this.diameter,this.diameter);

    }

    public void update(int delta) {

        if(this.direction == DIRECTION.RIGHT) {
            this.x += (float)delta / 3;
        }
        else if(this.direction == DIRECTION.LEFT){
            this.x -= (float)delta / 3;
        }
        this.diameter += 0.1f;
    }


}
