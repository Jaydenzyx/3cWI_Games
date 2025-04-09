package at.jayden.projects_games.Flappy_Bird.Images;

import org.newdawn.slick.*;

public class main extends BasicGame {
    private background bg;
    private pipe p;
    private bird b;

    public main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        bg = new background();
        p = new pipe(".");
        b = new bird();
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {


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
        p.render(gameContainer, graphics);
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
