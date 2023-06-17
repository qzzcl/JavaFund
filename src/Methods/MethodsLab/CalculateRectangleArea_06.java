package Methods.MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = calcArea(width,length);
        System.out.println(area);

    }
    private static int calcArea (int width, int length){
        int area = width * length;
        return area;
    }
}
