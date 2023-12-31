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

        System.out.println("   ");
        System.out.println("Задача 3");//Выведите в консоль значения массивов в обратном порядке
        for (int value = 2; value >= 0; value--) {
            if (value == 0) {
                System.out.println(arr[value]);
                break;
            }
            System.out.print(arr[value] + ", ");
        }
        for (int v = 2; v >=0; v--) {
            if (v == 0) {
                System.out.println(zzzz[v]);
                break;
            }
            System.out.print(zzzz[v] + ", ");
        }
        for (int t=5; t>=0; t--) {
            if (t == 0) {
                System.out.println(upAndDown[t]);
                break;
            }
            System.out.print(upAndDown[t] + ", ");
        }

        System.out.println("   ");
        System.out.println("Задача 4");//Преобразуйте нечетные значения целочисленного массива в четные и выведите в консоль
        for (int d = 0; d < arr.length; d++) {
            if (arr[d]%2 != 0) {
                arr[d]++;
                if (d == arr.length - 1) {
                    System.out.print(arr[d]);
                    break;
                }
            }
            System.out.print(arr[d] + ", ");
        }
    }
}