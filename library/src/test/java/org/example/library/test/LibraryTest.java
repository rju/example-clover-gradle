package org.example.library.test;

import org.example.library.Library;
import org.junit.Assert;
import org.junit.Test;

public class LibraryTest {

    @Test
    public void test() {
        final Library l = new Library();

        Assert.assertEquals("Value should be 5", l.getValue(), 5);
    }

}
