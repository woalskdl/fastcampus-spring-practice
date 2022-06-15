package com.fastcampus.spring.practice.service;

import com.fastcampus.spring.practice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sort = new SortService(new JavaSort<>());

    @Test
    void test() {
        // Given

        // When
        List<String> actual = sort.doSort(List.of("3", "2", "1"));

        // Then
        assertEquals(List.of("1","2","3"), actual);
    }

}