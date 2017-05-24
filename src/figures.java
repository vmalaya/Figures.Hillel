import java.util.Scanner;

/**
 * Created by Валентина on 23.05.2017.
 */
public class figures {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select, what do you want to print: 1 - rectangle; 2 -  chess; 3 - envelope ");
        System.out.println("Select 4 to terminate running");
        int h;
        int w;
        int check = scanner.nextInt();
        while (true) {
            switch (check) {
                case 1:
                    System.out.println("Input height");
                    h = scanner.nextInt();
                    System.out.println("Input width");
                    w = scanner.nextInt();

                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j < w; j++) {
                            if (i == 0 || j == 0 || i == (h - 1) || j == (w - 1)) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }

                        }
                        System.out.println();

                    }
                    break;
                case 2:
                    System.out.println("Input height");
                    h = scanner.nextInt();
                    System.out.println("Input width");
                    w = scanner.nextInt();
                    int count = 0;
                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j <  w; j++) {
                            if (count % 2 == 0) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                            count++;

                        }
                        count++;
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Input height");
                    h = scanner.nextInt();
                    System.out.println("Input width");
                    w = scanner.nextInt();

                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j < w; j++) {
                            if (i == 0 || j == 0 || i == (h - 1) || j == (w - 1) || i == j || j == w - i - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }

                        }
                        System.out.println();

                    }
                    break;
                case 4: System.exit(0);
                break;
                default:
                    System.out.println("Select, what do you want to print: 1 - rectangle; 2 -  envelope; 3 - chess ");
            }
        }
    }
}
