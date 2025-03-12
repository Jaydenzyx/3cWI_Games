package at.jayden.projects_games.Objects;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor{
    private float x;
    private float y;
    private float diameter;
    private float speed;

    public Circle(){

        Random random = new Random();
        this.x = random.nextInt(650);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameter = random.nextInt(10) + 10;

    }

    public void render (Graphics graphics){

        graphics.drawOval(this.x,this.y,diameter,diameter);
    }

    public void update(int delta){

        this.x += (float) (delta/this.speed);
        if(this.x > 600){
            this.x = 0;
        }
    }

}
