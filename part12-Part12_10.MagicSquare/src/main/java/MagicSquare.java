
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {

        ArrayList<Integer> array = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            int sumRow = 0;
            for (int column = 0; column < square[row].length; column++) {
                sumRow += square[row][column];
            }
            array.add(sumRow);
        }

        return array;
    }

    public ArrayList<Integer> sumsOfColumns() {

        ArrayList<Integer> array = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            int sumCol = 0;
            for (int column = 0; column < square[row].length; column++) {
                sumCol += square[column][row];
            }
            array.add(sumCol);
        }

        return array;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> array = new ArrayList<>();
        int sumD = 0;
        int sumD1 = 0;
        for (int row = 0; row < square.length; row++) {
            
            for (int column = 0; column < square[row].length; column++) {
                if (row == column) {
                    sumD += square[row][column];
                }
                if ((row + column) == (square[row].length - 1)) {
                    sumD1 += square[row][column];
                }
            }
        }
        array.add(sumD);
        array.add(sumD1);

        return array;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
