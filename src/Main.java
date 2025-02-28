import service.PrintService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        String x = ps.first();
        ps.print();
        System.out.println("First: " + x);


        sc.close();
    }
}