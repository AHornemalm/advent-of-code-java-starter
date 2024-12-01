package aoc.day01;

import aoc.Day;
import aoc.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Day01 implements Day {

    @Override
    public String part1(String input) {
      List<String> lines = Utils.splitLines(input);

      ArrayList<Integer> leftSide = new ArrayList<>(), rightSide = new ArrayList<>();
      for (String loc : lines) {
        var x = loc.split(" {3}");
        leftSide.add(Integer.valueOf(x[0]));
        rightSide.add(Integer.valueOf(x[1]));
      }

      leftSide.sort(Integer::compareTo);
      rightSide.sort(Integer::compareTo);

      int totalDistance = 0;
      for (int i = 0; i < leftSide.size(); i++) {
        totalDistance += Math.abs(leftSide.get(i) - rightSide.get(i));
      }

      return String.valueOf(totalDistance);
    }

    @Override
    public String part2(String input) {
      List<String> lines = Utils.splitLines(input);

      ArrayList<Integer> leftSide = new ArrayList<>(), rightSide = new ArrayList<>();
      for (String loc : lines) {
        var x = loc.split(" {3}");
        leftSide.add(Integer.valueOf(x[0]));
        rightSide.add(Integer.valueOf(x[1]));
      }

      int similarityScore = 0;
      for (Integer value : leftSide) {
        int occurence = 0;
        for (Integer integer : rightSide) {
          if (value.equals(integer)) {
            occurence++;
          }
        }
        similarityScore += value * occurence;
      }

    return String.valueOf(similarityScore);
    }

}
