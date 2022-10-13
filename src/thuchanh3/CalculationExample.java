package thuchanh3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap X");
        int x = scanner.nextInt();
        System.out.println("hay nhap Y");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }
    private void calculate(int x,int y){
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("tong x+y = "+a);
            System.out.println("tong x-y = "+b);
            System.out.println("tong x*y = "+c);
            System.out.println("tong x/y = "+d);
        }catch (Exception e){
            System.err.println("xay ra ngoai le "+e.getMessage());
        }
    }
}
