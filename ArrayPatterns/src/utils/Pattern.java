package utils;

public class Pattern {

    private enum Direction {
        RIGHT, LEFT, UP, DOWN
    }

    public static int[][] printFirstPattern(int lenght) {

        int[][] outputArray = new int[lenght][lenght];
        int x = 0, y = 0;

        for (int i = 0; i < Math.pow(lenght, 2); i++) {

            outputArray[x][y] = (x == 0 || x == (lenght - 1) || x == y || (x + y) == (lenght - 1)) ? 1 : 0;

            y++;

            if (y == lenght) {
                y = 0;
                x++;
            }

        }

        return outputArray;
    }

    public static int[][] printSpiralPattern(int lenght) {

        int[][] outputArray = new int[lenght][lenght];

        Direction direction = Direction.RIGHT;

        int x = 0, y = 0;

        for (int i = 1; i < Math.pow(lenght, 2) + 1; i++) {

            outputArray[x][y] = (outputArray[x][y] == 0) ? i : outputArray[x][y];

            switch (direction) {
                case DOWN:
                    x++;
                    if (x == (lenght - 1) || outputArray[x + 1][y] != 0)
                        direction = Direction.LEFT;
                    break;
                case LEFT:
                    y--;
                    if (y == 0 || outputArray[x][y - 1] != 0)
                        direction = Direction.UP;
                    break;
                case RIGHT:
                    y++;
                    if (y == (lenght - 1) || outputArray[x][y + 1] != 0) 
                        direction = Direction.DOWN;
                    break;
                case UP:
                    x--;
                    if (x == 0 || outputArray[x - 1][y] != 0) 
                        direction = Direction.RIGHT;
                    break;
                default:
                    break;

            }

        }

        return outputArray;

    }

}
