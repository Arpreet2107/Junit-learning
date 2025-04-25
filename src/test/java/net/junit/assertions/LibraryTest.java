package net.junit.assertions;

import net.junit.Book;
import net.junit.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testBookAddition() {
        Library lib = new Library();
        Book b = new Book("Atomic Habits", "James Clear", 2018);
        lib.addBook(b);

        // ✅ Assert total number of books
        assertEquals(1, lib.getTotalBooks(), "Book count should be 1");

        // ✅ Assert returned book matches
        assertEquals(b, lib.getBookByTitle("Atomic Habits"), "Books should match");
    }

    @Test
    public void testBookDetails() {
        Book b = new Book("Clean Code", "Robert C. Martin", 2008);

        // ✅ Check individual fields
        assertEquals("Clean Code", b.getTitle());
        assertEquals("Robert C. Martin", b.getAuthor());
        assertEquals(2008, b.getYearPublished());
    }
}
