import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        // создание и заполнение массива c длинной 8 числами 6 8 10 12 14 16 18 20
        int[] c = new int[8];
        for (int i = 0; i < 8; i++) {
            c[i] = i * 2 + 6;
        }
        // массив x из 10 случайных чисел на [-8, 15)
        double[] x = new double[10];
        for (int i = 0; i < 10; i++) {
            x[i] = 23 * random() - 8; // [0, 1) -> [0, 23) -> [-8, 15)
        }
        // создание и заполнение двумерного массива d размером 8x10
        double[][] d = new double[8][10];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < x.length; j++) {
                d[i][j] = switch (c[i]) {
                    case 16 -> sin(tan(x[j]));
                    case 10, 14, 18, 20 -> tan(pow(pow((3 + x[j])/1/2, x[j]), (pow(2*x[j], 3) - 1) / log(abs(x[j]))));
                    default -> cbrt(log(pow(sin(pow((1 - cos(x[j]))/1/2, 3)), 2)));
                };
            }
        }
        // вывод массива с помощью for-each
        for (double[] i : d) {
            for (double j : i) {
                System.out.printf("%10.3f", j); // выравнивание по правому краю
            }
            System.out.println();
        }
    }
}