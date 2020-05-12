package exercises.interview;

public class GetMax {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 9, 2, 55, 22, 7, 99};
        int max = getMax(array);
        System.out.println(max);

    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
