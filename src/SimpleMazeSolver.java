import java.util.*;

public class SimpleMazeSolver {

    // Символы для отображения лабиринта
    static final char WALL = '#';
    static final char PATH = ' ';
    static final char START = 'S';
    static final char EXIT = 'E';
    static final char VISITED = '.';

    // Размеры лабиринта
    static final int ROWS = 11;
    static final int COLS = 21;

    static char[][] maze = new char[ROWS][COLS];

    // Заполнение лабиринта стенами
    static void createMaze() {
        for (int i = 0; i < ROWS; i++) {
            Arrays.fill(maze[i], WALL);
        }
    }

    public static void main(String[] args) {
        // Лабиринт еще не генерируется, просто заполняется стенами
        createMaze();
    }
}
