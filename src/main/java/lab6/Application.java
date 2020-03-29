package lab6;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину ребра куба : ");
        double cubeSide = scanner.nextDouble();

        Cube cube = new Cube(cubeSide);
        System.out.println("Об'єм куба : "+cube.GetVolume());

        System.out.println("Введіть довжину основи паралелепіпеда :");
        double c = scanner.nextDouble();
        System.out.println("Введіть ширину основи паралелепіпеда :");
        double d = scanner.nextDouble();
        System.out.println("Введіть висоту паралелепіпеда :");
        double h = scanner.nextDouble();

        RectSolid rectSolid = new RectSolid(c,d,h);
        System.out.println("Об'єм прямокутного паралелепіпеда : "+rectSolid.GetVolume());
    }
}
