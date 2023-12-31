import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2");//Объявите три массива и выведите их значения в консоль
    int [] arr = new int[] {1, 2, 3};
        for (int value = 0; value < arr.length; value++) {
            if (value == arr.length - 1) {
                System.out.println(arr[value]);
                break;
            }
            System.out.print(arr[value] + ", ");
        }
    double [] zzzz = {1.574, 7.654, 9.986};
        for (int v = 0; v < zzzz.length; v++) {
            if (v == zzzz.length - 1) {
                System.out.println(zzzz[v]);
                break;
            }
            System.out.print(zzzz[v] + ", ");
        }

    boolean[] upAndDown = {true, false, false, true, false, false };
        for (int t=0; t<upAndDown.length; t++) {
            if (t == upAndDown.length - 1) {
                System.out.println(upAndDown[t]);
                break;
            }
            System.out.print(upAndDown[t] + ", ");
        }





    }
}