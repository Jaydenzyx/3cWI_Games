package at.jayden.projects_games.Objects;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Objects extends BasicGame {
    public Objects(String title) {
        super(title);
    }

    private float ox ;
    private float oy ;
    private float cx ;
    private float cy;
    private float rx;
    private float ry;
    private int Right ;
    private int Left ;
    private int Up ;
    private int Down ;
    private int ovaldirection;
    private int circledirection;
    private int Rectdirection;



    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.ox = 0;
        this.oy = 0;
        this.cx = 0;
        this.cy = 100;
        this.rx = 600;
        this.ry = 400;
        this.Right = 10;
        this.Left = 9;
        this.Up = 8;
        this.Down = 7;
        this.ovaldirection = 10;
        this.circledirection = 7;
        this.Rectdirection = 9;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {




        if(this.ovaldirection == Right) {
            this.ox += (float) delta / 2;
            if (this.ox > 700) {
                this.ovaldirection = Left;
            }
        }
        if (this.ovaldirection == Left) {
            this.ox -= (float) delta / 2;
            if (this.ox < 0) {
                this.ovaldirection = Right;
            }
        }

        if(this.circledirection == Down){
            this.cy += (float) delta/2;
            if(this.cy > 500){
                this.circledirection = Up;
            }
        }
        if (this.circledirection == Up){
            this.cy -= (float) delta/2;
            if(this.cy < 100){
                this.circledirection = Down;
            }
        }

        if(this.Rectdirection == Left){
            this.rx -= (float) delta/2;
            if(this.rx < 100){
                this.Rectdirection = Up;
            }
        }
        if(this.Rectdirection == Up){
            this.ry -= (float) delta/2;
            if(this.ry < 100){
                this.Rectdirection = Right;
            }
        }
        if (this.Rectdirection == Right){
            this.rx += (float) delta/2;
            if(this.rx > 600){
                this.Rectdirection = Down;
            }
        }

        if(this.Rectdirection == Down){
            this.ry += (float) delta/2;
            if(this.ry > 400){
                this.Rectdirection = Left;
            }
        }



    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        graphics.drawOval(this.ox,this.oy,100,40);
        graphics.drawOval(this.cx,this.cy,50,50);
        graphics.drawRect(this.rx,this.ry,50,50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Objects("Objects"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
