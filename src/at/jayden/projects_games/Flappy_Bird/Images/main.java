package at.jayden.projects_games.Flappy_Bird.Images;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class main extends BasicGame {
    private background bg;
    private List<pipe> pipes;
    private int pipespawntimer;
    private bird b;
    private AngelCodeFont font;
    private int Scoreboardcount = 0;
    private boolean isPaused = false;

    public main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        bg = new background();
        b = new bird();
        pipes = new ArrayList<>();
        pipespawntimer = 0;
        font = new AngelCodeFont("testdata/demo2.fnt","testdata/demo2_00.tga");
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if(isPaused) {
            return;
        }

        bg.update(gameContainer, delta);

        if (b.getY() < 0 || b.getY() > 600) {
            System.out.println("Collision detected!");
            gameContainer.exit();
        }


        pipespawntimer += delta;
        if (pipespawntimer >= 3000) {
            pipes.add(new pipe("."));
            pipespawntimer = 0;
        }

        for (int i = 0; i < pipes.size(); i++) {
            pipe p = pipes.get(i);
            p.update(gameContainer, delta);

            if (p.getX() < -100) {
                pipes.remove(i);
                i--;
            }

            int upperPipeEndY = p.getHeight2() - p.getRandomnumbery2();
            int lowerPipeStartY = p.getRandomnumbery();
            int pad = 16;

            boolean horiz = b.getX() + b.getWidth() - pad > p.getX() + pad
                    && b.getX() + pad < p.getX() + p.getWidth1() - pad;
            boolean hitTop = b.getY() + pad < upperPipeEndY;
            boolean hitBottom = b.getY() + b.getHeight() - pad > lowerPipeStartY;

            if (horiz && (hitTop || hitBottom)) {
                gameContainer.exit();
                System.out.println("Collision detected!");
            }


            boolean scoreboardhoriz = b.getX() > p.getX() + p.getWidth1();
            if (scoreboardhoriz && !p.isScored()) {
                Scoreboardcount++;
                p.setScored(true);
                System.out.println("Score: " + Scoreboardcount);
            }
        }

        if(Scoreboardcount == 100){
            isPaused = true;
        }

        b.update(gameContainer, delta);


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


        graphics.scale(0.75f, 0.75f);
        font.drawString(875, 5, "Scoreboard:" + Scoreboardcount , Color.white);

        if(Scoreboardcount == 100){
            graphics.scale(1.5f, 1.5f);
            font.drawString(285 , 200, "You win!", Color.white);
        }

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
