package edu.iis.mto.bsearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    SearchResult searchResult;

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void shouldFindInSequence() {
        searchResult = BinarySearch.search(1, new int[]{1});
        assertTrue(searchResult.isFound());
    }

    @Test
    void shouldNotFindInSequence() {
        searchResult = BinarySearch.search(2, new int[]{1});
        assertFalse(searchResult.isFound());
    }

    @Test
    void shouldBeTheFirstElement() {
        searchResult = BinarySearch.search(1, new int[]{1,2,3,4});
        assertEquals(1,searchResult.getPosition());
    }
}
