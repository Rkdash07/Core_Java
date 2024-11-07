package day9;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int test= scanner.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scanner.nextInt();
            int Sum = 0;
            for (int i = 1; i <= n; i++) {
                Sum += i;
            }
            System.out.println(Sum);
        }

	}

}
