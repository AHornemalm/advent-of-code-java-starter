package day03;

import aoc.day02.Day02;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day03Test {

  @Test
  public void testPart1() throws IOException {
    // Given
    String input = Files.readString(Path.of("src/main/resources/testDay02.txt"));

    // When
    String result = new Day02().part1(input);

    // Then
    assertEquals(2, Integer.valueOf(result));
  }

  @Test
  public void testPart2() throws IOException {
    // Given
    String input = Files.readString(Path.of("src/main/resources/testDay02.txt"));

    // When
    String result = new Day02().part2(input);

    // Then
    assertEquals(5, Integer.valueOf(result));
  }
}
