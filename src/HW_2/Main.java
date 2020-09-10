package HW_2;

public class Main {

    public static void main(String[] args) {
// 1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
// 2
        int[] eight = new int[8];
        int j = 0;
        {
            for (int i = 0; i < arr.length; i++, j = j + 3) {
                arr[i] = j;
                System.out.print(+arr[i] + " ");
            }
        }
        System.out.println();
// 3
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int MaxW = mas.length;
        {
            for (int i = 0; i < MaxW; i++) {
                if (mas[i] < 6) mas[i] = mas[i] * 2;

                System.out.print(mas[i] + " ");
            }
        }
        System.out.println();

// 4
        int[] ints = {2, 4, 6, 8, 10};
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < minVal) {
                minVal = ints[i];
            } else if (ints[i] > maxVal) {
                maxVal = ints[i];
            }
            System.out.println(minVal + " " + maxVal);
//                не пойму почему минимальное значение выводит правильно, а максимальное- остальные числа массива.

            System.out.println();

// 5
            int[][] arr = new int[3][3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                    if (i == j || i == x) arr[i][j] = 1;
                    else arr[i][j] = 0;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");


            }
        }
    }
}
//на 6 и 7 задание не хватило времени разобраться во всем самому