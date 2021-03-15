package edu.iis.mto.bsearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
