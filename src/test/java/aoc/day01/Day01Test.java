package aoc.day01;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test {

    @Test
    public void testPart1() throws IOException {
        // Given
        String input = Files.readString(Path.of("src/main/resources/testDay01.txt"));

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals(11, Integer.valueOf(result));
    }

    @Test
    public void testPart2() throws IOException {
        // Given
        String input = Files.readString(Path.of("src/main/resources/testDay01.txt"));

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals(31, Integer.valueOf(result));
    }
}
