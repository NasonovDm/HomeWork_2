package HW_2;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        int[] eight = new int[8];
        int j = 0;
        {
            for (int i = 0; i < arr.length; i++, j = j + 3) {
                arr[i] = j;
                System.out.print(+arr[i] + " ");
            }
        }
        System.out.println();

        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int MaxW = mas.length;
        {
            for (int i = 0; i < MaxW; i++) {
                if (mas[i] < 6) mas[i] = mas[i] * 2;

                System.out.print(mas[i] + " ");
            }
        }
        System.out.println();

    }
}