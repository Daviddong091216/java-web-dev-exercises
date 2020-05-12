package exercises.interview;

public class ReverseArray {
    public static void main(String[] args) {
        //method1
        int[] arr = {1, 2, 3, 4, 5};
        int[] reverseArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverseArr[arr.length - i - 1] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(reverseArr[i]);
        }
        for (int i : reverseArr) {
            System.out.println(i);
        }
        System.out.println("=================");

        //method2
        int[] arr2 = {2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2.length - i - 1 > i) {
                int num = arr2[i];
                arr2[i] = arr2[arr2.length - i - 1];
                arr2[arr2.length - i - 1] = num;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        for (int i : arr2) {
            System.out.println(i);
        }
        System.out.println("===============");

        //method3
        int[] arr3 = {3, 4, 5, 6, 7, 8};
        for (int min = 0, max = arr3.length - 1; min < max; min++, max--) {
            int temp = arr3[min];
            arr3[min] = arr3[max];
            arr3[max] = temp;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        for (int i : arr3) {
            System.out.println(i);
        }


    }
}
