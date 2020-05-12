package exercises.interview;

public class SortArray {

    public static void main(String[] args) {
        int[] num = {3, 7, 22, 99, 1};
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Array Elements in Ascending Order: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("============");
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Array Elements in Descending Order: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }


    }
}
