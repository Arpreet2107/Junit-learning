package net.junit;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.yearPublished = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getAuthor() {
        return author;
    }

    // Overriding equals for assertEquals to work with objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return this.title.equals(other.title) &&
                this.author.equals(other.author) &&
                this.yearPublished == other.yearPublished;
    }
}
