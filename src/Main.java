//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    greetings();
    checkSign(10,2,4);
    checkSign(-10, 5, -2);
    selectColor(6);
    selectColor(12);
    selectColor(25);
    compareNumbers(5,10);
    compareNumbers(32, 6);
    addOrSubtractAndPrint(10,5,true);
    addOrSubtractAndPrint(20,6,false);

    }

    public static void greetings() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Hello, World, from, Java");
        }
    }
    public static void checkSign(int a, int b, int c) {
        int sum = a+b+c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if ((data > 10) && (data <=20)){
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment = true) {
            System.out.println(initValue+delta);
        } else {
            System.out.println(initValue-delta);
        }
    }
}