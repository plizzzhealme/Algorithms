package Recursion;

/**
 * Учусь писать рекурсии
 */
class Recursions {
    /**
     * факториал числа
     *
     * @param n целое число
     * @return факториал
     */
    public static int factorial(int n) {
        return n < 2 ? 1 : n * factorial(n - 1);
    }

    /**
     * Последовательность Фибоначчи 0,1,1,2,3,5,8,... f(n) = f(n-1) + f(n-2)
     *
     * @param n номер члена последовательности (отсчет с нуля)
     * @return его значение
     */
    public static int fibonacci(int n) {
        return n < 2 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

// --Commented out by Inspection START (27.10.2016 19:19):
//    /**
//     * StackOverflowError
//     */
//    @SuppressWarnings("InfiniteRecursion")
//    public static void recursion() {
//        recursion();
//    }
// --Commented out by Inspection STOP (27.10.2016 19:19)

    /**
     * жуст энотхер рекурсион
     *
     * @param s стринг
     * @throws InterruptedException а хз
     */
    public static void recursion(String s) throws InterruptedException {
        if (!s.isEmpty()) {
            System.out.println(s);
            Thread.sleep(500);
            recursion(s.substring(1));
            System.out.println(s);
            Thread.sleep(500);
        }
    }
}
