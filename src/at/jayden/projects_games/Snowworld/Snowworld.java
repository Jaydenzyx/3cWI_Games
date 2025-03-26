package at.jayden.projects_games.Snowworld;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;

public class Snowworld extends BasicGame {

    private List<Actor> snowflakes;

    public Snowworld(String title) {
        super(title);
    }

    

    @Override
    public void init(org.newdawn.slick.GameContainer gameContainer) throws org.newdawn.slick.SlickException {

        this.snowflakes = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
         this.snowflakes.add(new Snowflake(Snowflake.SIZE.BIG));
            this.snowflakes.add(new Snowflake(Snowflake.SIZE.MEDIUM));
            this.snowflakes.add(new Snowflake(Snowflake.SIZE.Small));
        }

    }

    @Override
    public void update(org.newdawn.slick.GameContainer gameContainer, int delta) throws org.newdawn.slick.SlickException {

        for(Actor actor : this.snowflakes){
            actor.update(delta);
        }

    }

    @Override
    public void render(org.newdawn.slick.GameContainer gameContainer, org.newdawn.slick.Graphics graphics) throws org.newdawn.slick.SlickException {
for(Actor actor : this.snowflakes){
    actor.render(graphics);
}
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Snowworld("Snowworld"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
