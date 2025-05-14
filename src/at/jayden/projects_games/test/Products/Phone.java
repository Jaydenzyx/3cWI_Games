package at.jayden.projects_games.test.Products;

public class Phone implements Product{

    private int id;
    private String title;


    public Phone(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public int getid() {
        return id;
    }

    @Override
    public String gettitle() {
        return title;
    }

    public void call() {
        System.out.println("Calling...");
    }

}
