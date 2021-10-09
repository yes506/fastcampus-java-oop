package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<String>());


    @Test
    void test() {
        // Given
        List<String> list = new ArrayList<>(Arrays.asList("3", "2", "1"));

        // When
        List<String> actual = sut.doSort(list);

        // Then
        assertEquals(List.of("1", "2", "3"), actual);
    }
}