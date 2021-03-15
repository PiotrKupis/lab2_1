package edu.iis.mto.bsearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private SearchResult searchResult;
    private int[] arrayOfOneElements = new int[]{1};
    private int[] arrayOfFiveElements = new int[]{1, 2, 3, 4, 5};

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void shouldFindInSequence() {
        searchResult = BinarySearch.search(1, arrayOfOneElements);
        assertTrue(searchResult.isFound());
    }

    @Test
    void shouldNotFindInSequence() {
        searchResult = BinarySearch.search(2, arrayOfOneElements);
        assertFalse(searchResult.isFound());
    }

    @Test
    void shouldBeTheFirstElement() {
        searchResult = BinarySearch.search(1, arrayOfFiveElements);
        assertEquals(1, searchResult.getPosition());
    }

    @Test
    void shouldBeTheLastElement() {
        searchResult = BinarySearch.search(5, arrayOfFiveElements);
        assertEquals(arrayOfFiveElements.length, searchResult.getPosition());
    }

    @Test
    void shouldBeTheMiddleElement() {
        searchResult = BinarySearch.search(3, arrayOfFiveElements);
        assertEquals(3, searchResult.getPosition());
    }
}
