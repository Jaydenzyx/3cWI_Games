package at.jayden.projects_games.Flappy_Bird.Images;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class main extends BasicGame {
    private background bg;
    private List<pipe> pipes;
    private int pipespawntimer;
    private bird b;

    public main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        bg = new background();
        b = new bird();
        pipes = new ArrayList<>();
        pipespawntimer = 0;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        bg.update(gameContainer,delta);


        pipespawntimer += delta;
        if(pipespawntimer >= 3000){
            pipes.add(new pipe("."));
            pipespawntimer = 0;
        }

        for(int i = 0; i < pipes.size(); i++){
            pipe p = pipes.get(i);
            p.update(gameContainer,delta);

            if(p.getX() < -100){
                pipes.remove(i);
                i--;
            }

        }




        b.update(gameContainer,delta);


    }

    @Override
    public void keyPressed(int key, char c) {
        if (key == Input.KEY_SPACE) {
            b.setJumping(true);
        }
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        bg.render(gameContainer, graphics);
        for (pipe p : pipes) {
            p.render(gameContainer, graphics);
        }
        b.render(gameContainer, graphics);
    }


    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new main("Flappy Bird"));
            app.setDisplayMode(800, 600, false);
            app.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
