package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void checkLibrary() {
        Author author = new Author("Jon", "546789", "jon.com");
        Library library = new Library();
        library.addToStock(new Article("Today's Fashin", author));
        library.addToStock(new Newspaper("Yesterdays paper"));

        Assertions.assertEquals("item is not currently on loan", library.checkInItem("Today's Fashin"));
        Assertions.assertEquals("item has been checked out", library.checkOutItem("Today's Fashin"));
        Assertions.assertEquals("newspapers are not available for loan", library.checkOutItem("Yesterdays paper"));
    }
}
