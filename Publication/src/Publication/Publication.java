package Publication;

import java.time.LocalDate;

public class Publication {
    private static int nextId = 1;

    private int id;
    private String title;
    private double price;
    private LocalDate publishDate;
    private int ratings;

    public Publication(String title, double price, LocalDate publishDate, int ratings) {
        this.id = nextId++;
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public int getRatings() {
        return ratings;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Price: " + price + " INR, Publish Date: " + publishDate + ", Ratings: " + ratings;
    }
}
