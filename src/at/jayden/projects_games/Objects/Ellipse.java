package at.jayden.projects_games.Objects;

import org.newdawn.slick.Graphics;

public class Ellipse implements Actor {

    private float x,y;
    private float speed;

public Ellipse(float x, float y){
    this.x = x;
    this.y = y;
    this.speed = 5;
}

    @Override
    public void render(Graphics graphics) {

    graphics.drawOval(this.x,this.y,50,100);

    }

    @Override
    public void update(int delta) {

    if (this.y > 600 && this.x > 600){
        this.y = 0;
        this.x = 0;
    }
        this.y += (float)delta/this.speed;
        this.x += (float)delta/this.speed;
    }
}
