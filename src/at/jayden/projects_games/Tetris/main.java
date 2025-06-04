package at.jayden.projects_games.Tetris;


import org.newdawn.slick.AngelCodeFont;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;

public class main extends BasicGame {

    private background bg;
    private block blockimage;
    private AngelCodeFont font;
    private int Scorecount = 0;
    private Lleft lleftimage;
    private Longthing longthingimage;
    private LRight lrightimage;
    private T timage;
    private ZRight zrightimage;
    private Zleft zleftimage;
    private block block;

    public main(String title) {
        super(title);
    }

    @Override
    public void init(org.newdawn.slick.GameContainer gameContainer) throws org.newdawn.slick.SlickException {
        bg = new background();
        blockimage = new block();
        font = new AngelCodeFont("testdata/demo2.fnt", "testdata/demo2_00.tga");
        lleftimage = new Lleft();
        longthingimage = new Longthing();
        lrightimage = new LRight();
        timage = new T();
        zrightimage = new ZRight();
        zleftimage = new Zleft();
    }

    @Override
    public void update(org.newdawn.slick.GameContainer gameContainer, int delta) throws org.newdawn.slick.SlickException {
        bg.update(gameContainer, delta);
        blockimage.update(gameContainer, delta);
        lleftimage.update(gameContainer, delta);
        longthingimage.update(gameContainer, delta);
        lrightimage.update(gameContainer, delta);
        timage.update(gameContainer, delta);
        zrightimage.update(gameContainer, delta);
        zleftimage.update(gameContainer, delta);

    }

    @Override
    public void render(org.newdawn.slick.GameContainer gameContainer, org.newdawn.slick.Graphics graphics) throws org.newdawn.slick.SlickException {
        bg.render(gameContainer, graphics);
        blockimage.render(gameContainer, graphics);
        lleftimage.render(gameContainer, graphics);
        longthingimage.render(gameContainer, graphics);
        lrightimage.render(gameContainer, graphics);
        timage.render(gameContainer, graphics);
        zrightimage.render(gameContainer, graphics);
        zleftimage.render(gameContainer, graphics);

        graphics.scale(1f, 1f);
        font.drawString(570, 30, "Score: " + Scorecount, Color.white);

    }

    public static void main (String[] args) {
        try {
            org.newdawn.slick.AppGameContainer app = new org.newdawn.slick.AppGameContainer(new main("Tetris"));
            app.setDisplayMode(800, 600, false);
            app.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
