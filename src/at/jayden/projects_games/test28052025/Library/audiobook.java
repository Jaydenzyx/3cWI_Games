package at.jayden.projects_games.test28052025.Library;

public class audiobook implements Library{

    private int id;
    private String title;
    private int price;
    private String description;

    public audiobook(int id, String title, int price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
    }


    public void playsample(){
        System.out.println("Playing sample of " + title);
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
