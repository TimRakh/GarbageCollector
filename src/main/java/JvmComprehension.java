
public class JvmComprehension {
    // ClassLoader загружает этот класс и помещает его в Metaspace

    public static void main(String[] args) {
        // В  Stack-е создается фрейм main
        int i = 1;                      // в main создаётся переменная i со значением
        Object o = new Object();        // создаётся обьект Object в куче и присвается переменной о
        Integer ii = 2;                 // создаётся обьект Integer в куче и присвается переменной ii
        printAll(o, i, ii);             // в Stack создается новый фрейм printall с переменными object o, int i, Integer ii
        System.out.println("finished"); // создается новый фрейм println куда переедаётся обьект со сыллками String со значением fiished
        //срабатывает Garbage collector
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // создаётся обьект Integer в куче и присвается переменной uselessvar
        // во фрейме printall
        System.out.println(o.toString() + i + ii);  // 6 В Stack создается фрейм println,
        // куда передаются обьекты со сыллками Object o, int i и Integer ii. В Stack созается фрейм toString.
    }
}
