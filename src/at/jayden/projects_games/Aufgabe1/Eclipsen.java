package at.jayden.projects_games.Aufgabe1;

import org.newdawn.slick.Graphics;

public class Eclipsen {


    private enum DIRECTION{RIGHT,LEFT,UP,DOWN};
    private float x;
    private float y;
    private float speed;

    public Eclipsen (int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void render (Graphics graphics){


        graphics.drawOval(this.x,this.y,50,30);

    }

    public void update(int delta) {

        this.x += (float) (delta / this.speed);

    }

}
