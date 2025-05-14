package at.jayden.projects_games.test.Products;

import java.awt.*;

public class Turnschuhe implements Product{

    private Color color;
    private int id;
    private String title;


    public Turnschuhe(Color color, int id, String title) {
        this.color = color;
        this.id = id;
        this.title = title;
    }

    @Override
    public int getid() {
        return this.id;
    }

    @Override
    public String gettitle() {
        return this.title;
    }
}
