package aoc.day02;

import aoc.Day;
import aoc.Utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day02 implements Day {

  @Override
  public String part1(String input) {
    List<String> lines = Utils.splitLines(input);

    int numberOfSafeReports = lines.size();
    for (String line : lines) {
      int[] report = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

      if (report[0] > report[1]) {
        for (int i = 1; i < report.length; i++) {
          int a = report[i-1];
          int b = report[i];

          if (a <= b) {
            numberOfSafeReports--;
            break;
          }
          if (Math.abs(a - b) > 3) {
            numberOfSafeReports--;
            break;
          }
        }
      } else if (report[0] < report[1]) {
        for (int i = 1; i < report.length; i++) {
          int a = report[i-1];
          int b = report[i];

          if (a >= b) {
            numberOfSafeReports--;
            break;
          }
          if (Math.abs(a - b) > 3) {
            numberOfSafeReports--;
            break;
          }
        }
      } else {
        numberOfSafeReports--;
      }
    }

    return String.valueOf(numberOfSafeReports);
  }

  @Override
  public String part2(String input) {
    List<String> lines = Utils.splitLines(input);

    int numberOfSafeReports = lines.size();
    for (String line : lines) {
      List<Integer> report = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).boxed().toList();

      int problemDampener = 0;
      int index = 0;
      if (report.get(0).equals(report.get(1))) {
        index++;
        problemDampener++;
      }

      if (report.get(index) > report.get(index+1)) {
        for (int i = index+1; i < report.size() - 1; i++) {
          int a = report.get(i-1);
          int b = report.get(i);
          int c = report.get(i+1);

          if (a <= b) {
            if (a <= c) {
              numberOfSafeReports--;
              break;
            }
            problemDampener++;
            continue;
          }
          if (Math.abs(a - b) > 3) {
            if (Math.abs(a - c) > 3) {
              numberOfSafeReports--;
              break;
            }
            problemDampener++;
          }
        }
      } else if (report.get(index) < report.get(index+1)) {
        for (int i = index+1; i < report.size() - 1; i++) {
          int a = report.get(i-1);
          int b = report.get(i);
          int c = report.get(i+1);

          if (a >= b) {
            if (a >= c) {
              numberOfSafeReports--;
              break;
            }
            problemDampener++;
            continue;
          }
          if (Math.abs(a - b) > 3) {
            if (Math.abs(a - c) > 3) {
              numberOfSafeReports--;
              break;
            }
            problemDampener++;
          }
        }
      }
      if (problemDampener > 1) {
        numberOfSafeReports--;
      }
    }

    return String.valueOf(numberOfSafeReports);
  }

}
