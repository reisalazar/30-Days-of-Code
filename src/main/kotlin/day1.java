import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {

        int i =4;
        double d =4.0;
        String s ="HackerRank ";

        Scanner sc = new Scanner(System.in);

        int numInt = sc.nextInt();
        double numDouble = sc.nextDouble();
        sc.nextLine();
        String string = sc.nextLine();


        int sumInt = numInt + i;
        double sumDouble = d + numDouble;

        System.out.println(sumInt);
        System.out.println(sumDouble);
        System.out.println(s + string);

        sc.close();
    }
}