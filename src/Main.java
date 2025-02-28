import service.PrintService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        Integer x = (Integer) ps.first();
        ps.print();
        System.out.println("First " + x);


        sc.close();
    }
}