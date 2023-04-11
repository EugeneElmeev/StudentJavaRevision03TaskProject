package by.itstep.javatraining.revision.task;

/*	Task 01. Chess Cage [шахматная клетка/поле]
 *
 *	Даны координаты клетки/поля шахматной доски x, y (положительные целые числа, лежащие в диапазоне от 1 до 8).
 *	Учитывая, что левое нижнее поле доски с координатами (1,1) является чёрным, определите,
 *	являются ли заданные координаты (x, y) координатами чёрной клетки/поля.
 *
 *	Формат входных данных [input]
 *	Функция принимает на вход два целочисленных значения (при корректных данных - от 1 до 8),
 *	задающие номер столбца и номер строки клетки (x, y), где x - координата по горизонтали,
 *	а y - координата по вертикали.
 *
 *	Формат выходных данных [output]
 *	Функция должна возвратить булевское значение - результат решения.
 *
 *	[ input 1]: 1 2
 *	[output 1]: false
 *
 *	[ input 2]: 1 1
 *	[output 2]: true
 */

public class Task01 {
    public static boolean task01(int x, int y) {
        if (x > 0 && y > 0 && x < 9 && y < 9) {
            return (x % 2 != 0 && y % 2 != 0 || x % 2 == 0 && y % 2 == 0);
        }
        return false;
    }
}
