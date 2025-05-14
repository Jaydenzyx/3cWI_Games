package at.jayden.projects_games.test.GUIs;

import at.jayden.projects_games.test.Products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI1 implements GUI{

    Scanner scanner = new Scanner(System.in);

    List<Product> products = new ArrayList<>();



    @Override
    public void start() {
    while(true){

        System.out.println("1 Show all products");
        int selection = scanner.nextInt();

        if (selection == 1){
            for(Product product : this.products){
                System.out.println(product.gettitle());
            }
        }

    }
    }


    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }
}
