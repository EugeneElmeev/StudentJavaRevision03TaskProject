package by.itstep.javatraining.revision.task;

/*	Task 07. Chess & Queen [шахматный ферзь]
 *
 *	Шахматный ферзь (chess queen) ходит по диагонали, горизонтали или вертикали.
 *	Даны две различные клетки шахматной доски, определите,
 *	может ли ферзь попасть с первой клетки на вторую одним ходом.
 *
 *	Формат входных данных [input]
 *	Функция принимает на вход четыре числа от 1 до 8 каждое (не забудьте про "защиту от дурака"),
 *	задающие номер столбца и номер строки сначала для первой клетки (x1, y1),
 *	потом для второй клетки (x2, y2).
 *
 *	Формат выходных данных [output]
 *	Функция должна возвратить булевское значение - результат решения.
 *
 *	[ input 1]: 4 4 5 5
 *	[output 1]: true
 *
 *	[ input 2]: 4 4 5 8
 *	[output 2]: false
 */

public class Task07 {
    public static boolean task07(int x1, int y1, int x2, int y2) {
        if ((x1 > 0 && y1 > 0 && x1 < 9 && y1 < 9 && x2 > 0 && y2 > 0 && x2 < 9 && y2 < 9)) {
            return (x1 == x2 && y1 < y2) ||  // move vertically forward
                    (x1 == x2 && y1 > y2) || // move vertically back
                    (x1 > x2 && y1 == y2) || // move horizontally left
                    (x1 < x2 && y1 == y2) ||// move horizontally right
                    (x1 - y1 == x2 - y2 && y1!=y2) ||// move right diagonal
                    (x1 + y1 == x2 + y2 && x1!=x2); // move left diagonal
        }
        return false;
    }
}
