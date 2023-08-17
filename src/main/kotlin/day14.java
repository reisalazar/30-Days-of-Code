import java.util.Arrays;
import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int[] array = Arrays.stream(elements).sorted().toArray();
        int max = array[array.length - 1];
        int min = array[0];
        maximumDifference = max - min;
    }
}

class Solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}