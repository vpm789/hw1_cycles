public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
//        task5();
    }

    public static void task1() {
        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("");
        System.out.println("Задача №2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("");
        System.out.println("Задача №3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("");
        System.out.println("Задача №4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    /*public static void task5() {
        System.out.println("");
        System.out.println("Задача №5");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }*/
}