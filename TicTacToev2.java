
import java.util.Random;
import java.util.Scanner;

class TicTacToev2 {
    //поля. имена инициал-ных полей большими буквами
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    //ссылочные переменные
    char [] [] table;
    Random random;
    Scanner scanner;

    //мэйн должен быть статическим
    public static void main (String[] args) {
       //после выполнения директивы new создается объект
        new TicTacToev2().game();
    }
    //конструктор - это особенный метод, имя которого совпадает с именем класса
    //после создания объекта конструктора всегда стартует автоматически
    //конструктор использют. как правило. для инициализации данных
    TicTacToev2() {
        table = new char[3] [3];
        random = new Random();
        //создаем объект сканера, а в качестве параметра указываем источник, откуда будут читаться данные
        //(из потока ввода в консоль)
        scanner = new Scanner(System.in);
    }
    //методы
    //метод game вызывает не у класса. а у объекта
    void game () {
        //метод game, содержащий игровую логику
        //инициализация таблицы
        //бесконечный цикл while
        initTable ();
        while (true) {
            printTable();
            //ход человека
            turnHuman();
            //проверка: победа? нужен параметр
            if (isWin(SIGN_X)) {
                System.out.println("YOU WIN");
                break;
            }
            //проверка ничьей
            if (isTableFull() ) {
                System.out.println("SORRY, DRAW");
                break;
            }
            //ход компьютера
            turnAi();
            //проверка: победа? нужен параметр
            if (isWin(SIGN_O)) {
                System.out.println("AI WIN");
                break;
            }
            //проверка ничьей
            if (isTableFull()) {
                System.out.println("SORRY, DRAW");
                break;
            }
        }
        printTable();
    }
    //имя метода. как правило. начинается с глагола
    //прописываем методы. в данном случае (initTable) он пустой
    //инициализация таблицы с помощью вложеннного метода
    //initTable - метод. заполняющий поле нужными значениями
    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }
    //метод. выводящий состояние таблицы
    void printTable () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[j][i] + " ");
            }
            System.out.println();
        }
    }
    //метод. обеспечивающий ход человека. метод. который ничего не возвращает
    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter [1...3] x y: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            //проверка валидности ячейки
        } while (!isCellValid(x,y));
        table[x][y] = SIGN_X;
    }
  
    void turnAi () {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while(!isCellValid(x,y));
        table[x][y] = SIGN_O;
    }

    //метод isCellValid
    boolean isCellValid (int x, int y) {
        if (x < 0 || x  > 2 || y < 0 || y > 2) {
            return false;
        }
        return table[x][y] == SIGN_EMPTY;
    }
    //процедура проверки, методы возвращающие что-то
    //как правило,все, что возвращет bool значение начинается с is
    //в данном случае мы передаем параметр-значок. которым ходит человек
    boolean isWin(char ch) {
        for (int i = 0; i < 3; i++) {
            if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) ||
                    table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)
                return true;
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) ||
            table[0][i] == ch && table[1][i] == ch && table[2][i] == ch)
                return true;
        }
        return false;
    }

    //ситуация, в которой все ячейки заполнены
    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
