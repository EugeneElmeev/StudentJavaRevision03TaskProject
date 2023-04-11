package by.itstep.javatraining.revision.task;

/*	Task 06. Chess & Knight [шахматный конь]
 *
 *	Шахматный конь (chess knight) ходит буквой “Г” — на две клетки по вертикали в любом направлении
 *	и на одну клетку по горизонтали, или наоборот.
 *	Даны две различные клетки шахматной доски, определите, может ли конь попасть
 *	с первой клетки на вторую одним ходом.
 *
 *	Формат входных данных [input]
 *	Функция принимает на вход четыре числа от 1 до 8 каждое (не забудьте про "защиту от дурака"),
 *	задающие номер столбца и номер строки сначала для первой клетки (x1, y1),
 *	потом для второй клетки (x2, y2).
 *
 *	Формат выходных данных [output]
 *	Функция должна возвратить булевское значение - результат решения.
 *
 *	[ input 1]: 4 4 4 5
 *	[output 1]: false
 *
 *	[ input 2]: 3 6 2 4
 *	[output 2]: true
 */

public class Task06 {
    public static boolean task06(int x1, int y1, int x2, int y2) {
        if (x1 > 0 && y1 > 0 && x1 < 9 && y1 < 9 && x2 > 0 && y2 > 0 && x2 < 9 && y2 < 9
                && x1 != x2 && y1 != y2) {
            return (x1 - x2 == -2 && y1 - y2 == -1) ||  // move 1st right 2nd up
                    (x1 - x2 == -2 && y1 - y2 == 1) ||  // move 1st right 2nd down
                    (x1 - x2 == -1 && y1 - y2 == -2) || // move 1st up 2nd right
                    (x1 - x2 == 1 && y1 - y2 == -2) ||  // move 1st up 2nd left
                    (x1 - x2 == 2 && y1 - y2 == -1) ||  // move 1st left 2nd up
                    (x1 - x2 == 2 && y1 - y2 == 1) ||   // move 1st left 2nd down
                    (x1 - x2 == 1 && y1 - y2 == 2) ||   // move 1st down 2nd left
                    (x1 - x2 == -1 && y1 - y2 == 2);    // move 1st down 2nd right
        }
        return false;
    }
}
