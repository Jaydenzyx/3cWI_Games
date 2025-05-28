package at.jayden.projects_games.test28052025.Library;

public class Roman implements Library{

    private int id;
    private String title;
    private int price;
    private String description;
    private String Genre;


    public Roman(int id, String title, int price, String description, String genre) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        Genre = genre;
    }

    @Override
    public int getid() {
        return id;
    }

    @Override
    public String gettitle() {
        return title;
    }

    @Override
    public int getprice() {
        return price;
    }

    @Override
    public String getdescription() {
        return description;
    }
}
